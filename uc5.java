class work
{
	void wage()
	{	for(int i=0;i<10;i++)
		{
			double a = Math.floor(Math.random()*10%2);
			if(a==1)
			{
				System.out.println(i+" Is Present There Monthly(20 Days) Wage Is: "+(20*8*20));
			}
			else
			{
				System.out.println(i+" Is Not Present There Monthly(20 Days) Wage Is: "+0);
			}
		}
	}
}
class uc5
{
	public static void main(String s[])
	{
		work w = new work();
		w.wage();
	}
}