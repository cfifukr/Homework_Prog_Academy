
public class Main {
    public static void main(String[] args) {
        // TASK1
        Thread[] threadArray = new Thread[101];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new Thread(new Factorial(i));
        }


        for (int i = 0; i < threadArray.length; i++){
            threadArray[i].start();
            try{
                threadArray[i].join();
            }catch (InterruptedException e) {
                System.out.println("Time gone");
            }

        }



        //TASK2
        RandomArray rand = new RandomArray();
        rand.addIntArray(20);;
        int sum = 0;
        int[] array = rand.getRandomNumbersArray();
        int numThreads = 4;


        Thread[] threads = new Thread[numThreads];

        for (int i = 1; i <= numThreads; i++) {
            Runnable sumTask = new SumArrayElements(array, i);
            threads[i-1] = new Thread(sumTask);
            threads[i-1].start();
        }


        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = SumArrayElements.getTotalSum();
        System.out.println("Сумма элементов массива (4 потока): " + totalSum);



        //default way

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Сумма элементов массива(обычный метод): " + sum);

    }



}