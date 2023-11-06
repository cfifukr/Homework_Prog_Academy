import java.io.File;
import java.io.FileReader;
import java.util.*;

public class TaskOne {
    public static void main(String[] args) {


        File file = new File("/Users/malchikmac/Desktop/folder/Homework Prog_Academy/homework10/TextTaskOne.txt");
        HashMap<Character, Integer> res = new CharsCounter().charactersFromFileCounter(file);

        CharsCounter.printMapByValue(res);



    }
}