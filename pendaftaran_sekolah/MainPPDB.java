/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran_sekolah;

/**
 *
 * @author MASTER 10
 */
public class MainPPDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PPDB1 obj = new PPDB1();
        System.out.println("Input Data");
        obj.keterangandiri1();
        obj.keterangandiri2();
        obj.keterangansekolahasal();
        obj.pilihanJurusan();
        obj.keterangandiri();
        System.out.println("\t");
        System.out.println("=========================");
        
        obj.show();
    }
    
}
