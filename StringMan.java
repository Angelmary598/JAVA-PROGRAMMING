
public class StringMan
{
	public static void main(String args[])
	{
		String s = "\nHello World\n";
		System.out.println(s);
		
		char[] cha = {'S','t','r','i','n','g'};
		String s1 = new String(cha);
		System.out.println(s1);
		
		String s2 = "Sample code";
		if(s2.isEmpty())
		{
			System.out.println("string is empty");
		}
		else
		{
			System.out.println("\nlength of string "+s2+" is "+s2.length()+"\n");
		}
		
		String s3 ="Ayhana";
		String s4 ="com";
		String c = s3.concat(".").concat(s4);
		System.out.println(c);
		
		String s5 = "\nsample code";
		System.out.println(s5);
		int ascii = s5.charAt(5);
		char ch = s5.charAt(5);
		int findex = s5.indexOf('e');
		int lindex = s5.lastIndexOf('e');
		System.out.println("ASCII value is " + ascii);
		System.out.println("Orginal value is " + ch);
		System.out.println("First indexOf 'e' " + findex);
		System.out.println("Last indexOf 'e' " + lindex);
		
		String s6 = "\nnew example";
		String s7 = "New example";
		System.out.println(s6);
		System.out.println(s7);
		if(s6.compareTo(s7) == 0)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}
}
 