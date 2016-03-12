import java.util.Scanner;
abstract class Shape 
{
	String name;
	abstract double area();
}

class Circle extends Shape 
{
	
	double r;
	public Circle(double r) 
	{
		super.name="圓形";
		this.r = r;
	}
	public double area() 
	{
		return 3.14 * r * r;
	}
}

class Rectangle extends Shape 
{
	double width, height;
	public Rectangle(double w, double h)
	{
		super.name="矩形";
		this.width = w;
		this.height = h;
	}
	public double area()
	{
		return width*height;
	}
}

class Triangle extends Shape 
{
	double width, height;
	public Triangle(double w, double h)
	{
		super.name="三角形";
		this.width = w;
		this.height = h;
	}
	public double area()
	{
		return width*height/2;
	}
}
class Oval extends Shape
{
	double r1;
	double r2;

	Oval(double r1,double r2)
	{
		super.name="橢圓";	
		this.r1=r1;
		this.r2=r2;
	}
	public double area()
	{//面積
		return 3.14 * r1 * r2 ;
	}
}
class Test10
{
	public static void main(String[] args)
	{
		int cou=0;
		Shape shapes[]=new Shape[1000];;
		while(true)
		{
			System.out.println("選擇(1)三角(2)橢圓(3)圓(4)矩形(-1)停止\n");
			Scanner op = new Scanner(System.in);
			int hhh=op.nextInt();
			if(hhh==2)
			{
				System.out.println("輸入第一個半徑");
				Scanner op2 = new Scanner(System.in);
				int hhh2=op2.nextInt();
				System.out.println("輸入第二個半徑");
				Scanner op3 = new Scanner(System.in);
				int hhh3=op3.nextInt();
				shapes[cou++]=new Oval(hhh2,hhh3);
			}	
			if(hhh==1)
			{
				System.out.println("輸入高");
				Scanner op2 = new Scanner(System.in);
				int hhh2=op2.nextInt();
				System.out.println("輸入底");
				Scanner op3 = new Scanner(System.in);
				int hhh3=op3.nextInt();
				shapes[cou++]=new Triangle(hhh2,hhh3);
			}
			if(hhh==3)
			{
				System.out.println("輸入半徑");
				Scanner op2 = new Scanner(System.in);
				int hhh2=op2.nextInt();
				shapes[cou++]=new Circle(hhh2);
			}
			if(hhh==4)
			{
				System.out.println("輸入長");
				Scanner op2 = new Scanner(System.in);
				int hhh2=op2.nextInt();
				System.out.println("輸入寬");
				Scanner op3 = new Scanner(System.in);
				int hhh3=op3.nextInt();
				shapes[cou++]=new Rectangle(hhh2,hhh3);
			}
			if(hhh==-1)
			{
				break;
			}
		}



		for(int ggg=0;ggg<cou;ggg++)
		{
			System.out.println(shapes[ggg].name);
			System.out.println("面積:"+shapes[ggg].area()+"\n");
		}
	}
}