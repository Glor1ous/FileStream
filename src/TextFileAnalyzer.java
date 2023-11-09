
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileAnalyzer {
    public static void main(String[] args) {
        String filePath = "D:\\Student\\mdk02\\untitled11\\Новый текстовый документ1.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                int charCount = line.length();
                String[] words = line.split("\\s+");
                int wordCount = words.length;

                System.out.println("Строка " + lineCount + ":");
                System.out.println("Количество символов: " + charCount);
                System.out.println("Количество слов: " + wordCount);
                System.out.println();
            }

            System.out.println("Общее количество строк в файле: " + lineCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}