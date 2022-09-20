
package com.isaemrekonuk;

public class SwitchDemo {

    public static void main(String[] args) 
    {
        char grade = 'K'; //char (tek karakter) türünde değişkenimizi tanımladık.

	switch (grade) //grade değişkenine atanan değere göre case bloklarını çalıştırıyor.
        {
            case 'A': //grade değişkenine atanan değer A ise bu blok çalışır.
                    System.out.println("Mükemmel : Geçtiniz."); //Konsola yazdırılır.
                    break; //case bloğu sonlandırılır.
            case 'B': //grade değişkenine atanan değer A ise bu blok çalışır.
                    System.out.println("Çok Güzel : Geçtiniz."); //Konsola yazdırılır.
                    break; //case bloğu sonlandırılır.
            case 'C': //grade değişkenine atanan değer A ise bu blok çalışır.
                    System.out.println("İyi : Geçtiniz."); //Konsola yazdırılır.
                    break; //case bloğu sonlandırılır.
            case 'D': //grade değişkenine atanan değer A ise bu blok çalışır.
                    System.out.println("Fena Değil : Geçtiniz."); //Konsola yazdırılır.
                    break; //case bloğu sonlandırılır.
            case 'F': //grade değişkenine atanan değer A ise bu blok çalışır.
                    System.out.println("Maalesef : Kaldınız."); //Konsola yazdırılır.
                    break; //case bloğu sonlandırılır.
            default: //grade değişkenine atanan değer case bloklarını sağlamıyor ise bu blok çalışır.
                    System.out.println("Geçersiz not girdiniz."); //Konsola yazdırılır.

	}
    }
    
}
