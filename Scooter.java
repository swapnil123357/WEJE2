class Scooter extends Vehical
{
	 void start();
	{
		System.out.println(" scooter start with kick ");
	}
	public static void main(String[] args)
	{
		Car c=new Car();
		c.start();
		Scooter s=new Scooter();
		s.start();
}
}
