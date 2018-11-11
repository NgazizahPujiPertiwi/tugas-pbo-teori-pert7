

package tugas_pert_7;

import java.util.Scanner;

public class utama {
    public static void TampilData() {
        
    }
    
    public static void InputData() {
        Mhsiswa mahasiswa = new Mhsiswa();
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        String nims = s.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = s.nextLine();
        System.out.print("Masukkan IPK : ");
        String ipk = s.nextLine();
        mahasiswa.isiData(nims, nama, ipk);
    }
    
    public static void main(String[] args) {
        Mhsiswa mhs = new Mhsiswa();
        int pil = 0;
        do {
            Scanner s = new Scanner(System.in);
            pindah:
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih : ");
            pil = s.nextInt();
            switch (pil) {
                case 1:
                    InputData();
                    break;
                case 2:
                    mhs.tampilData();
                    break;
                case 3:
                    System.out.println("1. Sorting By NIM ");
                    System.out.println("2. Sorting By NAMA ");
                    System.out.println("3. Sorting By IPK ");
                    System.out.println("4. Keluar");
                    pil = s.nextInt();
                    if (pil == 1) {
                        mhs.sortNim();
                    } else if (pil == 2) {
                        mhs.sortNama();
                    } else if (pil == 3) {
                        mhs.sortIpk();
                    } 
                    break;
            }        
        } while (pil != 4);
        
        
    }
}

