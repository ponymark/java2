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
	double Pie(double jojo)
	{//���n
		return 3.14 * r * r *(jojo/360);
	}
}
class Test9
{
	public static void main(String[] args) 
	{
		
		Oval [] cc=new Oval[1000];
		int cou=0;
		while(true)
		{	
			int yy=cou+1;
			System.out.println("�п�J��"+yy+"�Ӿ�ꪺ�Ĥ@�ӥb�|:\n");
			Scanner op = new Scanner(System.in);
			int hhh=op.nextInt();
			System.out.println("�п�J��"+yy+"�Ӿ�ꪺ�ĤG�ӥb�|:\n");
			Scanner op5 = new Scanner(System.in);
			int hhh5=op5.nextInt();
			cc[cou++] = new Oval(hhh,hhh5);
			System.out.println("�٭n�~���?y or n\n");
			Scanner op6 = new Scanner(System.in);
			String hhh6=op6.next();
			if(hhh6.equals("n")==true||hhh6.equals("N")==true)
			{
				break;
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
				System.out.println("�Ĥ@�ӥb�|:"+cc[hhh3-1].r+"\n");
				System.out.println("�ĤG�ӥb�|:"+cc[hhh3-1].r2+"\n");
				System.out.println("���n:"+cc[hhh3-1].Pie()+"\n");
			}
		}
	}
}
class Oval extends Circle
{
	double r2;
	Oval(double r,double r2)
	{	
		super(r);
		this.r2=r2;
	}
	double Pie()
	{//���n
		return 3.14 * super.r * r2 ;
	}
}