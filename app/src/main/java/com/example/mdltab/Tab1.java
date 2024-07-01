package com.example.mdltab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Tab1 extends Fragment {

    public Tab1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_tab1, container, false);

        TextView historyTextView = view.findViewById(R.id.tvUniversityHistory);
        historyTextView.setText(getUniversityHistory());

        ImageView logoImageView = view.findViewById(R.id.logoImageView);
        logoImageView.setImageResource(R.drawable.logouniku);

        return view;
    }

    private String getUniversityHistory() {
        return "Universitas Kuningan (UNIKU) adalah perguruan tinggi swasta yang terletak di Kabupaten Kuningan, Jawa Barat.\n\n " +
                "UNIKU didirikan pada tahun 2001 dengan komitmen untuk menghasilkan lulusan yang berkualitas dan berdaya saing tinggi. UNIKU telah terakreditasi B oleh Badan Akreditasi Nasional Perguruan Tinggi (BAN-PT).\n\n " +
                "UNIKU memiliki 6 fakultas, 1 program studi diploma-3, 17 program studi sarjana, 3 program studi magister.\n\n" +
                "Fakultas di Universitas Kuningan (UNIKU):\n\n" +
                "\t 1. FKIP : Fakultas Keguruan dan Ilmu Pendidikan\n" +
                "\t 2. FEB : Fakultas Ekonomi dan Bisnis\n" +
                "\t 3. FHUT : Fakultas Kehutanan dan Ilmu Lingkungan\n" +
                "\t 4. FKOM : Fakultas Ilmu Komputer\n" +
                "\t 5. FH : Fakultas Hukum\n" +
                "\t 6. Sekolah Pascasarjana\n\n" +
                "Program Studi di Universitas Kuningan (UNIKU):\n\n" +
                "FKIP : Fakultas Keguruan dan Ilmu Pendidikan\n" +
                "- Bahasa dan Sastra Indonesia (S1)\n" +
                "- Pendidikan Biologi (S1)\n" +
                "- Pendidikan Ekonomi (S1)\n" +
                "- Pendidikan Bahasa Inggris (S1)\n" +
                "- Pendidikan Guru Sekolah Dasar (S1)\n" +
                "- Pendidikan Matematika (S1)\n\n" +
                "FEB : Fakultas Ekonomi dan Bisnis\n" +
                "- Manajemen (S1)\n" +
                "- Akuntansi (S1)\n" +
                "- Bisnis Digital (S1)\n\n" +
                "FHUT : Fakultas Kehutanan dan Ilmu Lingkungan\n" +
                "- Kehutanan (S1)\n" +
                "- Ilmu Lingkungan (S1)\n\n" +
                "FKOM : Fakultas Ilmu Komputer\n" +
                "- Sistem Informasi (S1)\n" +
                "- Teknik Informatika (S1)\n" +
                "- Teknik Sipil (S1)\n" +
                "- Desain Komunikasi Visual (S1)\n" +
                "- Manajemen Informatika (D3)\n\n" +
                "FH : Fakultas Hukum\n" +
                "- Ilmu Hukum (S1)\n\n" +
                "Sekolah Pascasarjana\n" +
                "- Manajemen (S2)\n" +
                "- Biologi (S2)\n" +
                "- Ekonomi (S2)\n\n" +
                "UNIKU menawarkan beragam program studi yang relevan dan berkualitas tinggi untuk membantu mahasiswa dalam mencapai potensi terbaik mereka.";
    }

}
