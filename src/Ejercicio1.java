import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ejercicio1 {
    public static String Date_Format = "dd-MM-yyyy";
    Scanner sc = new Scanner(System.in);
    System.out.println("Hola, necesito que insertes unos valores en la consola");



    public static boolean isDateValid(String date){
        try{
            DateFormat df = new SimpleDateFormat(Date_Format);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e){
            return false;
        }
    }
}
