
public class AlphabetsPattern {

	public static void main(String[] args) 
	{
	
		int i,j,n = 10;
		
		//i==0||i==n-1||j==0||j==n-1
		//i==0||i==(n-1)/2||j==0||j==n-1
		//i==0||i==(n-1)/2||j==0||j==n-1||i==n-1
		//i==0||j==(n-1)/2
		//i==0||i==n-1||i==(n-1)/2||j==0
		//j==0||j==n-1||i==(n-1)/2
		//i==0 && j>0||i==n-1 && j>0||j==0 && i>0 && i<n-1-C
		//i==0 && j>0||i==n-1 && j>0||j==0 && i>0 && i<n-1||i==(n-1)/2-E
		//(i==0&&j<n-1)||j==0||(i==n-1&&j<n-1)||(j==n-1&&i>0&&i<n-1)-D
		//(j==0&&i>0)||(i==0&&j>0&&j<n-1)||i==(n-1)/2||(j==n-1&&i>0)-A
		//(i==0&&j>(n-1)/4&&j<3*(n-1)/4)||(i==n-1&&j>(n-1)/4&&j<3*(n-1)/4)||(j==(n-1)/4&&i>0&&i<n-1)||(j==3*(n-1)/4&&i>0&&i<n-1)-O
		//j==0||j==n-1||i==j-N
		//j=0;j<n*2;j++-->(i==j||i+j==n*2-1-V
		
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++) 
			{
				if(j==0||j==n-1||i==j)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("   ");
			for(j=0;j<n;j++) 
			{
				if((j==0&&i>0)||(i==0&&j>0&&j<n-1)||i==(n-1)/2||(j==n-1&&i>0))
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("   ");
			
			for(j=0;j<n*2;j++) 
			{
				if(i==j||i+j==n*2-1)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("   ");
			
			for(j=0;j<n;j++) 
			{
				if(i==0&&j>0||i==n-1&&j>0||j==0&&i>0&&i<n-1||i==(n-1)/2)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
            System.out.print("   ");
			
			for(j=0;j<n;j++) 
			{
				if(i==0&&j>0||i==n-1&&j>0||j==0&&i>0&&i<n-1||i==(n-1)/2)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("   ");
			
			for(j=0;j<n;j++) 
			{
				if(j==0||j==n-1||i==j)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
		
			
			System.out.println();
			
		}
		

	}

}
