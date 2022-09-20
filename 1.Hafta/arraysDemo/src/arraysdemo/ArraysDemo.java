
package arraysdemo;

public class ArraysDemo {

    public static void main(String[] args) 
    {
        //String (metin) türünde değişkenlerimizi tanımladık.
        String ogrenci1 = "Emre";
	String ogrenci2 = "Ali";
	String ogrenci3 = "Mehmet";
		
        //Konsola değişkenlerimizi yazdırıyoruz.
	System.out.println(ogrenci1);
	System.out.println(ogrenci2);
	System.out.println(ogrenci3);

	System.out.println("-------------------------");
		
        //3 elemanlı, string (metin) türünde dizimizi tanımlıyoruz.
	String[] ogrenciler = new String[3];
        //dizide bulunmasını istediğimiz elemanlarımızı atadık.
	ogrenciler[0] = "Emre";
	ogrenciler[1] = "Ali";
	ogrenciler[2] = "Mehmet";
		
        //0'dan başlayarak diziboyunca dönecek olan for döngümüzü tanımladık.
	for (int i = 0; i < ogrenciler.length; i++) 
        {
            System.out.println(ogrenciler[i]); //Her döngüye giren i değerimizin değerini konsola yazdırıyoruz.
	}
        
	System.out.println("--------------------------");
	
        //Hemen üst tarafta tanımlamış olduğumuz for döngüsünün aynı işlevi yapan başka bir yazım versiyonu.
        for(String ogrenci:ogrenciler)
        {
		System.out.println(ogrenci);
	}
    }
    
}
