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
	{//����
		return r * jojo * (3.14/180);
	}
	double Pie(double jojo)
	{//���n
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
			System.out.println("�п�J��"+yy+"�ӥb�|(-1����):\n");
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
			System.out.println("(1)�\��@(-1)���}:\n");
			Scanner op2 = new Scanner(System.in);
			int hhh2=op2.nextInt();
			if(hhh2==-1)
			{
				break;
			}
			else if(hhh2==1)
			{
				System.out.println("��J�s��:\n");
				Scanner op3 = new Scanner(System.in);
				int hhh3=op3.nextInt();
				System.out.println("��J����(ex:270 360 180):\n");
				Scanner op4 = new Scanner(System.in);
				int hhh4=op4.nextInt();
				System.out.println("����:"+cc[hhh3-1].Arc(hhh4)+"\n");
				System.out.println("���n:"+cc[hhh3-1].Pie(hhh4)+"\n");
			}
		}
	}
}

