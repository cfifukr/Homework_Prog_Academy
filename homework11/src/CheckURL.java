import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.*;

public class CheckURL {
    public static boolean checkURLFromString(String line){
        try {
            URL url = new URL(line);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            return false;
        }



    }

    public static void CheckURLsFromFile(File file){
        String line;
        try(BufferedReader bf = new BufferedReader(new FileReader(file))){
            for(;;){
                if((line = bf.readLine()) == null){
                    break;
                }

                if (checkURLFromString(line)){
                    System.out.println(line + "  -  is working URL");
                }else{
                    System.out.println(line + " is NOT working URL");
                }


            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
