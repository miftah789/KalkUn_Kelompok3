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
public class Fragment3 extends Fragment {

    private EditText tjarijari;
    private EditText ttinggimiring;
    private TextView thasil;
    private Button tvolume;
    private Button tluas;


    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mview = inflater.inflate(R.layout.fragment_fragment3, container, false);
        tjarijari = (EditText) mview.findViewById(R.id.jarijari);
        ttinggimiring = (EditText) mview.findViewById(R.id.tinggimiring);
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
            String Jarijari = tjarijari.getText().toString().trim();
            String Miring = ttinggimiring.getText().toString().trim();

            double r = Double.parseDouble(Jarijari);
            double s = Double.parseDouble(Miring);
            double luas = 3.14 * r * r + r * 3.24 * s;

            thasil.setText("Luas : " + luas);
        }

    }

    private void doProses() {
        if (isValid()) {
            String Jarijari = tjarijari.getText().toString().trim();
            String Tinggi = ttinggimiring.getText().toString().trim();

            double r = Double.parseDouble(Jarijari);
            double t = Double.parseDouble(Tinggi);

            double vol = 3.14 * r * r * t;

            thasil.setText("Volume : " + vol / 3);
        }

    }


    public boolean isValid() {
        boolean valid = true;

        String Jarijari = tjarijari.getText().toString().trim();
        String Tinggi = ttinggimiring.getText().toString().trim();

        if (Jarijari.isEmpty()) {
            tjarijari.setError("Jari - Jari Belum Diisi");
            valid = false;
        } else {
            tjarijari.setError(null);
        }

        if (Tinggi.isEmpty()) {
            ttinggimiring.setError("Tinggi / Sisi Miring Belum Diisi");
            valid = false;
        } else {
            ttinggimiring.setError(null);
        }

        return valid;
    }
}
