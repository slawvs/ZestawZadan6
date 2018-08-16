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
		int pom;
		pom = (int)a;
		if(pom > 87 && pom < 91)
		{
			pom = pom - 26;
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
			if( pom > 64 && pom < 91  )
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
