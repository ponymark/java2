import java.util.Scanner;
import java.util.*;
class Test6
{
	public static void main(String[] args)
	{
		try
		{
			String [] name=new String[1000];
			int [] grade= new int[1000];
			int cou=0;
			int option=0;
			while(true)
			{
				int code=cou+1;
				System.out.println("請輸入編號"+code+"的學生姓名:\n");
				Scanner op = new Scanner(System.in);
				String hhh=op.next();
				System.out.println("請輸入成績:\n");
				Scanner op2 = new Scanner(System.in);
				String hhh2=op2.next();
				int num;
				num=Integer.parseInt(hhh2);
				name[cou]=hhh;
				grade[cou]=num;
				cou++;
				System.out.println("還要繼續嗎?y or n\n");
				Scanner op3 = new Scanner(System.in);
				String hh3=op3.next();
				if(hh3.equals("y")==true||hh3.equals("Y")==true)
				{
				}
				else if(hh3.equals("n")==true||hh3.equals("N")==true)
				{
					break;
				}						
			}

			while(true)
			{
				System.out.println("(1)查詢(-1)離開\n");
				Scanner op4 = new Scanner(System.in);
				option=op4.nextInt();
				if(option==-1)
				{
					break;
				}
				else if(option==1)
				{
					System.out.println("請輸入查詢號碼:\n");
					Scanner op5 = new Scanner(System.in);
					int jjj=op5.nextInt();
					if((jjj-1)>=0&&(jjj-1)<cou)
					{
						System.out.println("學生名稱:"+name[jjj-1]+"\n");
						System.out.println("成績:"+grade[jjj-1]+"\n");	
					}
					else
					{
						System.out.println("無此編號!!!\n");
					}
				}
			}
		}




		catch(java.lang.NumberFormatException e)
		{
			System.out.println("成績輸入非數字!!!\n");
		}

	}
}