import java.io.File;
public class TaskTwo {

    public static void main(String[] args){
        File fileToSave = new File("FileToSaveDictionary.svc");
        File fileToGetDict = new File("FileToGetDictionaryFrom.svc");
        Dictionary dict = new Dictionary();
        Dictionary dict2 = new Dictionary();
        dict.addDefaultWords();


        OperationsWithFiles.saveDictToSVCFile(fileToSave, dict);
        OperationsWithFiles.addWordsToDictFromSVC(fileToGetDict, dict2);

        System.out.println(dict2);

    }
}
