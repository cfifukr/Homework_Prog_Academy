import java.io.File;
public class Main {
    public static void main(String[] args) {


        //task1
        System.out.println("TASK 1\n");
        Human hum1 = new Human("Vlad", "Abcd", Gender.Male);
        Human hum2 = new Human("Vlad", "Abcd", Gender.Male);
        Human hum3 = new Human("Vlad", "Vladyslav", Gender.Female);
        System.out.println(hum1.equals(hum2));
        System.out.println(hum1.equals(hum3));
        System.out.println(" ");


        Student st1 = new Student("Vlad", "Abcd", Gender.Male, 111, "A");
        Student st2 = new Student("Vlad", "Abcd", Gender.Male, 111, "A");
        Student st3 = new Student("Vlad", "Abcd", Gender.Male, 111, "C");
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(" ");



        Group A = new Group("A");
        Group B = new Group("A");
        Group C = new Group("A");
        A.createdDefaultGroup(A);
        B.createdDefaultGroup(B);
        C.createdDefaultGroup(C);

        System.out.println(A.equals(B) + " -  B before name changing   " + B);
        B.setGroupName("B");
        System.out.println(A.equals(B) + " -  B after name changing    " + B);
        System.out.println(" ");
        System.out.println(A.equals(C) + " -  C before changing   " + C);


        C.removeStudentByID(666);
        try {
            C.addStudent(st3);
        }catch (GroupOverflowException e){
            System.out.println("Overflow");
        }

        System.out.println(A.equals(C) + " -  C after changing   " + C);





        //task2
        System.out.println("\n \n \nTASK 2 \n ");

        Student test1 = new Student("John", "Snow", Gender.Male, 555, "D");
        Student test2 = new Student("Theon", "Greyjoy", Gender.Female, 111, "D");
        Group D = new Group("D");
        D.createdDefaultGroup(D);
        System.out.println(D.sameStrudentsInGroup() + "  -  Without dupliction\n");




        try {
            D.removeStudentByID(666);
            D.removeStudentByID(555);
            D.removeStudentByID(111);
            D.removeStudentByID(333);
            D.addStudent(test1);
            D.addStudent(test1);
            D.addStudent(test2);
            D.addStudent(test2);

        }catch (GroupOverflowException e){
            System.out.println(e);
        }

        System.out.println(D.sameStrudentsInGroup() + "  -  With dupliction");




    }
}