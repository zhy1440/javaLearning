package others;

import java.io.*;
import java.nio.CharBuffer;

public class CsvReader {
    public static class JavaFileFilter implements FileFilter {
        @Override
        public boolean accept(File file) {
            return file.getName().endsWith("csv");
        }
    }

    public static void main(String[] args) {
        JavaFileFilter fileFilter = new JavaFileFilter();
        File dir = new File("d:/tmp");
        File[] javaFiles = dir.listFiles(fileFilter);
        System.out.println(javaFiles.length);
        for (File file : javaFiles) {
            System.out.println(file);
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(file));

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            String line;
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

