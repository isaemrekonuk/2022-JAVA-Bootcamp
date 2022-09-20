
package com.isaemrekonuk;


public class LoopDemo {

    public static void main(String[] args) 
    {
       //for döngümüzü tanımladık.
	for(int i=2;i<10; i+=2) //Döngümüzdeki i değeri 2 ile başlayacak ve 2'şer 2'şer artarak 10'a kadar sayacak.
        {
            System.out.println(i); //i değerini ekrana yazdırıyoruz.
	}
	
        //Döngüden çıkınca ekrana yazdırılır.
        System.out.println("For Döngüsü bitti.");
		
	
	int i = 2; //int (tamsayı) türünde değişkenimizi tanımladık.
        
        //While döngümüzü tanımladık.
	while(i<10)  //i değeri 10'dan küçük olduğu sürece bu döngü çalışacak.
        {
            System.out.println(i); //i değerini ekrana yazdırıyoruz.
            i+=2; //i değerini her defasında 2 artırıyoruz.
	}		
        
        //Döngüden çıkınca ekrana yazdırılır.
        System.out.println("While döngüsü bitti.");
			
        
	int j = 100; //int (tamsayı) türünde değişkenimizi tanımladık.
        
        //Do-While göndümüzü tanımladık.
        //do bloğuna girecek ve içerisindeki komutları uygulayacak daha sonra while içinde yazan koşula bakacak.
        //Eğer koşulu sağlıyorsa tekrar döngüye girecek.
        do   
        {
            System.out.println(j); //j değerini ekrana yazdırıyoruz.
            j+=2; //j değerini her defasında 2 artırıyoruz.	
        } 
        
        while (j<10); //j değeri 10'dan küçük ise döngüye devam eder.
	
        //Döngüden çıkınca ekrana yazdırılır.
        System.out.println("Do-While döngüsü bitti.");
    }
    
}
