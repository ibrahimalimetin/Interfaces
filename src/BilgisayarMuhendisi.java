/**
 *
 * @author Ibrahim Ali Metin
 */

public class BilgisayarMuhendisi implements IMuhendis{
    private boolean askerlik;
    private boolean sicil;

    public BilgisayarMuhendisi(boolean askerlik, boolean sicil) {
        this.askerlik = askerlik;
        this.sicil = sicil;
    }
    
    @Override
    public void askerlik_sorgula() {
         if(askerlik){
             System.out.println("Askerlik yapıldı.");
         }
         else{
             System.out.println("Askerlik yapılmadı");
         }
    }

    @Override
    public String mezuniyet_notu(double not) {
         return "Not Ortalaması : " +not;
    }

    @Override
    public void sicil() {
        
        if(sicil){
            System.out.println("Adli sicil kaydı vardır!");
        }
        else{
            System.out.println("Herhangi bir sicil kaydı yoktur.");
        }
         
    }
    @Override
    public void is_tecrubesi(String[] dizi) {
         
        System.out.println("Bilgisayar Mühendisi olarak çalıştığım şirketler:");
        for (int i = 0 ; i < dizi.length ; i++){
            System.out.println(dizi[i]);
        }
    }
    
}
