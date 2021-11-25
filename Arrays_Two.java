package hw.TWO;

import java.util.ArrayList;

public class Arrays_Two {
	
	public static void main(String[] args) {
		String[] sentence = {"Other", "entries", "include", "a", "historic", 
				"district", "in", "Charlottesville", "Virginia", "cut-flower", 
				"greenhouse", "complex."};
		ArrayList<String> short_words = slim(sentence);
		for (String word: short_words) {
			System.out.print(word+" ");
		}
	}
	
	//algorithm to isolate shortest words amongst every three in a sentence
	public static ArrayList<String> slim(String[] full) {
		//create array to hold shortest words
		ArrayList<String> shortest_words = new ArrayList<String>();
		//set current index
		int index = 0;
		while (index < full.length) {
			//find lengths of each word
			int[] lengths = new int[3];
			lengths[0] = full[index].length();
			lengths[1] = full[index+1].length();
			lengths[2] = full[index+2].length();
			//find shortest length
			int min = lengths[0];
			for (int i = 0; i < lengths.length; i++) {
				if (lengths[i] < min) {
					min = lengths[i];
				}
			}
			//add shortest word to new array
			if (full[index].length() == min) {
				shortest_words.add(full[index]);
			}
			else if (full[index+1].length() == min) {
				shortest_words.add(full[index+1]);
			}
			else {
				shortest_words.add(full[index+2]);
			}
			//increment to next three word
			index = index+3;
		}
		//return list of shortest words
		return shortest_words;
	}

}