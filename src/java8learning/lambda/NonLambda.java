package java8learning.lambda;

import java.io.File;
import java.io.FileFilter;

public class NonLambda {
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
        for (File file : javaFiles)
            System.out.println(file);
    }

}
