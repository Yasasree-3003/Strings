import java.util.Scanner;
public class StringVowelCount {
	public static void main(String[]args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		String words=sc.nextLine();
		words.toUpperCase();
		for(int i=0;i<words.length();i++)
		{
			if((words.charAt(i)=='A')||(words.charAt(i)=='E')||(words.charAt(i)=='I')||(words.charAt(i)=='O')||(words.charAt(i)=='U'))
			{
				count++;
			}
		}
      System.out.println(count);
	}
}