import java.util.Scanner;

public class Jpesel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] tab = {1,3,7,9,1,3,7,9,1,3,1 } ;
		int t = input.nextInt();
		input.nextLine();
		for(int i = 0; i < t; i++)
		{
			int value = 0;
			String temp = input.nextLine();
			for (int j=0; j < 11 ; j++)
			{
				value += ((int)temp.charAt(j)-48)*tab[j];
			}
			if(value > 0 && value % 10 == 0 )
			{
				System.out.println('D');				
			}else
			{
				System.out.println('N');
			}
		}

	}

}
