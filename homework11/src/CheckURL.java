import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class CheckURL {
    public static void CheckURLsFromFile(File file){
        String line;
        try(BufferedReader bf = new BufferedReader(new FileReader(file))){
            for(;;){
                if((line = bf.readLine()) == null){
                    break;
                }

                URL url = new URL(line);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("HEAD");
                int codeResponse = 0;
                try{
                     codeResponse = connection.getResponseCode();

                }catch (UnknownHostException e){}

                if (codeResponse == HttpURLConnection.HTTP_OK) {
                    System.out.println(line + "  -  working URL. Code = " + codeResponse);
                } else {
                    System.out.println(line + "  -  NOT working URL. Code of error = " + codeResponse);
                }


            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
