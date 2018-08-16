
public class Pytanko {
	private String Pytanie;
	private String odp1,odp2,odp3,odp4,dobra;
	private static int counter=0;
	
	Pytanko(String Pytanie,String odp1, String odp2, String odp3, String odp4, int kod)
	{
		this.Pytanie=Pytanie;
		this.odp1 = odp1;
		this.odp2 = odp2;
		this.odp3 = odp3;
		this.odp4 = odp4;
		dobra = Kodowanie(kod);
		counter++;
	}
	
	private String Kodowanie(int number)
	{
		number = 65 + (number % 4);
		String temp = "";
		temp += (char)number;
		return temp ;
	}

	public String getPytanie() {
		return Pytanie;
	}

	public String getOdp1() {
		return odp1;
	}

	public String getOdp2() {
		return odp2;
	}

	public String getOdp3() {
		return odp3;
	}

	public String getOdp4() {
		return odp4;
	}

	public String getDobra() {
		return dobra;
	}
	
	public static int getCounter() {
		return counter;
	}
	

}
