package org.module2danielwang.problem4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> uniqueWords = new HashSet<>();
        Scanner scanner = new Scanner(new File("/Users/danielwanghomefolder/IdeaProjects/Module 2 Daniel Wang/src/main/java/org/module2danielwang/problem4/illiad.txt"));
        while (scanner.hasNext()){
            String word = scanner.next().toLowerCase().replaceAll("[^a-z0-9]","");
            uniqueWords.add(word);
        }
        scanner.close();
        System.out.println("There are " + uniqueWords.size() + " unique words.");
    }
}