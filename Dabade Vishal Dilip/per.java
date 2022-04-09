class  per
{
	public static void main(String[] args) 
	{
		int sum=0;								 // assign
		int num=28;
		for(int j=2;j<10000;j++)			//got to 10000
		{
			 sum=0;
		for(int i=1;i<j;i++)	               // check
		{
             if(j%i==0)
			{
				 sum=sum+                 //calculate
			}
		}
	
		if(sum==j)                          //compare
		{
		System.out.println(j);          //print
		}
	}
	}
}
