class wage
{
	void count()
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
}
class uc2
{
	public static void main(String s[])
	{
		wage wg = new wage();
		wg.count();
	}
}