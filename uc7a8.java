import java.io.*;
class wage
{
	int wh,wd,wg;
	void accept(int wh,int wd,int wg)
	{
		this.wh=wh;
		this.wd=wd;
		this.wg=wg;
	}
	void calculate()
	{
		System.out.println("Wage Per Emplyee As Per Your Condition:"+((wg*wh)*wd));
	}
}
class uc7a8
{
	public static void main(String s[])
	{
		try
		{
			int wh,wd,wg;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Working Day:");
			wd=Integer.parseInt(br.readLine());
			System.out.println("Enter Working Hour:");
			wh=Integer.parseInt(br.readLine());
			System.out.println("Enter Wage Per Hour:");
			wg=Integer.parseInt(br.readLine());
			wage w = new wage();
			w.accept(wh,wd,wg);
			w.calculate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}