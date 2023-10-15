import java.io.File;

public class Main_task2 {
    public static void main(String[] args){


        TextTransformer test1 = new TextTransformer();
        System.out.println(test1.stringTransform("hello world"));

        InverseTransformer test2 = new InverseTransformer();
        System.out.println(test2.stringTransform("There is nothing we can do @Napoleon"));

        UpDownTransformer test3 = new UpDownTransformer();
        System.out.println(test3.stringTransform("aaaaaaaaaaa BBBBBBBBBBB @#$@$"));

        File result_file = new File("result_file");
        TextSaver textSaverUpDown = new TextSaver(test3, result_file);
        String text = "Hello World  bbbb nnnn";

        textSaverUpDown.saveTextToFile(text);


    }

}