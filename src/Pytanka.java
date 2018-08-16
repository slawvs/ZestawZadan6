import java.util.*;

public class Pytanka {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Vector<Pytanko> Pytania = new Vector<Pytanko>();
		int punkty = 0;
		Pytanko pytanie1 = new Pytanko(" Ile mam lat ??"," 19 "," 27 "," 30 "," 28 ",31);
		Pytanko pytanie2 = new Pytanko(" Jaka jest moja ulubiona gra ?"," WoW "," Dota "," Fifa "," Uncharted ",102);
		Pytanko pytanie3 = new Pytanko(" Najlepsza marka samochod�w na �wiecie wg mnie :) "," Toyota "," Ferrari "," Ford "," BMW ",579);
		Pytanko pytanie4 = new Pytanko(" Ulubiona liga pi�karska ? "," Premier League "," Ekstraklasa "," Premiera Division "," Bundesliga ",1156);
		Pytanko pytanie5 = new Pytanko(" Lubi� placki ? "," TAAK! , z nutell� :)  "," Ni cholere "," Fuj "," Zawsze :) byle z d�emorem  ",1776);
		Pytanko pytanie6 = new Pytanko(" W co lubi� haratn�� ? "," W drzewo "," W ga�� "," Co to w ogole znaczy ?? "," w �y�� ",142225);
		Pytania.add(pytanie1);
		Pytania.add(pytanie2);
		Pytania.add(pytanie3);
		Pytania.add(pytanie4);
		Pytania.add(pytanie5);
		Pytania.add(pytanie6);
		System.out.println(" Let's play the game :)");
		for(int i=0; i < Pytania.size() ;i++ )
		{
			punkty = ZadajPytanko(Pytania,i,punkty);
			if(i<Pytania.size()-1) 
				{
					System.out.println("Czy jestes gotowy na nast�pne pytanie ? Je�eli tak to naci�nij Enter ");
					input.nextLine();
				}
		}
		OcenaOdpowiedzi(punkty);
		//*System.out.println("Zdobyles " + punkty + " punkcikow");
	}
	
	private static int ZadajPytanko(Vector <Pytanko> tab, int nr, int pkt)
	{
		Scanner input = new Scanner(System.in);
		String odp = "";
		int x = nr +1 ;
		System.out.println("Pytanie nr "+ x + " : ");
		System.out.println(tab.elementAt(nr).getPytanie());
		System.out.println("A : " + tab.elementAt(nr).getOdp1() + " B : " + tab.elementAt(nr).getOdp2() );
		System.out.println("C : " + tab.elementAt(nr).getOdp3() + " D : " + tab.elementAt(nr).getOdp4() );
		System.out.println(" Podaj Odpowiedz (A , B , C , lub D ) : ");
		odp = input.next();
		if(tab.elementAt(nr).getDobra().equals(odp))
		{
			System.out.println(" Dobra odpowiedz ! ");
			pkt++;
		} else 
		{
			System.out.println(" Zla odpowiedz ! ");
		}
		
		return pkt;
	}
	
	private static void OcenaOdpowiedzi(int pkt)
	{
		System.out.println();
		System.out.println();
		float procent = (float)pkt/Pytanko.getCounter()*100.0f;
		if(procent < 20.0)
		{
			System.out.println("Nawet nie wiesz ile mam lat ?? SHAME , SHAME , SHAME ,... ");
		}
		if(procent >= 20.0 && procent < 50.0)
		{
			System.out.println("Co Ty o mnie wiesz ? raczej nie wiele ");
		}
		if(procent >= 50.0 && procent < 70.0)
		{
			System.out.println("OK , zaakceptuje Twoje zaproszenie na Fejsbuczku, do�� si� naczeka�e�. ");
		}
		if(procent >= 70.0 && procent < 100.0)
		{
			System.out.println("Nie�le :) Kto Ci podpowiada�?");
		}
		if(procent == 100.0)
		{
			System.out.println("You my soul mate <3 ");
		}
		
	}

}
