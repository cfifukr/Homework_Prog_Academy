import java.io.File;

public class Main {
    public static void main(String[] args) {


        Group a = new Group("A_Group");
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


        try{
            a.addStudents(Vladyslav, Anastasiya, Volodymyr, Oleksandr, Natalia, Valeriy, Ariana, Dmytro, Ivan, Olga);
            a.addStudents(ExtraStudent);
        }catch (GroupOverflowException e){
            System.out.println(e);
        }
        System.out.println(a.getGroupSize());
        System.out.println(a);


        GroupFileStorage.saveGroupToSVC(a);







    }
}