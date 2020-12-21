class attendance
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
}
class uc1
{
	public static void main(String s[])
	{
		attendance at = new attendance();
		at.count();
	}
}