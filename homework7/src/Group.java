import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Objects;

public class Group {

    private String groupName;
    private Student[] students;


    public Group(String groupName) {
        this.groupName = groupName;
        this.students = new Student[10];
    }

    public Student[] getStudents() {
        return students;
    }

    public void createdDefaultGroup(Group group){

        Student Vladyslav = new Student("Vladyslav", "Dryk", Gender.Male, 555, "SZ-381B");
        Student Anastasiya = new Student("Anastasiya", "Shevchenko", Gender.Female, 111, "SZ-381B");
        Student Oleksandr = new Student("Oleksandr", "Boiko", Gender.Male, 333, "SZ-381B");
        Student Natalia = new Student("Natalia", "Ivanenko", Gender.Female, 444, "SZ-381B");
        Student Ariana = new Student("Ariana", "Kovalenko", Gender.Female, 666, "SZ-381B");
        Student Valeriy = new Student("Valeriy", "Badora", Gender.Male, 7676, "SZ-381B");
        Student Dmytro = new Student("Dmytro", "Baginskyi", Gender.Male, 777, "SZ-381B");
        Student Olga = new Student("Olga", "Ivanysko", Gender.Female, 888, "SZ-381B");
        Student Inna = new Student("Inna", "Symonenko", Gender.Female, 999, "SZ-381B");
        Student Ivan = new Student("Ivan", "Borovih", Gender.Male, 1010, "SZ-381B");
        Student ExtraStudent = new Student("ExtraStudent", "ExtraStudent", Gender.Male, 1011, "SZ-381B");




        try {
            group.addStudent(Anastasiya);//1
            group.addStudent(Vladyslav);//2
            group.addStudent(Oleksandr);//3
            group.addStudent(Natalia);//4
            group.addStudent(Ariana);//5
            group.addStudent(Valeriy);//6
            group.addStudent(Dmytro);//7
            group.addStudent(Olga);//8
            group.addStudent(Inna);//9
            group.addStudent(Ivan);//10

        }catch(GroupOverflowException e){
            System.out.println("Group is full");

        }

    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
        throw new GroupOverflowException("Group is already full, cannot add more students.");
    }

    public Student findStudentByLastName(String lastName) throws StudentNotFoundException{
        for(int i = 0; i < students.length; i++){
            if(students[i] != null) {
                if (students[i].getLastName().equals(lastName)) {

                    return students[i];
                }
            }
        }
        throw new StudentNotFoundException("There isn't such a student");
    }
    public Student findStudentByID(int id) throws StudentNotFoundException{
        for(int i = 0; i < students.length; i++){
            if (students[i] != null){
                if (students[i].getId() == id) {

                    return students[i];
                }
            }
        }
        throw new StudentNotFoundException("There isn't such a student");
    }

    public boolean removeStudentByID(int id){

        try {
            this.findStudentByID(id);
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    if (students[i].getId() == id) {

                        students[i] = null;

                    }
                }
            }
            return true;
        } catch(StudentNotFoundException e){
            return false;

        }


    }


    public boolean  sameStrudentsInGroup(){
        int counter =0;
        for (int i = 0; i < students.length ; i++) {
            for (int k = i+1; k < students.length; k++){
                if (students[i].equals(students[k])){
                    System.out.println("Dublicated student - " + students[i].getName() +
                            " "+ students[i].getLastName() +
                            " " + students[i].getId());
                    counter += 1;

                }


            }
        }
        if (counter > 0){
            return true;
        }else {
            return false;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(groupName, group.groupName) && Arrays.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(groupName);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }

    @Override
    public String toString() {


        return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
    }
}

