import java.util.Arrays;

public class Stack {
    private Object[] stackArray;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 16;
    private final int MAX_SIZE = Integer.MAX_VALUE - 1 ;

    public int size(){
        return size;
    }

    public Stack(){
        stackArray = new Object[DEFAULT_CAPACITY];
        capacity = stackArray.length;
        size = 0;
    }

    public void push(Object obj){
        if(size >= capacity){
            boolean resize = resizeUp();
            if(!resize){
                throw new RuntimeException("Can`t add element");
            }
        }
        stackArray[size] = obj;
        size += 1;
    }

    public Object pop(){
        if(size == 0) return null;
        size -= 1;

        Object result = stackArray[size];
        stackArray[size] = null;
        return result;

    }
    public Object peek(){
        if(size == 0) return null;
        return  stackArray[size -1];

    }

    public  boolean resizeUp(){
        if(capacity >= MAX_SIZE) return false;

        long capacityNew = (capacity * 3L) / 2L + 1L;

        if(capacityNew < MAX_SIZE){
            int capacityInt = (int) capacityNew;
            stackArray = Arrays.copyOf(stackArray, capacityInt);
            capacity = capacityInt;
            return true;
        }return false;
    }

    public void cutArrayLength(){
        stackArray = Arrays.copyOf(stackArray, size);
        capacity = stackArray.length;
    }

    public void clear(){
        stackArray = new Object[DEFAULT_CAPACITY];
        capacity = stackArray.length;
        size = 0;
    }

    @Override
    public String toString() {
        String result = "[";
        for (Object i : stackArray){
            if(i == null) break;
            result +=  i + "\n";
        }
        return result + "]";
    }
}
