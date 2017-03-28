package id.sch.smktelkom_mlg.project2.xirpl601131835.kalkulator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    private EditText tpanjang;
    private EditText tlebar;
    private EditText ttinggi;
    private TextView thasil;
    private Button tvolume;
    private Button tluas;


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mview = inflater.inflate(R.layout.fragment_fragment1, container, false);


        tpanjang = (EditText) mview.findViewById(R.id.sisi);
        tlebar = (EditText) mview.findViewById(R.id.lebar);
        ttinggi = (EditText) mview.findViewById(R.id.tinggi);
        thasil = (TextView) mview.findViewById(R.id.hasil);
        tvolume = (Button) mview.findViewById(R.id.volume);
        tluas = (Button) mview.findViewById(R.id.lp);

        tvolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProses();

            }
        });

        tluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProsess();


            }
        });

        return mview;
    }

    private void doProsess() {
        if (isValid()) {
            String Panjang = tpanjang.getText().toString().trim();
            String Lebar = tlebar.getText().toString().trim();
            String Tinggi = ttinggi.getText().toString().trim();

            double p = Double.parseDouble(Panjang);
            double l = Double.parseDouble(Lebar);
            double t = Double.parseDouble(Tinggi);
            double luas = p * l + p * t + l * t;
            thasil.setText("Luas : " + 2 * luas);
        }
    }

    private void doProses() {
        if (isValid()) {
            String Panjang = tpanjang.getText().toString().trim();
            String Lebar = tlebar.getText().toString().trim();
            String Tinggi = ttinggi.getText().toString().trim();

            double p = Double.parseDouble(Panjang);
            double l = Double.parseDouble(Lebar);
            double t = Double.parseDouble(Tinggi);
            double luas = p * l * t;
            thasil.setText("Volume : " + luas);
        }
    }


    public boolean isValid() {
        boolean valid = true;

        String Panjang = tpanjang.getText().toString().trim();
        String Lebar = tlebar.getText().toString().trim();
        String Tinggi = ttinggi.getText().toString().trim();

        if (Panjang.isEmpty()) {
            tpanjang.setError("Panjang Belum Diisi");
            valid = false;
        } else {
            tpanjang.setError(null);
        }

        if (Lebar.isEmpty()) {
            tlebar.setError("Lebar Belum Diisi");
            valid = false;
        } else {
            tlebar.setError(null);
        }

        if (Tinggi.isEmpty()) {
            ttinggi.setError("Tinggi Belum Diisi");
            valid = false;
        } else {
            ttinggi.setError(null);
        }

        return valid;
    }
}