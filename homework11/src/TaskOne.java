import java.awt.*;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

public class TaskOne {
    public static void main(String[] args){

        try {
            System.out.println("TEST 1 Site -  GREENFOREST - https://greenforest.com.ua"   );
            List<String> test = LinksFromHTML.getStringFromURL("https://greenforest.com.ua", "UTF-8");
            for(String i: test){
                System.out.println(i);
            }

            System.out.println("TEST 2 Site -  DOU.UA - https://dou.ua"   );
            List<String> test2 = LinksFromHTML.getStringFromURL("https://dou.ua", "UTF-8");
            for(String i: test2){
                System.out.println(i);
            }
        }catch (IOException e){
            System.out.println(e);
        }









    }
}
