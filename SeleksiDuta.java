import java.util.Scanner;

public class SeleksiDuta {
    public static void main(String[] args) {
        String nama, kelas, perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.println("masukkan nama: ");
        nama = s.nextLine();
        System.out.println("masukkan kelas: ");
        kelas = s.nextLine();
        
        if(kelas.equalsIgnoreCase("X") || kelas.equalsIgnoreCase("XI")){
            System.out.println("perilaku siswa: (baik/cukup)");
            perilaku= s.nextLine();
            if(perilaku.equalsIgnoreCase("Baik")){
                System.out.println("Masukkan rata rata nilai siswa: ");
                nilai = s.nextInt();
                if(nilai >= 90){
                    System.out.println("anda dinyatakan lolos seleksi");
                }else{
                    System.out.println("anda gagal karena nilai");
                }
            }else{
                System.out.println("anda tidak lolos karena perilaku");
            }

        }
    }
}