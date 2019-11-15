
public class Casting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte smallValue = 6;
		int biggerDataType;
		biggerDataType = smallValue;
		System.out.println(biggerDataType);
		
		long bigAmount = 99;
		byte smallVariableDataType = (byte)bigAmount;
		System.out.println(smallVariableDataType);
		
	}

}
