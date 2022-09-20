
package com.isaemrekonuk;

public class MukemmelSayi {

    public static void main(String[] args) 
    {
        //int (tamsayı) türünde değişkenlerimizi tanımladık.
        int number = 6;
	int toplam = 0;
		
	for (int i = 1; i < number; i++)  //Döngümüz 1'den başlayarak number değerine kadar 1 arttırılarak dönecek.
        {
            if(number % i == 0) //Eğer number değerinin i değerine bölümünden kalan 0'a eşit ise bu kod bloğu çalışır.
            {
		toplam = toplam + i; //toplam değişkeni ile i değerini toplayıp toplam değişkenine atadık.
            }
	}
		
	if(number == toplam)  //Eğer number değeri ile toplam değeri eşit ise bu kod bloğu çalışır.
        {
            System.out.println("Bu sayı mükemmel sayıdır."); //Konsola yazdırıyoruz.
	}
        else //Eğer number değeri ile toplam değeri eşit değil ise bu kod bloğu çalışır.
        {
            System.out.println("Bu sayı mükemmel sayı değildir."); //Konsola yazdırıyoruz.
	}

    }
    
}
