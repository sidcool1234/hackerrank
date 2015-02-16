package com.sid.hr;


import java.util.Scanner;

public class UtopionTree {

	private static int[] inputs;
	public static void main(String[] args) 
	{
		processInput();
		for (int i = 0; i < inputs.length; i++) {
			final UtopionTreeDto tree = new UtopionTreeDto();
			final int numberOfCycles = inputs[i];
			if(numberOfCycles==0){
				System.out.println(tree.getHeight());
				continue;
			}
			for (int j = 1; j <= numberOfCycles; j++) {
				if(j%2==0){
					tree.applySummer();
				}else{
					tree.applyMonsoon();
				}
			}
			System.out.println(tree.getHeight());
		}
	}
	
	private static void processInput() 
	{
		final Scanner inputScanner = new Scanner(System.in);
		//System.out.println("Enter the number of Test Cases:");
		int numberOfInputs = inputScanner.nextInt();
		if(numberOfInputs>0 && numberOfInputs<11){
			inputs = new int[numberOfInputs];
			for (int i = 0; i < numberOfInputs; i++) {
				final int numberOfCycles = inputScanner.nextInt();
				inputs[i] = numberOfCycles;
			}
			//System.out.println("Done entering inputs.  Processing...");
		}else{
			inputScanner.close();
			throw new IllegalArgumentException("Incorrect type or value of arguments");
		}
		inputScanner.close();
	}
}

class UtopionTreeDto
{
	private int height;
	private final static int initialHeightMetres = 1;
	public UtopionTreeDto()
	{
		this.height = initialHeightMetres;
	}
	public int getHeight()
	{
		return this.height;
	}
	
	public void applyMonsoon()
	{
		this.height = this.height * 2;
	}
	
	public void applySummer()
	{
		this.height = this.height + 1;
	}
}

