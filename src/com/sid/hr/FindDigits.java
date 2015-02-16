package com.sid.hr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Problem Statement

You are given an integer N. Find the digits in this number that exactly divide N(division that leaves 0 as remainder) and display their count. For N=24, there are 2 digits − 2 & 4. Both of these digits exactly divide 24. So our answer is 2.

Note

If the same number is repeated twice at different positions, it should be counted twice, e.g., For N=122, 2 divides 122 exactly and occurs at ones' and tens' position. So for this case, our answer is 3.
Division by 0 is undefined.
Input Format

The first line contains T (number of test cases) followed by T lines (each containing an integer N).

Constraints 
1≤T≤15 
0<N<1010

Output Format

For each test case, display the count of digits in N that exactly divide N in a separate line.

Sample Input

2
12
1012
Sample Output

2
3
Explanation

2 digits in the number 12 divide the number exactly. Digits at tens' place, 1, divides 12 exactly in 12 parts, and digit at ones' place, 2 divides 12 equally in 6 parts.

1 divides 1012 at two places and 2 divides it at one place. Divide by 0 is an undefined behaviour and it will not be counted.

This challenge was a part of Pragyan 12 
 */
public class FindDigits {

	public FindDigits() {
	}

	public static void main(String[] args) throws IOException{
		double initTime = (double)System.currentTimeMillis();
		final int[] inputs = processInput();
		findAndPrintDigits(inputs);
		//anotherSolution(args);
		double finalTime = (((double)System.currentTimeMillis())-initTime);
		System.out.println("Runtime="+finalTime);
	}
	
	private static void findAndPrintDigits(final int[] inputs)
	{
		for (int i = 0; i < inputs.length; i++) {
			int divisorCounter = 0;
			final int numberN = inputs[i];
			final String numberInStringFormat = String.valueOf(numberN);
			final char[] numberAsCharArray = numberInStringFormat.toCharArray();
			for (int j = 0; j < numberAsCharArray.length; j++) {
				final int divisorOfN = Integer.valueOf(String.valueOf(numberAsCharArray[j]));
				if(divisorOfN!=0 && numberN%divisorOfN==0){
					divisorCounter++;
				}
			}
			System.out.println(divisorCounter);
		}
	}
	
	private static final int[] processInput() 
	{
		final Scanner inputScanner = new Scanner(System.in);
		int numberOfInputs = inputScanner.nextInt();
		final int[] inputs = new int[numberOfInputs];
		for (int i = 0; i < numberOfInputs; i++) {
			final int numberOfCycles = inputScanner.nextInt();
			inputs[i] = numberOfCycles;
		}
		inputScanner.close();
		return inputs;
	}
	
	 private static int N;

	    private static void compute(int input){
			
			char[] arr = String.valueOf(input).toCharArray();
			int counter = 0;
			int temp;
			
			for(int i = 0; i < arr.length; i++){
				temp = Integer.parseInt(Character.toString(arr[i]));
				if(temp == 0) continue;
				if(input%temp == 0) counter++;
			}
			
			System.out.println(counter);
		}
	    
	    private static void anotherSolution(String[] args) throws IOException{
	      
	      String line = "";
			
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      line = br.readLine();
		  N = Integer.parseInt(line);
		  
		  for(int i = 0; i < N; i++){
			  compute(Integer.parseInt(br.readLine()));
		  }
	    }
	
	
}
