package pep_task9.pep_task9;

public class PalindromeChecker {
	public static boolean isPalindrome(String str)
	{
		for(int i=0,j=str.length()-1;i<j;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
		}
		return true;
	}
}

