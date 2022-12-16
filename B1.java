 class B1 extends B 
{

	public void demo()
	{
		System.out.println("bye");
	}
	public static void main(String[] args)
	{
		B1 obj=new B1();
		obj.demo();
		B obj1=obj;
}
}