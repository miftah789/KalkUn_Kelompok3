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
public class Fragment4 extends Fragment {

    private EditText tjarijari;
    private TextView thasil;
    private Button tvolume;
    private Button tluas;

    public Fragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mview = inflater.inflate(R.layout.fragment_fragment4, container, false);
        tjarijari = (EditText) mview.findViewById(R.id.jarijari);
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

    private void doProses() {
        if (isValid()) {
            String Jarijari = tjarijari.getText().toString().trim();

            double r = Double.parseDouble(Jarijari);


            double vol = 4 * 3.14 * r * r * r;

            thasil.setText("Volume : " + vol / 3);
        }
    }

    private void doProsess() {
        if (isValid()) {
            String Jarijari = tjarijari.getText().toString().trim();


            double r = Double.parseDouble(Jarijari);
            double luas = 4 * 3.14 * r * r;

            thasil.setText("Luas : " + luas);
        }
    }

    public boolean isValid() {
        boolean valid = true;

        String Jarijari = tjarijari.getText().toString().trim();

        if (Jarijari.isEmpty()) {
            tjarijari.setError("Jari - Jari Belum Diisi");
            valid = false;
        } else {
            tjarijari.setError(null);
        }


        return valid;
    }
}
