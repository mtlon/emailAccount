import java.util.Locale;
import java.util.Scanner;

public class Email {
    protected String name;
    protected String surname;
    protected String department;

    public Email(String name,String surname){
        this.name = name;
        this.surname = surname;
        System.out.println("Email to: " + name + " " + surname);
    }

    public void department(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose your department: ");
        System.out.println("1. Sales department");
        System.out.println("2. Development department");
        System.out.println("3. Accounting department");
        System.out.println("4. none and leave");
        int choice = scanner.nextInt();
        boolean carryOn = true;

        switch (choice) {
            case 1 -> {
                System.out.println("Your dep: sales");
                this.department = "sales";
            }
            case 2 -> {
                System.out.println("Your dep: develop");
                this.department = "develop";
            }
            case 3 -> {
                System.out.println("Your dep: account");
                this.department = "account";
            }
            case 4 -> carryOn = false;
        }
    }

    public String password(int length) {
        String aplha = "ABCDEFGHIJKLMNOPRSTUWYZabcdefghijklmnoprstuwyz";
        StringBuilder s = new StringBuilder(length);

        for(int i = 0; i < length; i++){
            int ch = (int) (Math.random() * aplha.length());
            s.append(aplha.charAt(ch));
        }
        return "Your password is: " + s.toString();
    }

    public void email(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your email is: " +
                this.name.toLowerCase() + "." +
                this.surname.toLowerCase() + "@" +
                this.department + ".pl");
    }
}
