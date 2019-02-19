package java8learning.lambda.lambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {
    public static void main(String[] args) {
        // Using anonymous function
//        FileFilter fileFilter = new FileFilter() {
//            @Override
//            public boolean accept(File file) {
//                return file.getName().endsWith("csv");
//            }
//        };

        FileFilter fileFilterLambda = (File file) -> file.getName().endsWith("csv");

        File dir = new File("d:/tmp");
        File[] javaFiles = dir.listFiles(fileFilterLambda);

        System.out.println(javaFiles.length);
        for (File file : javaFiles)
            System.out.println(file.getName());
    }
}
