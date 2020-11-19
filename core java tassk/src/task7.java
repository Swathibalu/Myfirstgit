////difference between static and instance members
public class task7 {
int a=5;
static int b=6;
public static void main(String args[])
{
	task7 ta=new task7();
	System.out.println(ta.a);
	System.out.println(task7.b);
	//System.out.println(10++);
	//System.out.println(++10);
	
}
}
