
import java.io.File;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Stack<Human> stack = new Stack();

        stack.push(new Human("Vladyslav", "Dryk", Gender.Male));
        stack.push(new Student("Doesnt ", "Matter", Gender.Female, 222, "C"));
        stack.push(new Human("Anastasia", "Shevchenko", Gender.Female));
        stack.push(new Student("Just", "Example", Gender.Male, 111, "A"));

        //stack.push(new File("text.txt"));
        //stack.push(new Date());

        for(Human i : stack){
            System.out.println(i);
        }

    }
}
