package Home_Task_14_data;

import java.io.*;

public class CopyFiles {

    public static void copyContentFile(String originalFile, String nameNewFail) {
        try (
                BufferedReader x1 = new BufferedReader(new FileReader(originalFile));
                BufferedWriter x2 = new BufferedWriter(new FileWriter(new File(nameNewFail)));) {
            String s;
            while ((s = x1.readLine()) != null) {
                x2.write(s);
                x2.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
