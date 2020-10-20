/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class KTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("NOTE : Gunakan Huruf Besar");
        System.out.println("\n");
        
        System.out.println("<<< E-KTP INDONESIA >>>");
        
        String nama, tempatLahir, tanggalLahir, jenisKelamin, golongan;
        String alamat, rt, desa, kecamatan, agama, status, kewarganegaraan;
        
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Tempat Lahir : ");
        tempatLahir = input.nextLine();
        System.out.print("Tanggal Lahir : ");
        tanggalLahir = input.nextLine();
        System.out.print("Jenis Kelamin : ");
        jenisKelamin = input.nextLine();
        System.out.print("Golongan Darah : ");
        golongan = input.nextLine();
        System.out.print("Alamat : ");
        alamat = input.nextLine();
        System.out.print("RT/RW : ");
        rt = input.nextLine();
        System.out.print("Kel./Desa : ");
        desa = input.nextLine();
        System.out.print("Kecamatan : ");
        kecamatan = input.nextLine();
        System.out.print("Agama : ");
        agama = input.nextLine();
        System.out.print("Status Pernikahan : ");
        status = input.nextLine();
        System.out.print("Kewarganegaraan : ");
        kewarganegaraan = input.nextLine();
        
        
        
    }
    
}
