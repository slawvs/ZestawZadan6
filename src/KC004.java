import java.util.Scanner;

public class KC004 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine())
		{
			System.out.println();
			int x = input.nextInt();
			int amount = input.nextInt();
			int HowManyXinLine = 0;
			for(int i = 0 ; i < amount ; i++ )
			{
				if(x == input.nextInt()) HowManyXinLine ++;
			}
			System.out.print(HowManyXinLine);
			input.nextLine();
		}
	}

}
