package TaskThree;

import java.io.File;

public class FileSearch implements Runnable {

    private String fileName;
    private String directory;

    public FileSearch(String fileName, String directory) {
        this.fileName = fileName;
        this.directory = directory;
    }

    @Override
    public void run() {
        searchFile(new File(directory));
    }


    private void searchFile(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {

                    searchFile(file);
                } else if (file.getName().equals(fileName)) {

                    System.out.println(file.getAbsolutePath() + " Thread  ---   " + Thread.currentThread());
                }
            }
        }
    }
}
