import java.util.Scanner;
class Revbor{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=0;j<=a-i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");

		}
	}
}
			