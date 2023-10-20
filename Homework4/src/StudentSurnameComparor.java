import java.util.Comparator;

public class StudentSurnameComparor implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;


        String surname1 = student1.getLastName();
        String surname2 = student2.getLastName();

        if ( surname1.compareTo(surname2) > 0 ){
            return 1;
        }
        if ( surname1.compareTo(surname2) < 0 ){
            return -1;
        }
        return 0;


    }
}
