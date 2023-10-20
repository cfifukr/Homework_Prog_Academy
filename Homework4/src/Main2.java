import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {


        Group CZ381 = new Group("CZ381");

        Student Vlad = new Student("Vladyslav", "Dryk", Gender.Male, 111, "CZ381");

        CSVStringConverter test1 = new CSVStringConverter();
        CSVStringConverter test2 = new CSVStringConverter();
        System.out.println(test1.toStringRepresentation(Vlad));
        System.out.println(test2.fromStringRepresentation(test1.toStringRepresentation(Vlad)));
















    }
}