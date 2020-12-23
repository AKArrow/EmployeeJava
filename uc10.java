import java.io.*;
import java.util.*;
class uc9
{
	public static void main(String s[])
	{
		try
		{
			HashMap<String, Integer> hm = new HashMap<String,Integer>();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter How Many Companies Do You Want to Add:");
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Company "+(i+1)+" Details:");
				System.out.println("Enter Company Name:");
				String cname=br.readLine();
				System.out.println("Enter Company Working Days:");
				int wd=Integer.parseInt(br.readLine());
				System.out.println("Enter Company Working Hours:");
				int wh=Integer.parseInt(br.readLine());
				System.out.println("Enter Company Per Hour Wage:");
				int phwg=Integer.parseInt(br.readLine());
				hm.put(cname,((wh*phwg)*wd));
			}
			System.out.println("------Company & Wage Details------");
			for(Map.Entry<String, Integer> et:hm.entrySet())
			{
				System.out.println(et.getKey()+" "+et.getValue());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}