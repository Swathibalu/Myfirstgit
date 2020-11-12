
public class Task1 {
	public static void main(String args[])
	{
	int a[]=new int[]{0,1,2,3,4,5,6,7,8,9};
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0&&a[i]<a.length-1)
		{
			System.out.println(a[i]);
			
		}
		if(a[i]%2!=0&&a[i]<a.length-1)
		{
			continue;
		}
		if(a[i]==a.length-1)
		{
			break;
		}
		
	}
	}
	

}
