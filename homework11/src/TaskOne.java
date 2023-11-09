import java.io.IOException;
import java.util.List;

public class TaskOne {
    public static void main(String[] args){

        try {
            List<String> test = LinksFromHTML.getStringFromURL("https://prog.academy", "UTF-8");
            for(String i: test){
                System.out.println(i);
            }

            System.out.println();

            List<String> test2 = LinksFromHTML.getStringFromURL("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwirrofSoreCAxWUBwYAHZaNAsgYABAAGgJ3cw&gclid=EAIaIQobChMIq66H0qK3ggMVlAcGAB2WjQLIEAAYASAAEgK82vD_BwE&ohost=www.google.com&cid=CAASJeRocgL4DCHJP7yrW0f9UAebPfbQiniJdKLr3t3yLjMDGq4fJJ0&sig=AOD64_2yKICQswhLv3mU7lqDohaDYDMmHg&q&adurl&ved=2ahUKEwjwg__RoreCAxXMxIsKHRXFA1kQ0Qx6BAgHEAE&nis=8", "UTF-8");
            for(String i: test2){
                System.out.println(i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
