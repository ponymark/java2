import java.io.*;
class Test3
{
	public static void main(String[] args)throws Exception
	{
		System.out.println("�п�J�A���W�r�M�褸�ͤ�(���H�W�r:�~/��/��榡)(��:���p��:1994/05/25)"+"\n");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(is);
		String rr = in.readLine();
		String [] tr=rr.split(":");
		String [] br=tr[1].split("/");
		int temp=(Integer.parseInt(br[0])-1911);
		br[0]="";
		br[0]+=temp;
		System.out.println(tr[0]+":"+br[0]+"/"+br[1]+"/"+br[2]+"\n");
	}
}