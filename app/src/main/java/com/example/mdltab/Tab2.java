package com.example.mdltab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Tab2 extends Fragment {

    public Tab2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_tab2, container, false);

        TextView facultyTextView = view.findViewById(R.id.tvUniversityFaculty);
        facultyTextView.setText(getUniversityFaculty());

        return view;
    }

    private String getUniversityFaculty() {
        return "Persyaratan Umum Pendaftaran Mahasiswa Baru:\n\n" +
                "\t 1. Formulir Pendaftaran:\n" +
                "\t\t Mengisi formulir pendaftaran sesuai jalur yang dipilih.\n" +
                "\t 2. Kelengkapan Akademik\n" +
                "\t\t Menyerahkan fotocopy dan Upload Ijazah/STTB SLTA/seederajat yang telah dilegalisir pejabat yang berwenang sebanyak 2 lembar.\n" +
                "\t 3. Pas Poto, KTP dan KK\n" +
                "\t\t Menyerahkan dan upload pas foto resmi ukuran 2×3 sebanyak 2 lembar (warna latar merah). Menyerahkan fotocopy dan upload Kartu Keluarga (KK) / Kartu Tanda Penduduk (KTP)\n" +
                "\t 4. Pembayaran Pendaftaran\n" +
                "\t\t Menyerahkan dan upload Bukti pembayaran bagi pendaftar online. Pembayaran Jalur Reguler: 1. Jenjang S1: Rp 200.000 2. Jenjang D3: 50.000 Pembayaran Jalur Khusus: Rp 50.000\n" +
                "\n\n" +
                "Jalur Pendaftaran Mahasiswa Baru:\n\n " +
                "\t 1. Jalur Reguler\n" +
                "\t\t Jalur Umum / Reguler, lulusan SLTA / sederajat yang mau melanjutkan ke kelas pagi atau sore di Universitas Kuningan\n" +
                "\n" +
                "\t 2. Jalur KIP Kuliah\n" +
                "\t\t Pendaftaran Jalur Beasiswa KIP Kuliah, didaftarkan oleh sekolah ke https://kip-kuliah.kemdikbud.go.id kemudian memilih program studi yang ada di Universitas Kuningan\n" +
                "\n" +
                "\t 3. Jalur Khusus\n" +
                "\t\t Pendaftaran Jalur Prestasi akademik dan Non Akademik, yang mendapat rujukan dari sekolah asal. Khusus Jalur Prestasi Non akademik akan dilakukan tes keahlian (olahraga, seni atau lainya bedasarkan usulan prestasi). Khusus untuk Jalur Prestasi Hafidz Qur’an akan dilakukan test hafalan.\n" +
                "\n" +
                "\t 4. Jalur Transfer\n" +
                "\t\t Mahasiswa yang sudah menempuh minimal 2 semester di universitas asal, dan akan melajutkan ke Program Studi di Universitas Kuningan yang status akreditasi program studi tujuan setara atau lebih rendah.\n" +
                "\n" +
                "Jadwal Pendaftaran: \n\n" +
                "1. Pendaftaran Jalur Reguler\n" +
                "Gelombang 1\n" +
                "Pendaftaran: 4 Desember 2023 - 17 Mei 2024\n" +
                "Seleksi: 18 Mei 2024\n" +
                "Pengumuman: 22 Mei 2024\n" +
                "Registrasi: 23 Mei 2024 - 29 Juni 2024\n\n" +
                "Gelombang 2\n" +
                "Pendaftaran: 18 Mei 2024 - 23 Agustus 2024\n" +
                "Seleksi: 24 Agustus 2024\n" +
                "Pengumuman: 28 Agustus 2024\n" +
                "Registrasi: 29 Agustus 2024 - 6 September 2024\n\n" +
                "\n" +
                "2. Jalur Khusus\n" +
                "KIP-Kuliah\n" +
                "Pendaftaran: 4 Desember 2023 - 31 Maret 2024\n" +
                "Seleksi: 17 April 2024\n" +
                "Pengumuman: 23 April 2024\n" +
                "Registrasi: 23 April 2024 - 31 Mei 2024\n\n" +
                "Prestasi Akademik, Non Akademik, Hafidz Quran\n\n" +
                "Pendaftaran: 4 Desember 2023 - 17 Mei 2024\n" +
                "Seleksi: 18 Mei 2024\n" +
                "Pengumuman: 22 Mei 2024\n" +
                "Registrasi: 23 April 2024 - 29 Juni 2024\n\n";
    }
}
