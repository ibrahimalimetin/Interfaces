/**
 *
 * @author Ibrahim Ali Metin
 */
public class Main {
    public static void main(String[] args) {
        //Javada bir class birden fazla interface 'i implemented edebilir. 
       /* BilgisayarMuhendisi muhendis1 = new BilgisayarMuhendisi(false, false);
        //interface den obje oluşturamıyoruz fakat onu implemented eden class 'ın objesine referan olabilir. 
        //IMuhendis muhendis1 = new BilgisayarMuhendisi(false, false);
        
        muhendis1.askerlik_sorgula();
        muhendis1.sicil();
        System.out.println(muhendis1.mezuniyet_notu(3.1));
        String [] kariyer = {"Kale" , "Casper" , "HP"};
        muhendis1.is_tecrubesi(kariyer);
*/
       //IMuhendis muhendis2 = new ElektrikMuhendisi(true, false);
       ElektrikMuhendisi muhendis2 = new ElektrikMuhendisi(true, true);
       String[] tecrube = {};
       String[] referans = {"Ali" , "Veli"};
       
       muhendis2.askerlik_sorgula();
       muhendis2.is_tecrubesi(tecrube);
       muhendis2.sicil();
       System.out.println(muhendis2.mezuniyet_notu(2.2));
       //((ElektrikMuhendisi)muhendis2).referans(referans);// muhendis2 referasnsımız ElektrikMuhendisi class 'ının bir referans olduğu için bu şekilde kullanabiliriz. 
       muhendis2.calis();
       //
    }        
}
