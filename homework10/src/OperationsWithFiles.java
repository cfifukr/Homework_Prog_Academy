import java.io.*;
import java.util.*;

public class OperationsWithFiles {

    public static String toSVC(String eng, List<String> ukr){
        String result = eng;
        for(String i : ukr){
            result += "," + i;
        }
        return result;
    }

    public static List<String> fromSVC(String svcString){
        Scanner sc = new Scanner(svcString);
        List<String> result = new ArrayList<>();
        String word;
        sc.useDelimiter(",");
        try {
            while ((word = sc.next()) != null) {
                result.add(word);
            }
        } catch(NoSuchElementException e){}

        System.out.println(result);
        return result;
    }

    public static void saveDictToSVCFile(File file, Dictionary dict){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            List<Map.Entry<String, List<String>>> list = new ArrayList<>(dict.getDictionary().entrySet());
            for (Map.Entry<String, List<String>> entry : list) {
                bufferedWriter.write(toSVC(entry.getKey(), entry.getValue()));

                bufferedWriter.newLine();
            }
        }catch(IOException e ){
            System.out.println(e);
        }


    }

    public static void addWordsToDictFromSVC(File file, Dictionary dict){
        String line;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            while((line = bufferedReader.readLine()) != null){
                List<String> list = fromSVC(line);
                for(int i = 1; i<list.size(); i++){
                    dict.addWordToDictionary(list.get(0), list.get(i));
                }

            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
