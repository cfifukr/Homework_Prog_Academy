import java.math.BigInteger;

public class SumArrayElements implements Runnable {
    private int[] array;
    private int numberPart = 0;
    private int startIndex;
    private int endIndex;
    private static int totalSum = 0;

    public SumArrayElements(int[] array, int numberPart) {
        this.array = array;
        this.numberPart = numberPart;
        this.startIndex = (numberPart-1) * array.length /4;
        this.endIndex = numberPart * array.length/4;

    }

    @Override
    public void run() {
        int partialSum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            partialSum += array[i];
        }
        addToTotalSum(partialSum);
    }

    private synchronized void addToTotalSum(int partialSum) {
        totalSum += partialSum;
    }

    public static int getTotalSum() {
        return totalSum;
    }
}

