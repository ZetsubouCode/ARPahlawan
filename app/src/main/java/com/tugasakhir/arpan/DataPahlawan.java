package com.tugasakhir.arpan;

import java.util.ArrayList;

public class DataPahlawan {
    private static String[] pahlawanName = {
            "Ir. Soekarno", "Mohammad Hatta", "Ki Hadjar Dewantara", "Imam Bonjol", "Pangeran Diponegoro",
            "Ahmad Yani", "Sudirman", "R.A Kartini", "Fatmawati", "Cut Nyak Dhien"
    };

    private static String[] pahlawanDetail = {
            "Presiden pertama Republik Indonesia",
            "Aktivis kemerdekaan, Wakil Presiden Indonesia Pertama",
            "Pengajar dan menteri pemerintahan, mendirikan Taman Siswa, salah satu dari Tiga Serangkai",
            "Tokoh Islam dari Sumatra Barat yang melakukan perlawanan terhadap pasukan kolonial Belanda dalam Perang Padri",
            "Putra Sultan Yogyakarta, melangsungkan perang lima tahun melawan pasukan kolonial Belanda",
            "Pemimpin Angkatan Darat, terbunuh saat Gerakan 30 September",
            "Perwira tinggi Indonesia pada masa Revolusi Nasional Indonesia",
            "Tokoh hak asasi perempuan Jawa",
            "Pembuat bendera nasional pertama, aktivis sosial, istri Sukarno",
            "Pemimpin gerilyawan Aceh yang melakukan penyerangan terhadap pasukan kolonial belanda"
    };

    private static int[] pahlawanImage = {
            R.drawable.soekarno, R.drawable.hatta, R.drawable.kihajardewantara, R.drawable.imambonjol, R.drawable.diponegoro,
            R.drawable.ahmadyani, R.drawable.sudirman, R.drawable.kartini, R.drawable.fatmawati, R.drawable.cutnyakdhien
    };

    private static String[] pahlawanDetails = {
     "Detail Lengkap Pahlawan no.1 ",
     "Detail Lengkap Pahlawan no.2 ",
     "Detail Lengkap Pahlawan no.3 ",
     "Detail Lengkap Pahlawan no.4 ",
     "Detail Lengkap Pahlawan no.5 ",
     "Detail Lengkap Pahlawan no.6 ",
     "Detail Lengkap Pahlawan no.7 ",
     "Detail Lengkap Pahlawan no.8 ",
     "Detail Lengkap Pahlawan no.9 ",
     "Detail Lengkap Pahlawan no.10 "
    };

    static ArrayList<Pahlawan> getListData() {
        ArrayList<Pahlawan> list = new ArrayList<>();
        for (int position = 0; position < pahlawanName.length; position++) {
            Pahlawan pahlawan = new Pahlawan();
            pahlawan.setName(pahlawanName[position]);
            pahlawan.setDetail(pahlawanDetail[position]);
            pahlawan.setPhoto(pahlawanImage[position]);
            pahlawan.setDetails(pahlawanDetails[position]);
            list.add(pahlawan);
        }
        return list;
    }
}
