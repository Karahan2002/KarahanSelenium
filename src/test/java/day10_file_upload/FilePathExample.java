package day10_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {
    @Test
    public void test1(){
        String projectPath = System.getProperty("user.dir");
        String filePath = "/file.txt";
        String fullPath = projectPath+filePath;
        System.out.println(fullPath);
    }
}
