import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class FilesActions {

    public static String getExtension(String filename) {
        return filename.substring(filename.lastIndexOf("."));
    }

    public static long copyFile(File in, File out) throws IOException{

        try(InputStream is = new FileInputStream(in);
            OutputStream os = new FileOutputStream(out)) {

            return is.transferTo(os);

        }
    }
    public static long copyFolder(File folderIn, File folderOut, String extension) throws IOException{

        File[] filesArray = folderIn.listFiles();
        long filesCopy = 0;

        for(int i = 0; i < filesArray.length; i++){
            if(filesArray[i].isFile() && getExtension(filesArray[i].getName()).compareTo(extension) == 0) {
                File out = new File(folderOut, filesArray[i].getName());
                copyFile(filesArray[i], out);
                filesCopy += 1;

            }

        }

            return filesCopy;





    }



}
