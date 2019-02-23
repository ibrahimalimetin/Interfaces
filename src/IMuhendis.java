/**
 *
 * @author Ibrahim Ali Metin
 */

//Bir çeşit class 'tır. 
public interface IMuhendis {
   //erişim belirleyici koymamıza gerek yok çünkü interfaceden obje oluşturamıyoruz!
    
    void askerlik_sorgula(); 
    String mezuniyet_notu(double not);
    void sicil();
    void is_tecrubesi(String[] dizi);
    // methodlarımızın imzalarını attık.
    
}
