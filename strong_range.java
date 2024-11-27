import java.util.Scanner;

class strong_range 
{
	public static int calfact(int num){
		int fact=1;
		for(int i=1;i<=num;i++){
			fact*=i;

		}
		
		return fact;
	}
	public static void strongInrange(int start,int end){
		for(int i=start;i<=end;i++){
		int sum=0;
		int n=i;
		while(n!=0){
			int d=n%10;
            sum+=calfact(d);
			n/=10;
			}
			if(sum==i)
			System.out.println(" "+i);
			
		}
			
			
			}
	

	public static void main(String[] args) 
	{   Scanner s1=new Scanner(System.in);
	    
		//System.out.println("Enter the number:");
		//int n=s1.nextInt();
        
		strongInrange(100,1000000);
	}
}
