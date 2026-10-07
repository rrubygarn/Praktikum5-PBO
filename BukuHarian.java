/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Inka Putri
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BukuHarian {
    private String namaPemilik;
    private String namaFile;
    
    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        this.namaFile = "diary_nama.txt" + namaPemilik.toLowerCase().replaceAll("\\s+", "_") + ".txt";
    }
    public void tulisCatatan(String tanggal, String isi) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(namaFile, true))) {
            bw.write("[" + tanggal + "] -" + isi);
            bw.newLine();
            System.out.println("Berhasil menyimpan catatan untuk tanggal: " + tanggal);
        } catch (IOException e) {
            System.out.println("Terjadi galat saaat menulis catatan: " + e.getMessage());
        }
    }
    
    public void bacaCatatan() {
        System.out.println("\n=== DAFTAR CATATAN HARIAN: " + namaPemilik.toUpperCase() + " ===");
        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            boolean adaData = false;
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
                adaData = true;
            }
            if (!adaData) {
                System.out.println("Belum ada catatan harian.");
            }
        } catch (IOException e) {
            System.out.println("Belum ada catatan harian.");
        }
    }
}
            
