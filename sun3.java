import java.util.Scanner;


public class Sum3 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a;
	a=s.nextInt();
	int c=a;
	int count=1;
	int sum=0;

	while(a>9)
	{
		a=a/10;
		count++;
	}
	double p=count;
	System.out.println(count);

for(int i=0;i<count;i++)
{
	int d=c%10;
	c=c/10;
	 sum+= (int) Math.pow(d,p);
	
	

	}
System.out.println(sum);

}
}
