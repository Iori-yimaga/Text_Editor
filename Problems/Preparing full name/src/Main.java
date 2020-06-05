import java.util.Scanner;

public class Main {

    public static String prepareFullName(String firstName, String lastName) {
        // write your code here
        String name = "";
        if(firstName==null && lastName==null){
            name = "";
        }else if(firstName==null && lastName!=null){
            name = lastName;
        }else if(lastName==null && firstName!=null){
            name = firstName;
        }else {
            name = firstName + " " + lastName;
        }
        return name;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}