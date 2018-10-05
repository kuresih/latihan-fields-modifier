
public class Penarik {
    private int saldo;
    private String pesan;
    private String namaNasabah;
    int nomerUrut=0;
    
    public void dataNasabah(String nama){
        namaNasabah=nama;
        System.out.println(" Nama Nasabah = " + namaNasabah);
    }
    public int tabungan(int jmlh){
        return saldo=saldo+jmlh;
    }
     public int getSaldo(){
        return saldo;
    }
     public String getPesan(){
         return pesan;
     }
    public int penarikan(int uang){
        if(saldo- uang < 50 ){
            System.out.println(" Saldo Tidak Cukup.");
            return saldo;
        }else{
            System.out.println(" Penarikan = " + uang);
            nomerUrut++;
           return saldo-=uang;
        }
        
    }
     public int penarikan(int uang, String isi){
        if(saldo - uang < 50 ){
            System.out.println(" Saldo tidak mencukupi.");
            return saldo;
        }else{
            System.out.println(" Penarikan  = " + uang);
            nomerUrut++;
            pesan=isi;
           return saldo-=uang;
           
        }
        
    }
   
}
