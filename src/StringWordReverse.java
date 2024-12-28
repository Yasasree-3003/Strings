public class StringWordReverse{
    public static void main(String[] args)
    {
        String input= "Hello Good Morning";  
        String output = "";
        String temp="";
        String arr[] = input.split(" ");
        for (int i=0;i<arr.length;i++) {
        	temp="";
        	for(int j=arr[i].length()-1;j>=0;j--) {
        	 temp+=arr[i].charAt(j);
        	}
        	output+=temp+=" ";
        }
       
        System.out.println(output);  
    }
}
