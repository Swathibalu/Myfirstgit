//difference between == and equals
public class task4 {
	public static void main(String args[])
	{
String s1=null;
String s2="abc";
String s3 = new String("java");
String s4 = new String("java");
String s5="abc";
String s6="java";
System.out.println(s1==s2);
System.out.println(s2.equals(s1));
System.out.println(s3==s4);
System.out.println(s3.equals(s4));
System.out.println(s2==s5);
System.out.println(s2.equals(s5));
System.out.println(s3==s6);
System.out.println(s3.equals(s6));
	}


}
