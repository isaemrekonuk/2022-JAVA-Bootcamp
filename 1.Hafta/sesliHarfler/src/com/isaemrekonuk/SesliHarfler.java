
package com.isaemrekonuk;

public class SesliHarfler {

    public static void main(String[] args) 
    {
        char harf = 'I'; //char (tek karakter) türünde değişkenimizi tanımladık.

	switch (harf) 
        {
            //case bloklarında yer alan herhangi bir harf ise bu blok çalışır.
            case 'A':
            case 'I':
            case 'O':
            case 'U':
		System.out.println("Kalın sesli harf"); //Konsola yazdırılır.
                break; //İşlem sonlandırılır.
		
            default: //case bloklarında yer alan herhangi bir harf değil ise bu blok çalışır.
		System.out.println("İnce sesli harf."); //Konsola yazdırılır.
	}
    }
    
}
