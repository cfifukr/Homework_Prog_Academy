import java.util.Random;
public class RandomArray {
    int arrayLength = 1000000;
    int[] randomNumbersArray = new int[arrayLength];
    Random random = new Random();

    public void addIntArray(int maxValue){
        for (int i = 0; i < arrayLength; i++) {
            randomNumbersArray[i] = random.nextInt(maxValue);

        }

    }

    public int getArrayLength() {
        return arrayLength;
    }

    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public int[] getRandomNumbersArray() {
        return randomNumbersArray;
    }

    public void setRandomNumbersArray(int[] randomNumbersArray) {
        this.randomNumbersArray = randomNumbersArray;
    }
}


