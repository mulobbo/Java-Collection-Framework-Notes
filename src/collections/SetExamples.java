package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetExamples {
	
	public static void main(String[] args) {
		
		/*Set: Ayni elemandan 2 adet bulunmasina izin vermez (null dahil)
		
		-HashSet
		-LinkedHashSet
		-TreeSet
		
		
		*/
		//Hashset:Hashleme ile tutulur.-Veri sirasi korunmaz senkronize deðildir.
		System.out.println("_____________________________________HashSet");
		HashSet<String> meyveler = new HashSet<String>();
		
		meyveler.add("C");
		meyveler.add("Elma");
        meyveler.add("Armut");
        meyveler.add("Muz");
        meyveler.add("Çilek");
        meyveler.add("Çilek");
		meyveler.forEach(meyve -> System.out.println(meyve +" "));
		
		System.out.println("_____________________________________LinkedHashSet");
		
		//LinkedHashSet:Hashleme ile tutulur ancak ekleme sirasi korunur 
		LinkedHashSet<String> aylar = new LinkedHashSet<String>();
		
		aylar.add("ocak");
		aylar.add("subat");
		aylar.add("mart");
		aylar.add("nisan");
		aylar.add("mayis");
		aylar.add("haziran");
		aylar.add("temmuz");
		aylar.add("agustos");
		aylar.add("eylul");
		aylar.add("ekim");
		aylar.add("kasim");
		aylar.add("aralik");
		
		aylar.forEach(ay -> System.out.println(ay +" "));
		System.out.println("______________________________TreeSet");
		
		//Treeset:Artan sirada tutulur(ascending) null eklenirse NullPointer exception atar
		
		TreeSet<Integer> sayilar = new TreeSet<Integer>();
		sayilar.add(3);
		sayilar.add(2);
		sayilar.add(5);
		sayilar.add(8);
		sayilar.add(9);
		sayilar.add(1);
		
		
		sayilar.forEach(sayi -> System.out.println(sayi+" "));
		
		
		
	}
	

}
