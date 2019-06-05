package com.nickfonseca.L01PracticeHandsOnL01PracticeHandsOn;

public class L01PracticehandsOnV2 {

	public static void main(String[] args) {
		// --------STEP 1-----------------
		
		boolean isSunny = true;
		String glasses = "Wear sunglasses!";
		String noGlasses = "Don't wear sunglasses";

		// if it's sunny
		if(isSunny) {
			// print "Wear sunglasses!"
			System.out.println(glasses + " Step 1");
		} //else
		else {
			// print "Don't wear sunglasses."
			System.out.println(noGlasses);
		}
		 		
		// --------STEP 2-----------------
		boolean atBeach = true;
		String sunBlock = "Wear sunblock!";
		String noSunBlock = "Don't need sunblock!";
		String tomorrow = "Come back tomorrow";
		String noBeach = "Don't go to the beach";
				 
		if(isSunny) { // isSunny | print wear sunglasses
			System.out.println(glasses + " Step2");
			if(atBeach) { // atBeach | print wear sunblock
			System.out.println(sunBlock + " Step2");
		  	// print "Wear sunblock!"
			} else { // isSunny && atBeach
				System.out.println(noSunBlock);
			}
		} else { // isSunny | print noGlasses
			System.out.println(noGlasses);
		}
					        		
		// --------STEP 3-----------------
		if(isSunny) {
			System.out.println(glasses);
			if(atBeach) {
				System.out.println(sunBlock);
			}
			else {
				System.out.println(noSunBlock);
			}
		}
		else {
			System.out.println(noGlasses);
		}
		if(atBeach) {
			System.out.println(tomorrow);
		}
		else {
			System.out.println(noBeach);
		}
	}

}
