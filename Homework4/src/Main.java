import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String action = null;
        int counter = 0;
        boolean check = true;
        Group CZ381 = new Group("CZ381");


        StudentKeyboard student1 = new StudentKeyboard();

        while(true){
            System.out.println("Add student - command 'ADD' or 'A'\nFind student - command 'FIND' or 'F'");

            action = scanner.nextLine();

            if (action.toUpperCase().compareTo("ADD") == 0 || action.toUpperCase().compareTo("A")== 0) {
                try {
                    System.out.println("how many students do u wanna add?");
                    counter = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("ONLY INTEGER VALUE\nrestart the program");


                }
                for (int i = 0; i < counter; i++) {
                    check = student1.createObjectStudentFromKeyboard(CZ381);
                    if(check == false){
                        break;
                    }
                }
                System.out.println(CZ381);
            }
            else if (action.toUpperCase().compareTo("FIND") == 0 || action.toUpperCase().compareTo("F")== 0){
                System.out.println(student1.findStudentSurnameFromKeyboard(CZ381));
            }else{
                System.out.println("Unknown command. Try again");
            }




        }












    }
}