import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _21010310033_DosyaOkuma {
	 public static String dosya;
	    public static String[] degiskenler; 
	    public static int [][] Tablo;
	    public  static String[] denklem;
	    public static String []satirlar;
	    public static String metin;

	    public static void dosyaOkuma() {
	        String dosyaYolu = "boole.txt";

	        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
	            dosya = reader.readLine();
	           
	            System.out.println("boole.txt dosyasý okundu");

	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("bulunamadý");
	        }

	        degiskenler = islemler(dosya);
	        Arrays.sort(degiskenler, 1, degiskenler.length);
	   
	        
	    }
	    
	    public static String[] islemler(String dosya) {
	        List<String> degiskenlerList = new ArrayList<>(); 

	        for (int i = 0; i < dosya.length(); i++) {
	            char karakter = dosya.charAt(i);
	            if (Character.isLetter(karakter) && !degiskenlerList.contains(String.valueOf(karakter))) {
	                degiskenlerList.add(String.valueOf(karakter)); 
	            }
	        }

	        
	        String[] degiskenler = new String[degiskenlerList.size()];
	        for (int i = 0; i < degiskenlerList.size(); i++) {
	            degiskenler[i] = degiskenlerList.get(i);
	        }

	       
	        for (int i = 0; i < dosya.length(); i++) {
	            dosya = dosya.replace("+", "");
	            dosya = dosya.replace("=", "");
	        }

	       denklem = dosya.split("\\s+");
	        

	       
	        return degiskenler;
	    }
}
