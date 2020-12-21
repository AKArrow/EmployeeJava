import java.util.Scanner;
class all
{
	void count()
	{	for(int i=0;i<10;i++)
		{
			double a = Math.floor(Math.random()*10%2);
			if(a==1)
			{
				System.out.println(i+" Is Present!");
			}
			else
			{
				System.out.println(i+" Is Not Present!");
			}
		}
	}
	void wage()
	{	for(int i=0;i<10;i++)
		{
			double a = Math.floor(Math.random()*10%2);
			if(a==1)
			{
				System.out.println(i+" Is Present There Daily Wage Is: "+(20*8));
			}
			else
			{
				System.out.println(i+" Is Not Present There Daily Wage Is: "+0);
			}
		}
	}
	void prtwage()
	{	for(int i=0;i<10;i++)
		{
			double a = Math.floor(Math.random()*10%2);
			if(a==1)
			{
				System.out.println(i+" Is Present Part Time There Daily Wage Is: "+(20*8));
			}
			else
			{
				System.out.println(i+" Is Not Present There Daily Wage Is: "+0);
			}
		}
	}
}
class uc4
{
	public static void main(String s[])
	{
		all a = new all();
		System.out.println("Enter Your Choice:\n1.Attendance\n2.Wage Count\n3.Part Time Wage Count");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch)
		{
			case 1:a.count();break;
			case 2:a.wage();break;
			case 3:a.prtwage();break;
			default:System.out.println("There Is No Such Option!");break;
		}
	}
}