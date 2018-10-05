
public class Bank {
    public static void main(String[] args) {
        final String Bank=" Bank A";
        System.out.println(" Nama Bank = " + Bank);
        System.out.println();
        Penarik nasabahA = new Penarik();
        nasabahA.dataNasabah("Kuresih");
        nasabahA.tabungan(2000000);
        nasabahA.Penarikan(900000);
        nasabahA.Penarikan(30000,"Perawatan kulit");

        System.out.println(nasabahA.getSaldo());
        System.out.println(nasabahA.getSaldo() + "  " + nasabahA.getPesan());

        System.out.println();
        Penarik nasabahB = new Penarik();
        nasabahB.dataNasabah("Sastuti");
        nasabahB.tabungan(2000000);
        nasabahB.Penarikan(400000);
        nasabahB.Penarikan(500000,"Membeli Make up");
        
        System.out.println("\n Jumlah Nasabah Penarikan Uang : " + nasabahA.noUrut+" Orang");
        
    }
    
}
