package com.sid.hr;

public class GameOfThrones {

	public static void main(String[] args) {
		final GameOfThrones gameOfThrones = new GameOfThrones();
		if(gameOfThrones.isInputValid(args[0])){
			
		}
	}
	
	private boolean isPalindromic()
	{
		return false;
	}
	
	private boolean isInputValid(final String input)
	{
		if(input!=null && input.length()>1 && input.length()<100000){
			return true;
		}
		return false;
	}
}
