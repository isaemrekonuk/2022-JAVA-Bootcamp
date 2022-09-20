
package com.isaemrekonuk;

public class MultiDimensionalArrayDemo {

    public static void main(String[] args) 
    {
        //String veri türünde çok boyutlu dizimizi tanımlıyoruz.
        String[][] sehirler = new String[3][3];

        //Dizimize indis numaralarına göre değer ataması yapıyoruz.
	sehirler[0][0] = "İstanbul";
	sehirler[0][1] = "Bursa";
	sehirler[0][2] = "Bilecik";
	sehirler[1][0] = "Ankara";
	sehirler[1][1] = "Konya";
	sehirler[1][2] = "Kayseri";
	sehirler[2][0] = "Diyarbakır";
	sehirler[2][1] = "Şanlıurfa";
	sehirler[2][2] = "Gaziantep";
		
        //For döngüsü 0'dan başlayarak 2'ye kadar (2 dahil) her seferinde 1 arttırarak döngümüz devam edecek.
	for(int i = 0; i<=2; i++) 
        {
            System.out.println("------------");
            
            //For döngüsü 0'dan başlayarak 2'ye kadar (2 dahil) her seferinde 1 arttırarak döngümüz devam edecek.
            for(int j = 0; j<=2; j++) 
            {
                System.out.println(sehirler[i][j]); //Dizimizdeki değerleri indis numaralarına göre konsola yazdırıyoruz.
            }
        }
    }
    
}
