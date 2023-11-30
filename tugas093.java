public class PenjumlahanRekursif {
    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        int f = 8;
        int hasil = penjumlahanRekursif(f);
        
        System.out.print("Penjumlahan dari 1 hingga " + f + " adalah: ");
        System.out.println(hasil);
    }
}
