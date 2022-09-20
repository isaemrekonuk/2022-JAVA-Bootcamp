
package com.isaemrekonuk;

public class ReCapDemo2 {

    public static void main(String[] args) 
    {
        //double (ondalıklı) veri türünde dizimizi oluşturduk.
        double[] myList = { 1.2, 1.3, 4.3, 5.6 };
	double total = 0; //double (ondalıklı) türünde değişkenimizi tanımladık.
	double max = myList[0]; //double türündeki değişkenimize dizimizi atıyoruz.

        //for döngüsü ile dizi içerisindeki number'ları geziyoruz.
	for (double number : myList) 
        {
            if (max < number) //Eğer max değeri number değerinden küçük ise bu kod bloğu çalışır.
            {
                max = number; //number değerini max değişkenine atadık.
            }
	
            total = total + number; //total değeri ile number değerini topladık ve total değişkenine atadık.
            System.out.println(number); //number değerini konsola yazdırıyoruz.
	}
            //total ve max değişkenlerinin en son ki değerlerini konsola yazdırıyoruz.
            System.out.println("Toplam: " + total);
            System.out.println("En Büyük Sayı: " + max);
    }
    
}
