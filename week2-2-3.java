import java.util.Scanner;
import java.util.*;
class Test5
{
	public static void main(String[] args)
	{
		System.out.println("輸入一個西元年份:\n");
		Scanner op = new Scanner(System.in);
		int hhh=op.nextInt();
		for(int yy=1;yy<=hhh;yy++)
		{
			if ((yy%400==0)||((yy%4==0)&&(yy%100!=0)))
			{
				System.out.println(yy+"\n");
				//閏
			}
		}
	}
}