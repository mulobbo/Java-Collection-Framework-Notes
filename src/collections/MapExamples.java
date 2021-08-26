package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		
		/*Map<K,V>:
		 * -Esleme tablolaridir
		 * -Tekrarli Key olamaz
		 * -Value lar bit key ile eslenmek zorundadir ve bu key ile cagrilir
		 * ----
		 * -HashMap
		 * -TreeMap
		 * -HashTable 
		 */
		
		//HashMap:Sirali eleman tutmaz,null key ve null value kabul eder.
		
		System.out.println("_______________________HashMap");
		HashMap<String,String> kelimeler = new HashMap<String, String>();
		kelimeler.put("apple","elma");
		kelimeler.put("book","Kitap");
		kelimeler.put("watch","saat");
		kelimeler.put("pen","kalem");
		
		kelimeler.forEach((kelimeEN,kelimeTR)->System.out.println("en: "+kelimeEN+" = tr: "+kelimeTR));
		
		//TreeMap:Siralý olarak eleman tutar(ascending),null key ve null value kabul eder.
		System.out.println("______________________TreeMap");
		TreeMap<Integer, String> ogrenciler = new TreeMap<Integer, String>();
		ogrenciler.put(5,"Ahmet");
		ogrenciler.put(8,"Mehmet");
		ogrenciler.put(3,"Selim");
		ogrenciler.put(4,"Murat");
		
		ogrenciler.forEach((numara,isim)->System.out.println("numara : "+numara+" ogrenci: "+isim));
		
		//HashTable:Senkronizedir null deger kabul etmez,senkronize olmasi nedeniyle HashMap den yavastir
		System.out.println("______________________HashTable");
		Hashtable<Integer,String> ogrenciler2 = new Hashtable<Integer, String>();
		ogrenciler2.put(7,"Ahmet");
		ogrenciler2.put(5,"Mehmet");
		ogrenciler2.put(3,"Selim");
		ogrenciler2.put(1,"Murat");
		
		ogrenciler2.forEach((numara,isim)->System.out.println("numara : "+numara+" ogrenci: "+isim));
	}
	
}
