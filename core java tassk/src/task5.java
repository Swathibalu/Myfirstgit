//difference between list, map and set
import java.util.*;
public class task5 {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		HashMap<String,String>hm=new HashMap<String,String>();
		HashSet<String> hs= new HashSet<String>();
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter ArrayList element:");
		for(int i=0;i<n;i++)
		{
			al.add(sc.next());
		}
		System.out.println("Enter HashSet element:");
		for(int i=0;i<n;i++)
		{
			hs.add(sc.next());
		}
		hm.put("A","a");
		hm.put("B","b");
		System.out.println("ArrayList elementsare:");
		for(int i=0;i<al.size();i++)
		{		
			System.out.println(al.get(i));
		}
		System.out.println("hashset elemtens:"+ hs);
		for(String i:hm.keySet())
		{
			System.out.println("KEY:"+i+" "+"VALUES:"+hm.get(i));
		}
		sc.close();
		
		
	}

}
