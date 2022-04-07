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
public interface PPDB {
    
    void keterangandiri1();
    void keterangandiri2();
    void keterangansekolahasal();
    default void pilihanJurusan(){
        System.out.println("Jurusan yang tersedia : ");
        System.out.println("1. Rekayasa Perangkat Lunak (RPL)");
        System.out.println("2. Teknik Komputer Jaringan (TKJ)");
    }
    void keterangandiri();
    void show();
}
