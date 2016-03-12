import java.util.Scanner;
import java.util.*;
class Test
{
	public static void main(String[] args)
	{

		System.out.println("輸入第一次時間(頭)(時:分:秒):"+"\n");
		Scanner op = new Scanner(System.in);
		String t1 = op.next();
		System.out.println("輸入第二次時間(尾)(時:分:秒):"+"\n");
		Scanner op2 = new Scanner(System.in);
		String t2 = op2.next();
		String [] hh1=t1.split(":");//hh1[0]存時,hh1[1]存分,hh1[2]存秒
		String [] hh2=t2.split(":");//同上 但為hh2
		int time=(Integer.parseInt(hh2[0])*60*60+Integer.parseInt(hh2[1])*60+Integer.parseInt(hh2[2]))-(Integer.parseInt(hh1[0])*60*60+Integer.parseInt(hh1[1])*60+Integer.parseInt(hh1[2]));
		System.out.println("時間為"+time+"秒\n");
	}
	
}