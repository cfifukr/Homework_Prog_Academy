package TaskThree;

public class TaskThree {
    public static void main(String[] args){

        String fileNameToSearchA = "aaaainput.docx";
        String fileNameToSearchB = "aaaoutput.docx";
        String fileNameToSearchC = "aaagit views.py";
        String fileNameToSearchD = "main.java";

        String searchDirectory = "/Users/malchikmac/Desktop";

        Thread searchThreadA = new Thread(new FileSearch(fileNameToSearchA, searchDirectory));
        Thread searchThreadB = new Thread(new FileSearch(fileNameToSearchB, searchDirectory));
        Thread searchThreadC = new Thread(new FileSearch(fileNameToSearchC, searchDirectory));
        Thread searchThreadD = new Thread(new FileSearch(fileNameToSearchC, searchDirectory));

        searchThreadA.start();
        searchThreadB.start();
        searchThreadC.start();
        searchThreadD.start();


    }

}
