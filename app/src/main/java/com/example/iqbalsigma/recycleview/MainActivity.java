package com.example.iqbalsigma.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<Resep> resep = new LinkedList<Resep>();
    private LinkedList<String> resep_nama = new LinkedList<String>();
    private LinkedList<String> resep_detail = new LinkedList<String>();
    private LinkedList<String> resep_ingredients = new LinkedList<String>();
    private LinkedList<String> resep_process = new LinkedList<String>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resep.add(new Resep("Nasi Kebuli",
                "Nasi kebuli adalah hidangan nasi berbumbu yang bercitarasa gurih yang ditemukan di Indonesia.",
                "1. 1/4 kg daging sapi potong kecil-kecil\n2. 2 bungkus bumbu rabeg (ketumbar, jinten, kapulaga, kayu manis)\n3. butir bawang merah\n4. 3 butir bawang putih\n5. 1,5 gelas belimbing, beras. Cuci tiriskan",
                "1. Sangrai bumbu Rabeg sampai tercium wangi harum. Kemudian campur dengan bawang merah dan bawang putih. Haluskan.\n" +
                        "2. Tumis bumbu halus,, tambahkan air, setelah tercium wangi, masukkan daging. Tunggu sampai matang, jangan lupa tambahkan garam.\n" +
                        "3. Setelah matang, ambil daging dari bumbunya sisakan sedikit saja utk yg dicampur dengan beras.\n" +
                        "4. Campurkan bumbu yg sudah matang tadi dengan beras yg sudah dicuci. Tambahkan air secukupnya seperti mau mengaron nasi (tinggi air 1 ruas jari).\n" +
                        "5. Masak beras, sambil sesekali diaduk bagian bawah nya biar tidak nempel.\n" +
                        "6. Setelah dirasa cukup, matikan api, diamkan nasi setengah matang tadi sampai airnya susut.\n" +
                        "7. Sambil menunggu air susut, panaskan kukusan. Setelah uap keluar banyak, lanjut nasi tadi dikukus kurang lebih 30menit.\n" +
                        "8. Nasi kebuli sudah matang. Daging yang tadi dipisahkan, tinggal d goreng jika mau makan.\n" +
                        "9. Tambahkan acar timun sama wortel, akan lebih hemmm"));
        resep.add(new Resep("Magelangan",
                "Magelangan adalah masakan dari bujo.",
                "1. 1 piring nasi putih\n" +
                        "2. 1 bungkus mie instan goreng (rebus dan tiriskan)\n" +
                        "3. 3 siung bawang merah (iris)\n" +
                        "4. 3 siung bawang putih (cacah halus)\n" +
                        "5. 1 butir telur\n" +
                        "6. 2 lembar kol (iris tipis)\n" +
                        "7. 3 butir bakso (iris)\n" +
                        "8. 1 buah sosis (iris)\n" +
                        "9. 2 buah cabe rawit (sesuai selera)\n" +
                        "10. 1 batang daun bawang (iris)\n" +
                        "11. Secukupnya Garam\n" +
                        "12. Secukupnya Merica\n" +
                        "13. Secukupnya Kecap manis",
                "Panaskan minyak, tumis bawang merah dan bawang putih hingga harum.\n" +
                        "Masukkan telur dan aduk. Masukkan bakso dan sosis dan aduk hingga matang.\n" +
                        "Masukkan nasi, mie, bumbu mie instan, garam, merica, dan kecap manis, kol, daun bawang, dan cabe. Aduk hingga rata dan matang.\n" +
                        "Matikan api dan sajikan."));
        resep.add(new Resep("Omelet",
                "Telur yang dicampurkan dengan mie.",
                "1. 1/2 buah tomat uk besar dipotong kecil2\n" +
                        "2. secukupnya bawang bombay diiris dadu (sebanyak tomat)\n" +
                        "3. secukupnya smoked beef diiris kecil2 (sesuai selera)\n" +
                        "4. secukupnya keju diiris kecil2 (sesuai selera)\n" +
                        "5. 2 butir telur ayam dikocok lepas\n" +
                        "6. 1/3 sdm garam",
                "1. Panaskan minyak. Masukkan irisan smoked beef dan bawang bombay. Tumis hingga wangi.\n" +
                        "2. Masukkan irisan tomat. Tumis hingga layu dan wangi.\n" +
                        "3. Tambahkan garam ke kocokan telur lalu kocok hingga tercampur rata.\n" +
                        "4. Masukkan kocokan telur ke wajan. Masak hingga sisi bawah padat dan berwarna sedikit kecoklatan.\n" +
                        "5. Tambahkan irisan / parutan keju.\n" +
                        "6. Balik telur. Masak kembali hingga kecoklatan.\n" +
                        "7. Enak dimakan dengan saos tomat."));

        setContentView(R.layout.activity_main);
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        for(int i = 0; i < resep.size(); i++){
            resep_nama.add(resep.get(i).nama);
            resep_detail.add(resep.get(i).detail);
            resep_ingredients.add(resep.get(i).ingredients);
            resep_process.add(resep.get(i).proses);
        }
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, resep_nama, resep_detail, resep_ingredients, resep_process);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
