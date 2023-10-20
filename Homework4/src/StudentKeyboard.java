import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentKeyboard {

    public StudentKeyboard(){
        super();
    }
    public static boolean isStringOnlyAlphabet(String str){
        return ((!str.equals("")) && (str != null) && (str.matches("^[a-zA-Z]*$")));
    }
    public  boolean createObjectStudentFromKeyboard(Group group){
        String name = null;
        String lastName = null;
        String gender = null;
        String group_name = group.getGroupName();
        Gender genderEnum = null;
        Student a = null;

        int id = 0;



        Scanner scanner = new Scanner(System.in);

        // NAME INPUT
        System.out.println("Print student name(only string)");
        boolean nameCheck = false;
        while (nameCheck == false) {
            name = scanner.nextLine();
            if (isStringOnlyAlphabet(name)){
                nameCheck = true;
            }else{
                System.out.println("Wrong input. Try again");
            }

        }
        // LAST NAME INPUT
        System.out.println("Print student's last name(only string)");
        boolean lastNameCheck = false;
        while (lastNameCheck == false) {
            lastName = scanner.nextLine();
            if (isStringOnlyAlphabet(lastName)){
                lastNameCheck = true;
            }else{
                System.out.println("Wrong input. Try again");
            }

        }

        //GENDER INPUT
        System.out.println("Print student's gender(Male/Female)");
        boolean genderCheck = false;
        while (genderCheck == false) {
            gender = scanner.nextLine();
            if (gender.toLowerCase().compareTo("male") == 0 || gender.toLowerCase().compareTo("female") == 0){
                if (gender.toLowerCase().compareTo("male") == 0){
                    genderEnum = Gender.Male;
                } else {
                    genderEnum = Gender.Female;
                }
                genderCheck = true;
            }else{
                System.out.println("Wrong input.");
            }

        }


        // ID INPUT
        System.out.println("Print student's id(only integer)");
        boolean check = false;

        while (check == false) {
            try {
                id = scanner.nextInt();
                check = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input.");
                scanner.next();
            }
        }



        a = new Student(name, lastName, genderEnum, id, group_name);

        try {
            group.addStudent(a);
            System.out.println("Successfully added");
            return true;
        }catch (GroupOverflowException e){
            System.out.println("Group is already full");
            return false;
        }



    }

    public Student findStudentSurnameFromKeyboard(Group group){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print students surname");
        String surname = scanner.nextLine();


        try{
            return (group.findStudentByLastName(surname));
        }catch (StudentNotFoundException e){
            System.out.println("There isnt such a student");
            return null ;
        }


    }


}

