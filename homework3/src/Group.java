import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
public class Group {

    private String groupName;
    private Student[] students;


    public Group(String groupName) {
        this.groupName = groupName;
        this.students = new Student[10];
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
            if (students[i].getLastName().equals(lastName)){

                return students[i];
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




    @Override
    public String toString() {


        return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
    }
}

