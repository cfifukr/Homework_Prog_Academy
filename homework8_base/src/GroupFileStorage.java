import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.NoSuchElementException;

public class GroupFileStorage {

    public static String getFileNameWithoutExtension(String filename) {
        return filename.substring(0, filename.lastIndexOf("."));
    }
    public void saveGroupToSVC(Group group){
        try {
            File svcFile = new File(group.getGroupName());
            FileWriter fileWriter = new FileWriter(svcFile + ".svc");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            CSVStringConverter svc = new CSVStringConverter();

            for(int i = 0; i < group.getStudents().length; i++){

                bufferedWriter.write(svc.toStringRepresentation(group.getStudents()[i]));
                bufferedWriter.newLine();

            }


            bufferedWriter.close();

            System.out.println("SVC file created and data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public Group loadGroupFromSVC(File file){
        Group group = new Group(getFileNameWithoutExtension(file.getName()));

        CSVStringConverter svc = new CSVStringConverter();
        try {

            String line;
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);



            while ((line = bufferedReader.readLine()) != null) {


                try{
                    group.addStudent(svc.fromStringRepresentation(line));

                }catch(GroupOverflowException e){
                    System.out.println("Group is overflowed");
                }

            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }catch (NoSuchElementException e) {
            System.out.println("Group is not full");
        }


        return group;

    }



    public File findFileByGroupName(String groupName, File workFolder){
        String fileName;

        File[] filesArray = workFolder.listFiles();

        for(int i = 0; i < filesArray.length; i++){
            fileName = getFileNameWithoutExtension(filesArray[i].getName());
            if(filesArray[i].isFile() && fileName.compareTo(groupName) == 0 ){
                return filesArray[i];

            }

        }

        return null;







        }
}
