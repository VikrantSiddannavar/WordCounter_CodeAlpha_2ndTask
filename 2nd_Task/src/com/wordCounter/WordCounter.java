package com.wordCounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
 	public static void main(String[] args) throws FileNotFoundException{
		//Using a hashmap to store words
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//Using Scanner class to read a text file
		Scanner textFile = new Scanner(new File("D:\\CodeAlpha_Tasks\\TextFile\\wordCount.txt"));
		while (textFile.hasNext()) {
			String word = textFile.next();
			if (map.containsKey(word)) {
				//increase count to 1 if this word has already existed in map
				int count = map.get(word) + 1;
				map.put(word, count);
			} else {
				map.put(word, 1);
			}
		}
		textFile.close();
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.print(entry + " ");
				
			}
		}
	}