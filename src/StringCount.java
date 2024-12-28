
public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String words="Hello Good Morning ";
		for(int i=0;i<words.length();i++)
		{
			if(words.charAt(i)==' ')
			{
				count++;
			}

		}
      System.out.println(count);
	}
	

}
