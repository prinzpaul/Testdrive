package octopussy;

import java.util.*;

public class Octopussy {
	/*
	public static void main(String[]args) {
		for(int i = 1; i<=100; i++) {
			System.out.println(play(i));
		}
	}
	*/
	public String play(int i) {
		String c;
		if(i%8==0) {
			c = "Octopussy";
		}
		else if(Integer.toString(i).contains("8")) {
			c = "Octopussy";
		}
		else {
			c = Integer.toString(i);
		}
		return c;
	}
	public String game(int i) {
		String c = Integer.toString(i);
		boolean er = false;
		int array[] = new int[c.length()];
		for(int j = 0; j<c.length(); j++) {
			array[j] = Integer.parseInt(c.substring(j,j+1));
		}
		for(int k = 0; k<c.length(); k++) {
			if(array[k] == 8) {
				er = true;
			}
		}
		if(er == true || i%8==0) {
			c = "Octopussy";
		}
		return c;
	}
}
