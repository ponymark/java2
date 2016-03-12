import java.util.Scanner;
class Date
{
	int y;
	int m;
	int d;
	Date(int y,int m,int d)
	{
		this.y = y;
		this.m = m;
		this.d = d;
	}
	int isdate()
	{	
		if(y>0)
		{//年正確
			if ((y%400==0)||((y%4==0)&&(y%100!=0)))
			{//閏
				if(m>0&&m<=12)
				{//月正確
					if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
					{
						if(d>0&&d<=31)
						{
							return 1;
						}
					}
					else if(m==2)
					{
						if(d>0&&d<=29)
						{
							return 1;
						}

					}
					else
					{
						if(d>0&&d<=30)
						{
							return 1;
						}						
					}
				}
			}
			else
			{//非閏
				if(m>0&&m<=12)
				{//月正確
					if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
					{
						if(d>0&&d<=31)
						{
							return 1;
						}
					}
					else if(m==2)
					{
						if(d>0&&d<=28)
						{
							return 1;
						}

					}
					else
					{
						if(d>0&&d<=30)
						{
							return 1;
						}						
					}
				}
			}
		}
		return 0;
	}
}
class Test8
{
	public static void main(String[] args)
	{
		Date d1=new Date(1994,6,26);
		System.out.println(d1.y+"/"+d1.m+"/"+d1.d);
		if(d1.isdate()==1)
		{
			System.out.println("正確\n");
		}
		else
		{
			System.out.println("錯\n");
		}
		
		Date d2=new Date(2000,2,29);
		System.out.println(d2.y+"/"+d2.m+"/"+d2.d);
		if(d2.isdate()==1)
		{
			System.out.println("正確\n");
		}
		else
		{
			System.out.println("錯\n");
		}

		Date d3=new Date(2015,2,29);
		System.out.println(d3.y+"/"+d3.m+"/"+d3.d);
		if(d3.isdate()==1)
		{
			System.out.println("正確\n");
		}
		else
		{
			System.out.println("錯\n");
		}
	}
}

