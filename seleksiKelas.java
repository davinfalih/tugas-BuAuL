import java.util.Scanner;

public class seleksiKelas {
    public static void main(String[] args) {
        int pilihan;
        String kelas;

        Scanner s = new Scanner(System.in);
        System.out.println("masukkan pilihan kelas: ");
        System.out.println("1 XRPL1\n2 XRPL2\n3 XRPL3\n4 XRPL 4\n5 XRPL 5\n6 XRPL 6");
        pilihan = s.nextInt();
        
        switch (pilihan) {
            case 1:
                kelas = "XRPL1";
                break;
            case 2:
                kelas = "XRPL2";
                break;
            case 3:
                kelas = "XRPL3";
                break;
            case 4:
                kelas = "XRPL4";
                break;
            case 5:
                kelas = "XRPL5";
                break;
            case 6:
                kelas = "XRPL6";
                break;
            default:
                kelas = "kelas tidak terdaftar";
        }
                System.out.println("kelas "+kelas);
    
  }
}
