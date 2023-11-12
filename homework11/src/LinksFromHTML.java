import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;


public class LinksFromHTML {


        public static List<String> getStringFromURL(String spec, String code) throws IOException{
            List<String> links = new ArrayList<>();
            URL url = new URL(spec);
            URLConnection connection = url.openConnection();
            try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), code))){
                for(;;){
                    String temp = bufferedReader.readLine();
                    if(temp == null){
                        break;
                    }
                    if(temp.contains("href")){
                        int startIndex = temp.indexOf("href") + 6;
                        int endIndex = temp.indexOf('"', startIndex);
                        if (startIndex != -1 && endIndex != -1) {
                            String line = temp.substring(startIndex, endIndex);
                            if(CheckURL.checkURLFromString(line)) {
                                if (links.contains(line) == false) {
                                    links.add(line);
                                }
                            }
                        }

                    }

                }
            }
            return links;

        }
}
