package TaskTwo;


public interface ProgressCallback {
    default void onProgressUpdate(long copiedSize, long totalSize){
            double progress = (double) copiedSize / totalSize * 100;


        System.out.printf("Progress: %.2f%%\n", progress);
        if (copiedSize == totalSize) {
            System.out.println("Copying complete.");
        }



    }
}
