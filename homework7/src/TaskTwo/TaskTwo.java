package TaskTwo;

import java.io.File;


public class TaskTwo {

    public static void main(String[] args) {
        File inputFile = new File("/Users/malchikmac/Desktop/folder/Homework Prog_Academy/homework7/src/TaskTwo/input.docx");
        File outputFile = new File("/Users/malchikmac/Desktop/folder/Homework Prog_Academy/homework7/src/TaskTwo/output.docx");


        Thread copyThread = new Thread(new FileCopy(inputFile, outputFile));
        copyThread.start();

        try {

            copyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
