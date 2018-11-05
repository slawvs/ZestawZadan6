import java.util.Scanner;

public class Jszycer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine())
		{
			System.out.println(SzyfrCezaraDlaZdan(input.nextLine()));
		}

	}

	private static char SzyfrCezaraLepszy(char a)
	{
		final int numberOflettersInAlphabet = 26;
		int pom;
		pom = (int)a;
		if(pom >= 'X' && pom <= 'Z')
		{
			pom = pom - numberOflettersInAlphabet;
		}
		pom += 3;
		return (char)pom;
	}
	
	private static String SzyfrCezaraDlaZdan(String zdanie)
	{
		String wynik = "";
		for(int i = 0; i < zdanie.length(); i++)
		{
			char znak = zdanie.charAt(i);
			int pom = (int) znak;
			if( pom >= 'A' && pom <= 'Z'  )
			{
				znak = SzyfrCezaraLepszy(znak);
				wynik = wynik + znak;
			}
			else
			{
				wynik = wynik + znak;
			}
		}
		return wynik;
	}
}
