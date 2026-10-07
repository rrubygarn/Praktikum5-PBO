/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Inka Putri
 */
public class MainDiary {
    public static void main(String[] args) {
        BukuHarian myDiary = new BukuHarian("Inka");
        
        myDiary.tulisCatatan("12-09-2026", "Hari ini mulai mempelajari materi Pemrograman Berorientasi Objek tentang I/O Stream.");
        myDiary.tulisCatatan("13-09-2026", "Berhasil menyelesaikan latihan kode program Java untuk membaca dan menulis file teks.");
        myDiary.bacaCatatan();
    }
}
