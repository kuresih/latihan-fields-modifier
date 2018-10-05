
public class Penarik {
    private int saldo;
    private String pesan;
    private String namaNasabah;
    int nomorUrut=0;
    
    public void dataNasabah(String name){
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
    public int tarikUang(int uang){
        if(saldo- uang < 50 ){
            System.out.println(" Saldo Tidak Cukup.");
            return saldo;
        }else{
            System.out.println(" Penarikan = " + uang);
            noUrut++;
           return saldo-=uang;
        }
        
    }
     public int tarikUang(int uang, String isi){
        if(saldo - uang < 50 ){
            System.out.println(" Saldo tidak mencukupi.");
            return saldo;
        }else{
            System.out.println(" Penarikan  = " + uang);
            noUrut++;
            pesan=isi;
           return saldo-=uang;
           
        }
        
    }
   
}
