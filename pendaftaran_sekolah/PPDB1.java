/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran_sekolah;

import java.util.Scanner;

/**
 *
 * @author MASTER 10
 */
public class PPDB1 implements PPDB{
    Scanner input = new Scanner (System.in);
    String Nama_Panjang, Nama_Panggilan;
    int NIS, NISN;
    String asalsekolah, Alamatsekolahasal;
    String Jurusan, Alasan1, Alasan2;
    
    @Override
    public void keterangandiri1(){
        System.out.print("Nama Panjang        : ");
        Nama_Panjang = input.next();
        System.out.print("Nama Panggilan      : ");
        Nama_Panggilan = input.next();
    }
    @Override
    public void keterangandiri2(){
        System.out.print("NIS                 : ");
        NIS = input.nextInt();
        System.out.print("NISN                : ");
        NISN = input.nextInt();
        
    }
    @Override
    public void keterangansekolahasal(){
        System.out.print("Asal Sekolah        : ");
        asalsekolah = input.next();
        System.out.print("Alamat Sekolah Asal : ");
        Alamatsekolahasal = input.next();
    }
    @Override
    public void keterangandiri(){
        System.out.print("Jurusan yang dipilih : ");
        Jurusan = input.next();
        System.out.print("Alasan Memilih SMK telkom : ");
        Alasan1 = input.next();
        System.out.print("Alasan Memilih Jurusan "+Jurusan+" : ");
        Alasan2 = input.next();
    }
    @Override
    public void show(){
        System.out.println("PENERIMAAN PESERTA DIDIK BARU");
        System.out.println("PENDAFTARAN SMK TELKOM MALANG");
        System.out.println("Alamat: Jl. Danau Ranau, Sawojajar, Kec. Kedungkandang, Kota Malang, Jawa Timur 65139");
        System.out.println("\t");
        System.out.println("Nama Panjang Siswa : "+Nama_Panjang);
        System.out.println("Nama Panggilan Siswa : "+Nama_Panggilan);
        System.out.println("NIS : "+NIS);
        System.out.println("NISN : "+NISN);
        System.out.println("Asal Sekolah : "+asalsekolah);
        System.out.println("Alamat Sekolah Asal :"+Alamatsekolahasal);
        System.out.println("Jurusan yang Dipilih : "+Jurusan);
        System.out.println("Alasan Memilih SMK Telkom : "+Alasan1);
        System.out.println("Alasan Memilih Jurusan : "+Alasan2);
        System.out.println("=========================");
        
    }
}
