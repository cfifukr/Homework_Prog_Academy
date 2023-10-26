import java.io.File;
public class Main {
    public static void main(String[] args) {
        Group CZ381 = new Group("CZ-381B");
        CZ381.createdDefaultGroup(CZ381);

        GroupFileStorage svc = new GroupFileStorage();


        //task1
        svc.saveGroupToSVC(CZ381);
        System.out.println("task1");
        System.out.println(CZ381);


        //task2
        File file = new File("/Users/malchikmac/Desktop/folder/Homework Prog_Academy/homework5.2_Base/AI-401.svc");
        System.out.println("task2");
        System.out.println(svc.loadGroupFromSVC(file));

        //task3
        File folder = new File("/Users/malchikmac/Desktop/folder/Homework Prog_Academy/homework5.2_Base");
        System.out.println("task3");
        System.out.println(svc.findFileByGroupName("AI-401", folder));



    }
}