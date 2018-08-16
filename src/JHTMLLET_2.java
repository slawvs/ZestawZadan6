import java.util.Scanner;

public class JHTMLLET_2 {

	public static void main(String[] args) {
		String linia = "" ;
		Scanner stdInput = new Scanner(System.in);
		
			while(stdInput.hasNextLine())
			{
				int byloRozpoczecieTagu = 0;
				linia = stdInput.nextLine();
				for(int j = 0; j < linia.length();j++)
				{
					int pom = (int)linia.charAt(j);
					if( pom == '<' ) byloRozpoczecieTagu++;
					if( byloRozpoczecieTagu > 0 && pom == '>' ) byloRozpoczecieTagu--;
					if(byloRozpoczecieTagu>0)
					{
						if( pom >= 'a' && pom <= 'z')
						{
							pom = pom - 32;
						}
					}
					System.out.print((char)pom);
				}
				System.out.println();
			}	

	}

}
