import java.util.Scanner;
import java.util.*;
class Test
{
	public static void main(String[] args)
	{

		System.out.println("��J�Ĥ@���ɶ�(�Y)(��:��:��):"+"\n");
		Scanner op = new Scanner(System.in);
		String t1 = op.next();
		System.out.println("��J�ĤG���ɶ�(��)(��:��:��):"+"\n");
		Scanner op2 = new Scanner(System.in);
		String t2 = op2.next();
		String [] hh1=t1.split(":");//hh1[0]�s��,hh1[1]�s��,hh1[2]�s��
		String [] hh2=t2.split(":");//�P�W ����hh2
		int time=(Integer.parseInt(hh2[0])*60*60+Integer.parseInt(hh2[1])*60+Integer.parseInt(hh2[2]))-(Integer.parseInt(hh1[0])*60*60+Integer.parseInt(hh1[1])*60+Integer.parseInt(hh1[2]));
		System.out.println("�ɶ���"+time+"��\n");
	}
	
}