import java.util.Scanner;
import java.util.*;
class Test4
{
	public static void main(String[] args)
	{
		try
		{
		System.out.println("輸入第一個數字\n");
		Scanner op = new Scanner(System.in);
		int hhh=op.nextInt();
		System.out.println("輸入第二個數字\n");
		Scanner op2 = new Scanner(System.in);
		int hhh2=op2.nextInt();

		int y=0;
		while (y==0)
		{
			System.out.println("(+)+(-)-(*)*(/)/(1)離開\n");
			Scanner op3 = new Scanner(System.in);
			String jjj=op2.next();
			switch(jjj.charAt(0))
			{
				case '+':
				int h3=hhh+hhh2;
				System.out.println(hhh+"+"+hhh2+"="+h3+"\n");
				break;
                 
				case '-':
				int h4=hhh-hhh2;
				System.out.println(hhh+"-"+hhh2+"="+h4+"\n");
				break;
                 
				case '*':
				int h5=hhh*hhh2;
				System.out.println(hhh+"*"+hhh2+"="+h5+"\n");
				break;
             
				case '/':
				int h6=hhh/hhh2;
				System.out.println(hhh+"/"+hhh2+"="+h6+"\n");
				break;

	                 	case '1':
				y++;
				break;
			
				default:
				break;
			}
        	}
		}
		catch( Exception e)
		{
			System.out.println("錯誤!!!\n");
		}
	}
}