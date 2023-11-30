import java.util.Scanner;
public class tugas09  {
    static int penjumlahanBilangan(int x, int y) {
        if (y == 0) {
            System.out.print("1 = ");
            return 1;
        } else if (y == 1) {
            System.out.print(x + " = ");
        } else {
            System.out.print(x + "+");
            return x * penjumlahanBilangan(x, y - 1);
        }
    }
    public static void main(String[] args) {
        int bilangan, pangkat;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        
        int hasil = penjumlahanBilangan(bilangan, pangkat);
        System.out.println(hasil);
    }
}