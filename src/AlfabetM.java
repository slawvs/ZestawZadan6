import java.util.Scanner;

public class AlfabetM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int offsetToUppercaseInAscii = 65;
		final int offsetToLowercaseInAscii = 97;
		String [] Morse = {".-","-...","-.-.","-..",".",".-..","--.","....","..",".---",
				"-.-","..-.","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
				".--","-..-","-.--","--.."};
		while(input.hasNextLine())
		{
			System.out.println();
			String line = input.nextLine();
			for(int i=0; i < line.length(); i++)
			{
				char temp = line.charAt(i);
				if(temp == ' ') System.out.print('/');
				else
				{
					if(temp >= 'A' && temp <= 'Z') 
					{
						System.out.print(Morse[(int)temp - offsetToUppercaseInAscii]);
						System.out.print('/');
					}
					else
					{
						if(temp >= 'a' && temp <= 'z') 
						{
							System.out.print(Morse[(int)temp - offsetToLowercaseInAscii]);
							System.out.print('/');
						}
					}	
				}
				
			}
		}

	}

}
