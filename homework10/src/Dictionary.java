import java.util.*;

public class Dictionary {
    HashMap<String, List<String>> dictionary = new HashMap<>();


    public HashMap<String, List<String>> getDictionary() {
        return dictionary;
    }
    public void setDictionary(HashMap<String, List<String>> dictionary) {
        this.dictionary = dictionary;
    }
    public void addWordToDictionary(String eng, String ukr){
        dictionary.computeIfAbsent(eng, k -> new ArrayList<>()).add(ukr);

    }
    public void addWordToDictionaryKeyboard(){
        String eng;
        String ukr;
        Scanner sc = new Scanner(System.in);


        System.out.println("Input english word");
        eng = sc.nextLine();
        System.out.println("Input ukrainian meaning of this word");
        ukr = sc.nextLine();


        this.addWordToDictionary(eng, ukr);

        System.out.println("Added successfully");


    }
    public void addDefaultWords(){
        this.addWordToDictionary("Phone", "Телефон");
        this.addWordToDictionary("Phone", "Телефонувати");
        this.addWordToDictionary("Mean", "Грубий");
        this.addWordToDictionary("Mean", "Означати");
        this.addWordToDictionary("Pillow", "Подушка");
    }


    @Override
    public String toString() {
        return "Dictionary{" + dictionary +
                '}';
    }
}
