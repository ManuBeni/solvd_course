import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;


public class WordCounter {
    public static void writeToFile(String path,String text) throws IOException {

        File file=new File(path);
        FileUtils.writeStringToFile(file,text,"utf-8");

    }
    public static void countToFile(String path) throws IOException {

        Map<String, Integer> counter = new HashMap<String, Integer>();

        File file = new File(path);

        String text = FileUtils.readFileToString(file, "utf-8");

        text = text.toLowerCase().replaceAll("\\.|,|;", " ");

        String[] words = text.split("( |\t|\n|\r)+");

        for (String word : words) {
            counter.merge(word, 1, (oldValue, value) -> oldValue + 1);
        }

        FileUtils.writeStringToFile(new File("uniqueWords.txt"),
                counter.toString().replaceAll(",","\n"),"utf-8");
    }
}
