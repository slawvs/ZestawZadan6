import java.util.Scanner;

public class KC009 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine())
		{
			System.out.println();
			String temp = input.nextLine();
			for(int i = temp.length()-1 ; i >= 0 ; i--)
			{
				System.out.print(temp.charAt(i));
			}
		}

	}

}
