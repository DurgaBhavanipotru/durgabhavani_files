package basicsofjava;

public class VariableDemo {
	int id=20;//instance variable
	void print()
{
	String msg="hii";//Local variable
	System.out.println(msg);
}
	static String message="hii friends"; //static variable
	public static void main(String[] args) {
		VariableDemo example=new VariableDemo();
		System.out.println( example.id);
		example.print();
		System.out.println(message);

	}

}
