package com.sid.hr;

import java.util.Scanner;

public final class Util {

	private Util() {
	}
	
	public static final int[] processInput() 
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
}
