/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class ElektrikMuhendisi implements IMuhendis, ICalisma{
    
    private boolean askerlik;
    private boolean sicil;

    public ElektrikMuhendisi(boolean askerlik, boolean sicil) {
        this.askerlik = askerlik;
        this.sicil = sicil;
    }

    @Override
    public void calis() {
        System.out.println("Elektrik Mühendisi Çalışıyor....");
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
         
        if(dizi.length == 0 ){
            System.out.println("İş tecrüesi bulunmamaktadır.");
        }
        else {
            System.out.println("Elektrik Mühendisi olarak buralarda çalıştım: ");
            for(int i = 0 ; i < dizi.length; i++){
                System.out.println(dizi[i]);
            }
        }
               
    }
    public void referans(String[] dizi){
        if (dizi.length == 0 ){
            System.out.println("Referans bulunamadı");
        }
        else {
            System.out.println("Referanslar : ");
            for(int i = 0 ; i < dizi.length ; i++){
                System.out.println(dizi[i]);
            }
        }
    }
}
