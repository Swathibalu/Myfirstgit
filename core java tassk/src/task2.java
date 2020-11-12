
public class task2 {
	static int a=5;
	final static int n=10;
	public static void main(String args[])
	{
		//n++; gives you compilation error
		a++;
		try {
		System.out.println(a);
		System.out.println(n);
		//throw new RuntimeException("final variable can't be incremented"); 
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		finally
		{
			System.out.println("Static and final variables are printed!");
		}
		task2 t=new task2();
		//t.finalize(); //calling finalize method explicitly
		t=null;
		
		System.gc();//requesting JVM to call garbage collector.	
	}
	public void finalize()
	{
		System.out.println("Finalize method excuted!");
	}
}
