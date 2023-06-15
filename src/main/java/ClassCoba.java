import java.util.Scanner;

public class ClassCoba {

    public static void coba(int z,String y){
        for (int i=0;i<z;i++){
            for (int x=0;x<i;x++){
                System.out.print(y);
            }
            System.out.println(y);
        }
    }

    public static void segitiga(int i, String y){
        for (int x = 1; x <= i; x++) {
            for (int j = 1; j <= i - x; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * x - 1; k++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = Integer.parseInt(sc.nextLine());
        System.out.print("Masukkan Huruf : ");
        String huruf = sc.nextLine();
        System.out.println("==========Setengah Segitiga==========");
        coba(angka,huruf);
        System.out.println("==========Segitiga Piramida==========");
        segitiga(angka,huruf);
    }
}