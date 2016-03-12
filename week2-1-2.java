import java.util.Scanner;
import java.util.*;
class Test2
{
	public static void main(String[] args)
	{
		int []tt={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int sum=0;
		for(int aa:tt)
		{
			sum+=aa;	
		}
		int av=sum/tt.length;
		for(int bb:tt)
		{
			System.out.println(bb+"\n");
		}
		System.out.println("Á`©M:"+sum+"\n"+"¥­§¡:"+av+"\n");

	}
}