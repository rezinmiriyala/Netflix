package Stringpalindrome;

public class Stringpalindrome {
	public static void main(String[] args)
	{
	String s="deed";
	String s1="";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		s1=s1+s.charAt(i);
	}
	if(s.equals(s1))
	{
	System.out.println(" given String is palindrome "+s1);
	}
	else
	{
	System.out.println(" given String is not palindrome "+s1);
	}
	System.out.println(s1);
	}

}
