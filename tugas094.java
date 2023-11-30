import java.util.Scanner;
public class tugas094 {
    static boolean cekPrimaRekursif(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return cekPrimaRekursif(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan = 0;
        System.out.println("Masukkan Bilangan: ");
        bilangan = sc.nextInt();
        if (cekPrimaRekursif(bilangan, 2)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }
}