
package com.isaemrekonuk;

public class RecapDemo1 {

    public static void main(String[] args) 
    {
        //int (tamsayı) türünde değişkenlerimizi tanımladık.
        int sayi1 = 27;
	int sayi2 = 255;
	int sayi3 = 29;
	int enBuyuk = sayi1; //sayi1 değişkenimizi enBuyuk değişkenimize atadık.
	
        //Eğer enBuyuk değişkenindeki değer sayi2 değişkenindeki değerden küçük ise bu kod bloğu çalışır.
	if (enBuyuk < sayi2)  
        {
            enBuyuk = sayi2; //sayi2 değişkenimizi enBuyuk değişkenimize atadık.
	}
	
        //Eğer enBuyuk değişkenindeki değer sayi3 değişkenindeki değerden küçük ise bu kod bloğu çalışır.
	if (enBuyuk < sayi3) 
        {
            enBuyuk = sayi3; //sayi3 değişkenimizi enBuyuk değişkenimize atadık.
	}
		
	System.out.println("En büyük sayı: " + enBuyuk); //Konsola enBuyuk değişkenimizi yazdırıyoruz.
		
    }
    
}
