package sample;

public class Min_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,2,3,4,5};
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
		    }
		}
			System.out.println("minimum ele is:"+min);

	}
}
