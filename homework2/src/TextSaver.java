import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class TextSaver {
    private TextTransformer transformer;
    private File file;

    public TextSaver(TextTransformer transformer, File file) {
        this.transformer = transformer;
        this.file = file;
    }
    public TextSaver(){
        super();
    }

    public void saveTextToFile(String text) {
        String transformedText = transformer.stringTransform(text);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(transformedText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}