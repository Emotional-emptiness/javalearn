package FileRead;

import java.io.*;

public class FileReaderUtil {
    public static void main(String[] args) {
        readFile("file.txt");
    }

    private static void readFile(String filePath) {
        File file = new File(filePath);
//        BufferedReader reader = null;
        try ( BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            reader = new BufferedReader(new FileReader(file));
//            System.exit(1);
            System.out.println("reader.readLine() = " + reader.readLine());
        } catch (IOException e) {
            System.out.println("impossible to read file");
        }
//        catch (FileNotFoundException e) {
//            System.out.println("no file");
//        }
//        finally {
//            try {
//                    if (reader != null) {
//                    reader.close();
//                }
//            } catch (IOException e) {
//               e.printStackTrace();
//            }
//        }
    }
}
