public class Main {
    public static void main(String[] args){
        Stack stack = new Stack();

        stack.push(new Human("Vladyslav", "Dryk", Gender.Male));
        stack.push(new Student("Doesnt ", "Matter", Gender.Female, 222, "C"));
        stack.push(new Human("Anastasia", "Shevchenko", Gender.Female));
        stack.push(new Student("Just", "Example", Gender.Male, 111, "A"));

        System.out.println(stack + " \n\n");

        System.out.println(stack.pop()+ " \n");
        System.out.println(stack+ " \n\n");

        System.out.println(stack.peek()+ " \n");
        System.out.println(stack );

    }
}
