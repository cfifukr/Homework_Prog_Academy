import java.math.BigInteger;

public class Factorial implements Runnable{
    private int number;

    public Factorial(int number) {
        super();
        this.number = number;
    }



    public BigInteger factorialCalculate(int n){
        BigInteger fact = BigInteger.ONE;
        for(int i = 1; i <= n; i++ ){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    @Override
    public void run() {
        long ThreadId = Thread.currentThread().getId();
        BigInteger result = factorialCalculate(number);
        System.out.println("Thread#"+ ThreadId +" : "+"Factorial " + number + " = " + result);


    }
}
