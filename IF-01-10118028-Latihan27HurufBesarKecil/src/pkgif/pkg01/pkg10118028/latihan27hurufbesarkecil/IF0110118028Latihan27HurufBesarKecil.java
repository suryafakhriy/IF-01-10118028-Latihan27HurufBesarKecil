/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118028.latihan27hurufbesarkecil;
    import java.util.Scanner;
/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : Huruf Besar Kecil
 */
public class IF0110118028Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String kalimat;
        
        
        
        Scanner name = new Scanner(System.in);
        
        System.out.printf("Masukkan Kalimat :");
        kalimat = name.nextLine();
               
        String kalimat1 = kalimat.toUpperCase();
        String kalimat2 = kalimat1.toLowerCase();
                
        System.out.println("====Hasil Formating====");
        System.out.println("Huruf Besar :"+kalimat1 );
        System.out.println("Huruf Kecil :"+kalimat2 );
    }
    
}
