package lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class TestReadFile {
	public static void main(String[] args) throws IOException {
		// Scanner input = new Scanner(new File("data/hamlet.txt"));
		Scanner input = new Scanner(new File("src/data/fit.txt"));

		while (input.hasNext()) {
			String word = input.next();
			System.out.println(word);
		}
		MyWordCountApp mywordcountapp = new MyWordCountApp();
		mywordcountapp.loadData();
		
		System.out.println("/////////////countdis/////////////////////");
		System.out.println(mywordcountapp.countdis());
		System.out.println("//////////////// count unique////////////////");
		System.out.println(mywordcountapp.countUnique());
		System.out.println("////////////////print count word/////////////////");
		mywordcountapp.printWordCounts();
		System.out.println("//////////////////printWordCountsAlphabet////////////////");
		mywordcountapp.printWordCountsAlphabet();
	}
}