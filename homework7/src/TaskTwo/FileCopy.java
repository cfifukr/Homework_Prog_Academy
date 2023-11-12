package TaskTwo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopy implements Runnable, ProgressCallback {
    private static final int BUFFER_SIZE = 1024;
    private File sourceFile;
    private File destFile;
    private long totalSize;


    public FileCopy(File sourceFile, File destFile) {
        this.sourceFile = sourceFile;
        this.destFile = destFile;
        this.totalSize = sourceFile.length();

    }


    @Override
    public void run() {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            long copiedSize = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                copiedSize += bytesRead;

                onProgressUpdate(copiedSize, totalSize);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}