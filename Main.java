public class Main {
    public static void main(String[] args){
        // Membuat objek dan beri nilai
        Pegawai john = new Pegawai("Johan", 3800000);
        Manager suy= new Manager ("Suy", 4000000, 7000000);
        Programmer heri= new Programmer ("Heri", 3950000, 500000);

        // Memanggil atribut
        john.cetakInfo();
        suy.cetakInfo();
        heri.cetakInfo();
    }
}
