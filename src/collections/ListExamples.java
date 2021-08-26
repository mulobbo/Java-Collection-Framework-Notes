package collections;

import java.util.ArrayList;
import java.util.LinkedList;


public class ListExamples {
	public static void main(String[] args) {
		
		/*List:
		-Tekrarlý elemanlara izin verir.
		-Elemanlarý ekleme sýrasýna göre tutar.
		-Ýstenilen index e eleman eklenebilir.		
		*/
		/*
		 *-ArrayList 
		 *-LinkedList
		 * */
		
		//ArrayList:List ile ayný ozelliklere sahiptir.
		System.out.println("____________________________________ArrayList");
		ArrayList<String> isimler = new ArrayList<String>();
		isimler.add("Ali");
		isimler.add("Mehmet");
		isimler.add("Huseyin");
		isimler.add("Ayse");
		isimler.add("Selim");
		isimler.add("Murat");
		
		isimler.add("Ayse");
		
		isimler.add(2,"Hamza");
		
		isimler.forEach(isim -> System.out.println(isim+" "));
	
		
		/*LinkedList:ArrayList ten temel farklýlýðý ögelere direk erisime izin vermemesidir.Arama islemlerinde tüm elemanlarý gezer
		arraylist ise direk aranýlan elamana yönlendirir.ama ekleme ve silme islemlerinde ArrayList e gore daha hýzlýdýr */
		System.out.println("____________________________________LinkedList");
		LinkedList<String> isimler2 = new LinkedList<String>();
		isimler2.add("Ali");
		isimler2.add("Mehmet");
		isimler2.add("Huseyin");
		isimler2.add("Ayse");
		isimler2.add("Selim");
		isimler2.add("Murat");
		
		isimler2.add("Ayse");
		
		isimler2.add(2,"Hamza");
		
		
		isimler2.forEach(isim -> System.out.println(isim+" "));
		
	
		
		
	}

}
