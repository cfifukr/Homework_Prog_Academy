import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){


        File folderIn = new File("/Users/malchikmac/Desktop/hw5_test");
        File folderOut = new File("Check");
        folderOut.mkdirs();



        try {
            System.out.println(FilesActions.copyFolder(folderIn, folderOut, ".docx"));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
