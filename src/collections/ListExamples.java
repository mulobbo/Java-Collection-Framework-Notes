package collections;

import java.util.ArrayList;
import java.util.LinkedList;


public class ListExamples {
	public static void main(String[] args) {
		
		/*List:
		-Tekrarl� elemanlara izin verir.
		-Elemanlar� ekleme s�ras�na g�re tutar.
		-�stenilen index e eleman eklenebilir.		
		*/
		/*
		 *-ArrayList 
		 *-LinkedList
		 * */
		
		//ArrayList:List ile ayn� ozelliklere sahiptir.
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
	
		
		/*LinkedList:ArrayList ten temel farkl�l��� �gelere direk erisime izin vermemesidir.Arama islemlerinde t�m elemanlar� gezer
		arraylist ise direk aran�lan elamana y�nlendirir.ama ekleme ve silme islemlerinde ArrayList e gore daha h�zl�d�r */
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
