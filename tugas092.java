public class tugas092 {
    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Deret descending rekursif:");
        deretDescendingRekursif(n);
    }
    public class DeretDescendingIteratif {
        static void deretDescendingIteratif(int n) {
            for (int i = n; i >= 0; i--) {
                System.out.print(i + " ");
            }
        }
        public static void main(String[] args) {
            int n = 10;
            System.out.println("Deret descending iteratif:");
            deretDescendingIteratif(n);
        }
    }
}
