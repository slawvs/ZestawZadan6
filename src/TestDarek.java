import java.util.Scanner;

public class TestDarek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] table = new String[3];
		for(int i = 0; i < 3; i++)
		{
			table[i]=input.nextLine();
		}
		int temp = 0;
		for(int i = 0; i < table[1].length(); i++)
		{
			int x=0;
			if( table[0].charAt(i) != table[1].charAt(i) ) 
				{
					temp++;
					x++;
				}
			if( table[0].charAt(i) != table[2].charAt(i) ) 
				{
					temp++;
					x++;
				}
			if(x==2 && table[1].charAt(i) != table[2].charAt(i))
				{
					temp--;
				}
		}
		System.out.print( temp );
	}

}
