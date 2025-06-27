package sample;

public class New {

	public static void main(String[] args) {
		
		String str ="mam";
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev))
		{
			System.out.println("String is Pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}

	}

}
