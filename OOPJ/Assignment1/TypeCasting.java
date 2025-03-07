class TypeCasting{
	public static void main(String args[]){
		System.out.println("Implicit TypeCasting");
		int a=100;
		System.out.println("Integer: "+a);
		double b=a;
		System.out.println("Double: "+b);
	
		System.out.println("Explicit TypeCasting");
		double d=100.1234;
		System.out.println("Double: "+d);
		int i=(int)d;
		System.out.println("Integer: "+i);
	}
}