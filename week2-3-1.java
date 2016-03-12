import java.util.Scanner;
class Circle
{
	double r;
	Circle(double r)
	{
		this.r = r;
	}
	double area()
	{
		return 3.14 * r * r;
	}
	double Arc(double jojo)
	{//弧長
		return r * jojo * (3.14/180);
	}
	double Pie(double jojo)
	{//面積
		return 3.14 * r * r *(jojo/360);
	}
}
class Test7
{
	public static void main(String[] args)
	{
		Circle [] cc=new Circle[1000];
		int cou=0;
		while(true)
		{	
			int yy=cou+1;
			System.out.println("請輸入第"+yy+"個半徑(-1停止):\n");
			Scanner op = new Scanner(System.in);
			int hhh=op.nextInt();
			if(hhh==-1)
			{
				break;
			}
			else
			{
				cc[cou++] = new Circle(hhh);
			}
		}
		while(true)
		{
			System.out.println("(1)功能一(-1)離開:\n");
			Scanner op2 = new Scanner(System.in);
			int hhh2=op2.nextInt();
			if(hhh2==-1)
			{
				break;
			}
			else if(hhh2==1)
			{
				System.out.println("輸入編號:\n");
				Scanner op3 = new Scanner(System.in);
				int hhh3=op3.nextInt();
				System.out.println("輸入角度(ex:270 360 180):\n");
				Scanner op4 = new Scanner(System.in);
				int hhh4=op4.nextInt();
				System.out.println("弧長:"+cc[hhh3-1].Arc(hhh4)+"\n");
				System.out.println("面積:"+cc[hhh3-1].Pie(hhh4)+"\n");
			}
		}
	}
}

