////difference between String, string buffer and string builder
public class task3 {
	public static void main(String args[])
	{
String s="hello";
s.concat("java");
System.out.println(s);
if(s.equals("hello"))
{
	System.out.println("True");
}
StringBuffer sb=new StringBuffer(s);
sb.reverse();
System.out.println(sb);
StringBuilder sl=new StringBuilder("world");
int c=sl.capacity();
System.out.println(c);
sl.append("cool");
System.out.println(sl);

	}

}
