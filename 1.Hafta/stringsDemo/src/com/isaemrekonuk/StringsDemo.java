
package com.isaemrekonuk;

public class StringsDemo {

    public static void main(String[] args) 
    {
       String mesaj = "Bugün hava çok güzel."; //String (metin) türünde değişkenimizi tanımladık.

	System.out.println(mesaj); //Değişkenimizi konsola yazdırıyoruz.
		
	/*System.out.println("Eleman sayısı: " + mesaj.length());
	System.out.println("5. eleman: " + mesaj.charAt(4));
	System.out.println(mesaj.concat(" Yaşasın!"));
	System.out.println(mesaj.startsWith("B"));
	System.out.println(mesaj.endsWith("."));
	char[] karakterler = new char[5];
	mesaj.getChars(0, 5, karakterler, 0);
	System.out.println(karakterler);
	System.out.println(mesaj.indexOf("av"));
	System.out.println(mesaj.lastIndexOf('a'));*/
		
        //mesaj değişkenimize atanmış olan cümledeki kelimelerin arasına - işareti koyuyoruz.
	String yeniMesaj = mesaj.replace(' ', '-');
	System.out.println(yeniMesaj); //Değişenimizi konsola yazdırıyoruz.
        //Değişkenimize atalı olan cümlenin içerisinden bir parça alıyoruz.
	System.out.println(mesaj.substring(2,5)); 
	
        //Tanımlamış olduğumuz for döngümüz ile cümlemizdeki kelimeleri alt alta yazdırıyoruz.
        for(String kelime:mesaj.split(" ")) 
        {
            System.out.println(kelime);
	}
		
	System.out.println(mesaj.toLowerCase()); //Cümlemizdeki tüm kelimelerin baş harflerini küçük harfle yazdırıyoruz.
	System.out.println(mesaj.toUpperCase()); //Cümlemizdeki tüm kelimelerin harflerini büyük harfle yazdırıyoruz.
	System.out.println(mesaj.trim()); //Cümlemizin başındaki ve sonundaki boşlukları atıyoruz.
		
    }
    
}
