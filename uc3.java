class wagepart
{
	void count()
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
class uc3
{
	public static void main(String s[])
	{
		wagepart wp = new wagepart();
		wp.count();
	}
}