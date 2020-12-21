class phw
{
	void wage()
	{	
		int i=0;
		while(i<20)
		{
			double a = Math.floor(Math.random()*10%2);
			if((i>0 && i<=10) && a==1)
			{
				System.out.println(i+" Is Present There Working Hours "+(100/20)+" Total Wage:"+(100/20*20*20));
			}
			else if(i>0 && i<=10)
			{
				System.out.println(i+" Is Not Present");
			}
			i++;
		}
	}
}
class uc6
{
	public static void main(String s[])
	{
		phw w = new phw();
		w.wage();
	}
}