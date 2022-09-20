
package com.isaemrekonuk;


public class Conditionals {

    public static void main(String[] args) 
    {
        int sayi = 20; //int (tamsayı) türünde değişkenimizi tanımladık.
	
        if(sayi < 20)  //Eğer sayi değişkeni 20'den küçük ise bu kod bloğu çalışacak.
        {
            System.out.println("Sayı 20'den küçüktür."); //Konsola yazdırılacak.
	}
        else if(sayi == 20) //Eğer sayi değişkeni 20'ye eşit ise bu kod bloğu çalışacak.
        {
            System.out.println("Sayı 20'ye eşittir."); //Konsola yazdırılacak.
	}
        else //Eğer hiçbir şart sağlamıyorsa bu kod bloğu çalışacak.
        {
       	    System.out.println("Sayı 20'den küçük değildir."); //Konsola yazdırılacak.
	}
    }
    
}
