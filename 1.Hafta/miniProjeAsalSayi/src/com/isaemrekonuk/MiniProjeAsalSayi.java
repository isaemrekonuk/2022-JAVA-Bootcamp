
package com.isaemrekonuk;

public class MiniProjeAsalSayi {

    public static void main(String[] args) 
    {
        int number = 2; //int (tamsayı) türünde değişkenimizi tanımladık.
	int remainder = number % 2; //number değişkenimizdeki değerin 2'ye bölümünden kalan değeri yeni bir değişkenimize atıyoruz.
	boolean asalMi = true; //boolean veri türünde değişkenimizi tanımladık.
	System.out.println(remainder); //Değişkenimizi konsola yazdırıyoruz.
		
	if(number == 1) //Eğer number değeri 1'e eşit ise bu kod bloğu çalışır.
        {
            System.out.println("Sayı asal değildir."); //Konsola yazdırılır.
            return; //Komutumuz ile işlemleri sonlandırıyoruz.
	}
        
        if(number < 1) //Eğer number değeri 1'den küçük ise bu kod bloğu çalışır.
        {   
            System.out.println("Geçersiz sayı."); //Konsola yazdırılır.
            return; //Komutumuz ile işlemleri sonlandırıyoruz.
	}
        
        //Sayının asal olup olmadığını kontrol ettiğimiz kod bloğu
	for (int i = 2; i < number ; i++) 
        {
            if(number % i == 0) 
            {
		asalMi = false;
            }		
	}
		
	if(asalMi) //Eğer değerimiz true ise bu kod bloğu çalışır.
        {
            System.out.println("Sayı asaldır."); //Konsola yazdırılır.
	}
        else //Eğer değerimiz true değil ise bu kod bloğu çalışır.
        {
            System.out.println("Sayı asal değildir."); //Konsola yazdırılır.
	}
    }
    
}
