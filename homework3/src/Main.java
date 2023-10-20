
public class Main {
    public static void main(String[] args) {




        Student Vladyslav = new Student("Vladyslav", "Dryk", Gender.Male, 555, "SZ-381B");
        Student Anastasiya = new Student("Anastasiya", "Shevchenko", Gender.Female, 111, "SZ-381B");
        Student Volodymyr = new Student("Volodymyr", "Neshevchenko", Gender.Male, 222, "SZ-381B");
        Student Oleksandr = new Student("Oleksandr", "Boiko", Gender.Male, 333, "SZ-381B");
        Student Natalia = new Student("Natalia", "Ivanenko", Gender.Female, 444, "SZ-381B");
        Student Ariana = new Student("Ariana", "Kovalenko", Gender.Female, 666, "SZ-381B");
        Student Valeriy = new Student("Valeriy", "Badora", Gender.Male, 7676, "SZ-381B");
        Student Dmytro = new Student("Dmytro", "Baginskyi", Gender.Male, 777, "SZ-381B");
        Student Olga = new Student("Olga", "Ivanysko", Gender.Female, 888, "SZ-381B");
        Student Inna = new Student("Inna", "Symonenko", Gender.Female, 999, "SZ-381B");
        Student Ivan = new Student("Ivan", "Borovih", Gender.Male, 1010, "SZ-381B");
        Student ExtraStudent = new Student("ExtraStudent", "ExtraStudent", Gender.Male, 1011, "SZ-381B");

        Group CZ381 = new Group("CZ381");



        try {
            CZ381.addStudent(Anastasiya);//1
            CZ381.addStudent(Vladyslav);//2
            CZ381.addStudent(Oleksandr);//3
            CZ381.addStudent(Natalia);//4
            CZ381.addStudent(Ariana);//5
            CZ381.addStudent(Valeriy);//6
            CZ381.addStudent(Dmytro);//7
            CZ381.addStudent(Olga);//8
            CZ381.addStudent(Inna);//9
            //CZ381.addStudent(Ivan);//10
            //CZ381.addStudent(ExtaStudent);

        }catch(GroupOverflowException e){
            System.out.println("Group is full");

        }
        System.out.println(CZ381);


        try {
            System.out.println(CZ381.findStudentByLastName("Borovih"));
            System.out.println(CZ381.findStudentByLastName("Shevchenko"));
            System.out.println(CZ381.removeStudentByID(111));
            System.out.println(CZ381.removeStudentByID(325));


        }catch(StudentNotFoundException e){
            System.out.println(e);

        }
        System.out.println(CZ381);


        System.out.println(CZ381);
    }
}