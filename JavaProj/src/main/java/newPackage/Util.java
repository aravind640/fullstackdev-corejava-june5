package newPackage;

public class Util {

	public String compare() {
		StringCompare compare = new StringCompare();
		
		int lengthA = compare.inputA.length();
		int lengthB = compare.inputB.length();
		
		int output = lengthA + lengthB;
		
		if(output > 10) {
			return null;
		}else {
			return compare.inputB;
		}
		
		 
	}
}
