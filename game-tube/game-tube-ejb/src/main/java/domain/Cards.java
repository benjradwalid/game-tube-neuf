package domain;

import java.util.Random;


public final class Cards {
	
	
	final int[] pique = {1,2,3,4,5,6,7,8,9,10} ;
	final int[] trefle = {1,2,3,4,5,6,7,8,9,10} ;
	final int[] carreau = {1,2,3,4,5,6,7,8,9,10} ;
	final int[] coeur = {1,2,3,4,5,6,7,8,9,10} ;
	
	
	public static int randCard(int min, int max) {

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
}
