import java.util.Scanner;
public class CSVStringConverter implements StringConverter{


    @Override
    public Student fromStringRepresentation(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useDelimiter(",");

        String name = scanner.next();
        String lastName = scanner.next();
        Gender gender = Gender.valueOf(scanner.next());
        int id = Integer.valueOf(scanner.next());

        String group = scanner.next();

        return new Student(name, lastName, gender,id , group);
    }

    @Override
    public String toStringRepresentation(Student student) {
        return  student.getName() + "," + student.getLastName() + "," + student.getGender().toString() + "," + student.getId() + "," + student.getGroupName();
    }


}
