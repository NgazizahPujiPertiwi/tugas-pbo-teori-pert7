
package tugas_pert_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mhsiswa {
    private String Nim;
    private String Nama, Ipk;
    public static List<Mhsiswa> sMahasiswa = new ArrayList<>();
    

    public Mhsiswa() {
    }
        
    public Mhsiswa(String nim, String nama, String ipk) {
        this.Nim = nim;
        this.Nama = nama;
        this.Ipk = ipk;
    }
    
    public void sortIpk() {
        Collections.sort(sMahasiswa, new Comparator<Mhsiswa>(){
            @Override
            public int compare(Mhsiswa t, Mhsiswa t1) {
                return t.getIpk().compareTo(t1.getIpk());
            }
            
        });
        
        for (Mhsiswa mahasiswa : sMahasiswa) {
            System.out.println(mahasiswa.getIpk() + " => " + mahasiswa.getIpk());
        }
    }
    
    
    public void sortNama() {
        Collections.sort(sMahasiswa, new Comparator<Mhsiswa>(){
            @Override
            public int compare(Mhsiswa t, Mhsiswa t1) {
                return t1.getNama().compareTo(t.getNama());
            }
            
        });
        
        for (Mhsiswa mahasiswa : sMahasiswa) {
            System.out.println(mahasiswa.getNama() + " => " + mahasiswa.getNama());
        }
    }
    
    public void sortNim() {
        Collections.sort(sMahasiswa, new Comparator<Mhsiswa>(){
            @Override
            public int compare(Mhsiswa t, Mhsiswa t1) {
                return t.getNim().compareTo(t1.getNim());
            }
            
        });
        
        for (Mhsiswa mahasiswa : sMahasiswa) {
            System.out.println(mahasiswa.getNim() + " => " + mahasiswa.getNim());
        }
    }
    
    public void isiData(String nim, String nama, String ipk) {
        sMahasiswa.add(new Mhsiswa(nim, nama, ipk));
        //System.out.println(nama);
    }
    
    public void tampildata() {
        int i=1;
        for (Mhsiswa mahasiswa : sMahasiswa) {
            System.out.println("Data ke - " + i++);
            System.out.println("Nim  : " + mahasiswa.Nim);
            System.out.println("Nama : " + mahasiswa.Nama);
            System.out.println("IPK  : " + mahasiswa.Ipk);
        }
    }

    public String getNim() {
        return Nim;
    }

    public String getNama() {
        return Nama;
    }

    public String getIpk() {
        return Ipk;
    }

    public void setNim(String nim) {
        this.Nim = nim;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void setIpk(String ipk) {
        this.Ipk = ipk;
    }

    @Override
    public String toString() {
        String str = 
                "Nim: " + Nim + "\n" +
                "Nama: " + Nama + "\n" + 
                "IPK: " + Ipk;
        return str;
    }

    void tampilData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

