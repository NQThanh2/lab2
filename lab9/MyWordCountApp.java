package lab9;

import java.awt.RenderingHints.Key;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class MyWordCountApp {
	// public static final String fileName = "data/hamlet.txt";
	public static final String fileName = "src/data/fit.txt";
	// <word, its occurences>
	private Map<String, Integer> map = new HashMap<String, Integer>();

	// Load data from fileName into the above map (containing <word, its occurences>)
	// using the guide given in TestReadFile.java
	public void loadData() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
	    String line = null;
	    while ((line = reader.readLine()) != null) {
	        StringTokenizer tokens = new StringTokenizer(line, " "); 
	        while (tokens.hasMoreTokens()) {
	            String token = tokens.nextToken().toLowerCase(); 
	            map.put(token, map.getOrDefault(token, 0) + 1); 
	        }
	    }
	    reader.close();
	}
	
	public int countdis() {
		return map.size();
	}
	// Returns the number of unique tokens in the file data/hamlet.txt or fit.txt
	public int countUnique() {
		int count = 0 ;
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue()==1) {
				return count++;
			}
		}
		return count;
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt)
	// In this method, we do not consider the order of tokens.
	public void printWordCounts() throws FileNotFoundException {
		// TODO
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according to ascending order of tokens
	// Example: An - 3, Bug - 10, ...
	public void printWordCountsAlphabet() {
		// TODO
		Map<String, Integer> sortedMap = new TreeMap<>(map);
	    for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
	        System.out.println(entry.getKey() + " - " + entry.getValue());
	    }
	}
}
