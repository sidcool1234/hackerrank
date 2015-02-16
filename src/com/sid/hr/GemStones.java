package com.sid.hr;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GemStones {
	private static String[] inputs;
	private static String firstString;
	public static void main(String[] args) 
	{
		processInput();
		int counter = 0;
		final Set<Character> s = new HashSet<Character>();
		final char[] chars = firstString.toCharArray();
		outer:for (int i = 0; i < chars.length; i++) {
			if(s.contains(chars[i])){
				continue outer;
			}
			boolean isInAll = true;
			inner:for (int j = 0; j < inputs.length; j++) {
				
				if(!isExists(chars[i], 	inputs[j])){
					isInAll = false;
					break inner;
				}
			}
			if(isInAll){
				counter++;
			}
			s.add(chars[i]);
		}
		System.out.println(counter);
	}
	
	private static boolean isExists(final char character, final String searchIn)
	{
		boolean isExists = false;
		final char[] chars = searchIn.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(character==chars[i]){
				isExists = true;
				break;
			}
		}
		return isExists;
	}
	
	private static void processInput() 
	{
		final Scanner inputScanner = new Scanner(System.in);
		int numberOfInputs = inputScanner.nextInt();
		if(numberOfInputs>0 && numberOfInputs<=100){
			inputs = new String[numberOfInputs-1];
			for (int i = 0; i < numberOfInputs; i++) {
				final String gemCode = inputScanner.next();
				if(i==0){
					firstString = gemCode;
				}else{
					inputs[i-1] = gemCode;
				}
			}
		}else{
			inputScanner.close();
			throw new IllegalArgumentException("Incorrect type or value of arguments");
		}
		inputScanner.close();
	}
}
