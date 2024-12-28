
public class StringReverse {
	public static void main(String[] args)
	{
		
		String words="Hello Good Morning";
		String rs="";
		int len=words.length()-1;
		for(int i=len;i>=0;i--)
		{
		rs=rs+words.charAt(i);
		}
		System.out.println(rs);

	}

}
