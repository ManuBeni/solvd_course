import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String s = "This is a test, this should give me the quantity of unique words in the file, as long as there is some.";
        WordCounter.writeToFile("text.txt",s);
        WordCounter.countToFile("text.txt");
    }
}
