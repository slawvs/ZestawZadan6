import java.util.*;

public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		Vector<String> niedowaga = new Vector<String>();
		Vector<String> prawidlowa = new Vector<String>();
		Vector<String> nadwaga = new Vector<String>();
		for(int i = 0; i < t ; i++)
		{
			String temp = input.next();
			float masa = (float) input.nextInt();
			float wzrost = ((float) input.nextInt())/100;
			float bmi = masa / (wzrost*wzrost);
			if(bmi < 18.5 )
			{
				niedowaga.add(temp);
			}
			else if(bmi >= 18.5 && bmi < 25.0)
			{
				prawidlowa.add(temp);
			}else
			{
				nadwaga.add(temp);
			}
		}
		System.out.println();
		System.out.println("niedowaga");
		for( String item : niedowaga)
	    {
			System.out.println(item);
	    } 
		System.out.println();
		System.out.println("wartosc prawidlowa");
		for( String item : prawidlowa)
	    {
			System.out.println(item);
	    } 
		System.out.println();
		System.out.println("nadwaga");
		for( String item : nadwaga)
	    {
			System.out.println(item);
	    } 
		
	}

}
