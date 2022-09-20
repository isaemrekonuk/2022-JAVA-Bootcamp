
package com.isaemrekonuk;

public class ArkadasSayilar {

    public static void main(String[] args) 
    {
        //int (tamsayı) türünde değişkenlerimizi tanımladık.
       int number1 = 220;
       int number2 = 284;   
       int total1 = 0;  
       int total2 = 0;

       for (int i = 1; i < number1; i++) //For döngümüz 1'den başlayarak number1 değişkenine kadar 1 arttırılarak dönecek.
       {
            if(number1 % i == 0)  //Eğer number1 değişkeninin i değerine bölümünden kalan 0'a eşit ise bu kod bloğu çalışacak.
            {
		total1 = total1 + i; //total1 değişkeni ile i değişkenini toplayıp total1 değişkenine atadık.
            }
	}
       
	for (int j = 1; j < number2; j++) //For döngümüz 1'den başlayarak number2 değişkenine kadar 1 arttırılarak dönecek.
        {   
            if(number2 % j == 0) //Eğer number2 değişkeninin j değerine bölümünden kalan 0'a eşit ise bu kod bloğu çalışacak.
            {
                total2 = total2 + j; //total2 değişkeni ile j değişkenini toplayıp total2 değişkenine atadık.
            }
	}
	
        //Eğer number1 değeri ile total2 değeri eşit ve number değeri ile total1 değeri eşit ise bu kod bloğu çalışır.
	if(number1 == total2 && number2 == total1) 
        {
            System.out.println("Bu sayılar arkadaş sayılardır."); //Konsola yazdırıyoruz.
	}
        else //if bloğundaki şart geçerli değil ise bu blok çalışır.
        {
            System.out.println("Bu sayılar arkadaş sayı değildir."); //Konsola yazdırıyoruz.
	}
    }
    
}
