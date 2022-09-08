package negocio;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main2 {
	public static void main(String[] args) throws Exception{
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy", Locale.UK);
		
		
		System.out.println("Primeira data: ");
		Scanner dh = new Scanner(System.in); 
		String aux = dh.nextLine();
		
		System.out.println("Segunda data:");
		Scanner dh1 = new Scanner(System.in); 
		String aux1 = dh1.nextLine();
		
		Date firstDate = data.parse(aux);//data antiga
        Date secondDate = data.parse(aux1);//data nova

        long diff = secondDate.getTime() - firstDate.getTime();

        TimeUnit time = TimeUnit.DAYS; 
        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
        System.out.println("The difference in days is : "+diffrence);
	}
}
