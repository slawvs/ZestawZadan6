import java.util.Scanner;

public class JHTMLLET_2 {

	public static void main(String[] args) {
		String linia = "" ;
		Scanner stdInput = new Scanner(System.in);
		final int przesuniecieDoDuzychLiterWAscii = 32;
			while(stdInput.hasNextLine())
			{
				boolean byloRozpoczecieTagu = false;
				linia = stdInput.nextLine();
				for(int j = 0; j < linia.length();j++)
				{
					int pom = (int)linia.charAt(j);
					if( pom == '<' ) byloRozpoczecieTagu=true;
					if( byloRozpoczecieTagu == true && pom == '>' ) byloRozpoczecieTagu=false;
					if(byloRozpoczecieTagu==true)
					{
						if( pom >= 'a' && pom <= 'z')
						{
							pom = pom - przesuniecieDoDuzychLiterWAscii;
						}
					}
					System.out.print((char)pom);
				}
				System.out.println();
			}	

	}

}
