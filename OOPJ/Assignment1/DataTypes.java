class DataTypes{
	
	static boolean a;
	static char c;
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	
	public static void main(String args[]){
		System.out.println("Default Values");
		
		System.out.println(a);
		System.out.println("Char Default values:"+c);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		
		
		System.out.println("Assigned Values");
		//Boolean
		boolean bool=true;
		System.out.println(bool);
		
		//Character
		char ch='A';
		System.out.println(ch);
		
		//Integer type
		byte byteValue=100;
		System.out.println(byteValue);
		short shortValue=1000;
		System.out.println(shortValue);
		int integer=1;
		System.out.println(integer);
		long longValue=10000000;
		System.out.println(longValue);
		
		//Floating type
		float floatValue=4.1f;
		System.out.println(floatValue);
		double doubleValue=123.5363d;
		System.out.println(doubleValue);
		
	}
}