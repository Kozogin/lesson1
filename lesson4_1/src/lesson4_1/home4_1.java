package lesson4_1;

public class home4_1 {
	public static void main(String[] args) {
		
	//1.
		byte byteA = 5;
		short shortB = -258;
		int intC = 128954;
		long longD = -425464984;
		
		float floatE = 5.4569875f;
		double doubleF = 5.256853124652;
		
		boolean boolG = false;
		
		char charH ='h';
				
		System.out.println("byteA = "+ byteA);
		System.out.println("shortB = "+ shortB);
		System.out.println("intC = "+ intC);
		System.out.println("longD = "+ longD);
		
		System.out.println("floatE = "+ floatE);
		System.out.println("doubleF = "+ doubleF);
		
		System.out.println("boolG = "+ boolG);
		
		System.out.println("charH = "+ charH);
		
	//2.
		System.out.println();
		System.out.println("byte min = "+ Byte.MIN_VALUE);
		System.out.println("byte max = "+ Byte.MAX_VALUE);		
		System.out.println("short min = "+ Short.MIN_VALUE);
		System.out.println("short max = "+ Short.MAX_VALUE);		
		System.out.println("int min = "+ Integer.MIN_VALUE);
		System.out.println("int max = "+ Integer.MAX_VALUE);		
		System.out.println("long min = "+ Long.MIN_VALUE);
		System.out.println("long max = "+ Long.MAX_VALUE);
		
		System.out.println("float min = "+ Float.MIN_VALUE);
		System.out.println("float max = "+ Float.MAX_VALUE);
		System.out.println("double min = "+ Double.MIN_VALUE);
		System.out.println("double max = "+ Double.MAX_VALUE);		
		
		System.out.println("booleanmin = 0-false");
		System.out.println("booleanmax = 1-true");
		
		System.out.println("Змінна char для зберігання символів UTF-16");
		System.out.println("char min = "+ (Character.MIN_VALUE+0));
		System.out.println("char min = "+ (Character.MAX_VALUE+0));
		
	//3.
		System.out.println();
			int [] array = {125, 32, 458, 3, -84, 5, 0, -25, 67, -32};
			int min = array[0];
			int max = array[0];
		for(int i=1; i<array.length; ++i) {
			if(min > array[i]) {
				min = array[i];
			}
			if(max < array[i]) {
				max = array[i];
			}
		}
			System.out.println("min = " + min);
			System.out.println("max = " + max);
	}
}