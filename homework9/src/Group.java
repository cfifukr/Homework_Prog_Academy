import java.util.*;

public class Group {

    private String groupName;
    List<Student> studentsList;


    public Group(String groupName) {
        this.groupName = groupName;
        this.studentsList = new ArrayList<>(10);
    }

    public List<Student> getStudents() {
        return studentsList;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupSize(){
        return studentsList.size();
    }

    public void addStudents(Student ... students) throws GroupOverflowException {

        for(Student i : students){
            if(studentsList.size() < 10){
                i.setGroupName(this.getGroupName());
                studentsList.add(i);
                System.out.println("Added - " + i.getName() + " " + i.getLastName() + ".  Students in the group - " + studentsList.size());
            } else{
                throw new GroupOverflowException("Group is already full, cannot add more students.");
            }

        }

    }

    public Student findStudentByLastName(String lastName) throws StudentNotFoundException{
        for(Student student : studentsList) if (student.getLastName().compareTo(lastName) == 0) return student;
        throw new StudentNotFoundException("There isn't such a student");
    }
    public Student findStudentByID(int id) throws StudentNotFoundException{
        for(Student student : studentsList) if (student.getId() == id) return student;
        throw new StudentNotFoundException("There isn't such a student");
    }

    public boolean removeStudentByID(int id){
        try {
            studentsList.remove(this.findStudentByID(id));
            return true;
        } catch(StudentNotFoundException e){
            return false;
        }
    }

    public boolean  sameStrudentsInGroup(){
        int counter =0;
        for (int i = 0; i < studentsList.size() ; i++) {
            for (int k = i+1; k < studentsList.size(); k++){
                if (studentsList.get(i).equals(studentsList.get(k))){
                    System.out.println("Dublicated student - " + studentsList.get(i).getName() +
                            " "+ studentsList.get(i).getLastName() +
                            " " + studentsList.get(i).getId());
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
        return Objects.equals(groupName, group.groupName) && Objects.equals(studentsList, group.studentsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, studentsList);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", studentsList=" + studentsList +
                '}';
    }
}

