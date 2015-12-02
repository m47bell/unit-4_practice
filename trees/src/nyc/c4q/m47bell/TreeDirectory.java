package nyc.c4q.m47bell;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;

/**
 * Created by c4q-marbella on 11/7/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class TreeDirectory {

    public static void main(String []args){
    printDirectory("/Users/c4q-marbella/Desktop/tutorials-projects/unit-4");
    }

    private static void printDirectory(String path){

        File file = new File(path);
        File [] listOfFiles = file.listFiles();
        for (File fileName : listOfFiles){
            if (file.isFile()){
                System.out.println(fileName.getName());
            }
        }
    }



}
