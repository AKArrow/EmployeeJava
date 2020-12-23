import java.io.*;
import java.util.*;
class uc9
{
	int wd,wh,phwg;
	String cname;
	HashMap<String, Integer> hm = new HashMap<String,Integer>();
	uc9(String cname,int wd,int wh,int phwg)
	{
		this.cname=cname;
		this.wd=wd;
		this.wh=wh;
		this.phwg=phwg;
		hm.put(cname,((phwg*wh)*wd));
	}
	void display()
	{
		for(Map.Entry<String, Integer> et:hm.entrySet())
		{
			System.out.println(et.getKey()+" "+et.getValue());
		}
	}
	public static void main(String s[])
	{
		try
		{
			int wd,wh,phwg;
			String cname;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter How Many Companies Do You Want to Add:");
			int n = Integer.parseInt(br.readLine());
			uc9[] c = new uc9[n];
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Company "+(i+1)+" Details:");
				System.out.println("Enter Company Name:");
				cname=br.readLine();
				System.out.println("Enter Company Working Days:");
				wd=Integer.parseInt(br.readLine());
				System.out.println("Enter Company Working Hours:");
				wh=Integer.parseInt(br.readLine());
				System.out.println("Enter Company Per Hour Wage:");
				phwg=Integer.parseInt(br.readLine());
				c[i] = new uc9(cname,wd,wh,phwg);
			}
			System.out.println("------Company & Wage Details------");
			for(int i=0;i<n;i++)
			{
				c[i].display();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}