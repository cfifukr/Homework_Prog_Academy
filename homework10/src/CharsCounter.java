import java.io.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class CharsCounter {

    public HashMap charactersFromFileCounter(File file){
        HashMap<Character, Integer> stat = new HashMap<>();
        try {
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            while ((line = bufferedReader.readLine()) != null) {
                char[] ch = line.toCharArray();
                for (char i : ch) {
                    if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')) {
                        stat.put(i, stat.getOrDefault(i, 0) + 1);
                    }
                }

            }

            bufferedReader.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }catch (NullPointerException e) {
            System.out.println(e);
        }

        return stat;
    }


    public static void printMapByValue(HashMap hashMap){

        List<Entry<Character, Integer>> list = new ArrayList<>(hashMap.entrySet());


        Collections.sort(list, new Comparator<Entry<Character, Integer>>() {
            @Override
            public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Entry<Character, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}
