package com.example.mdltab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Tab3 extends Fragment {

    public Tab3() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_tab3, container, false);

        TextView programTextView = view.findViewById(R.id.tvUniversityProgram);
        programTextView.setText(getUniversityProgram());

        return view;
    }

    private String getUniversityProgram() {
        return "=====================================\n" +
                "CALL CENTER\n" +
                "0811 2200 850\n" +
                "=====================================\n\n" +

                "=====================================\n" +
                "Kontak Akademik Universitas Kuningan\n" +
                "=====================================\n\n" +

                "Universitas Kuningan\n" +
                "(0232) 873 696\n" +
                "rektorat@uniku.ac.id\n\n" +
                "Humas, Hukum dan Kerjasama\n" +
                "(0232) 878 702\n" +
                "humas@uniku.ac.id\n\n" +
                "Biro Administrasi Keuangan Ketenagaan Umum dan Perlengkapan (BAKKUP)\n" +
                "(0232) 874 824, 878 700\n\n" +
                "Biro Administrasi Akademik dan Kemahasiswaan (BAAK)\n" +
                "0232-8900 135\n\n" +
                "Pusat Perencanaan Pengembangan Akademik (P3A)\n" +
                "-\n\n" +
                "Lembaga Penelitian dan Pengabdian Kepada Masyarakat (LPPM)\n" +
                "0855 2369 4821\n\n" +
                "\n" +
                "Satuan Pengawas Internal (SPI)\n" +
                "–\n\n" +
                "Satuan Penjaminan Mutu (SPM)\n" +
                "0877 3878 4256\n\n" +
                "Sekretaris Rektorat\n" +
                "(0232) 8900 123\n\n" +
                "Perpustakaan\n" +
                "(0232) 878 701\n\n" +
                "Sekretaris Rektorat\n" +
                "(0232) 8900 123\n\n" +
                "Pusat Pengembangan Kewirausahaan Mahasiswa (PKM)\n" +
                "0821 2701 9471\n\n" +
                "Pusat Bahasa\n" +
                "0852 9583 0233\n\n" +
                "Pusat Bimbingan Konseling dan Karir (PBKK)\n" +
                "(0232) 89000 66\n\n" +
                "Pusat Sistem Informasi (PUSINFO)\n" +
                "(0232) 8900 296\n" +
                "=====================================\n\n" +

                "=====================================\n" +
                "Kontak Fakultas\n" +
                "=====================================\n\n" +

                "Fakultas Keguruan dan Ilmu Pendidikan\n" +
                "(0232) 871 982\n\n" +
                "Fakultas Ekonomi\n" +
                "(0232) 872 848\n\n" +
                "Fakultas Kehutanan\n" +
                "(0232) 875 124\n\n" +
                "Fakultas Ilmu Komputer\n" +
                "(0232) 875 097\n\n" +
                "Fakultas Hukum\n" +
                "(0232) 8900 131\n\n" +
                "Sekolah Pascasarjana\n" +
                "(0232) 8700 702\n"+
                "=====================================\n\n";
    }
}
