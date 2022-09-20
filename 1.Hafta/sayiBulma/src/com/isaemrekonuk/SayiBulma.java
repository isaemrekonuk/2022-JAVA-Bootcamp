
package com.isaemrekonuk;

public class SayiBulma {

    public static void main(String[] args) 
    {
        //int (tamsayı) türünde dizimizi tanımladık.
        int[] sayilar = new int[] {1,2,5,7,9,0};
	int aranacak = 123; //int (tamsayı) türünde değişkenimizi tanımladık.
	boolean varMi = false; //boolean türünde değişkenimizi tanımladık.
		
        for(int bul:sayilar) //for döngüsü sayilar dizisi boyunca gezecek.
        {   //Eğer aranacak değişkeni ve bul değişkenlerinin değerleri eşit ise bu kod bloğu çalışacak.
            if(aranacak == bul)  
            {
                varMi = true; //Değişkenimize değer ataması yaptık.
		break; //İşlemleri sonlandırdık.
            }
	}
		
        if(varMi)  //Eğer varMi değişkeni true ise bu kod bloğu çalışacak.
        {
            System.out.println("Bu sayı dizinin içinde var."); //Konsola yazdırıyoruz.
	}
        else  //Eğer varMi değişkeni false ise bu kod bloğu çalışacak.
        {
            System.out.println("Bu sayı dizinin içinde yok."); //Konsola yazdırıyoruz.
	}
    }
    
}
