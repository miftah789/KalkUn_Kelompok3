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
public class Fragment2 extends Fragment {

    private EditText tsisi;
    private TextView thasil;
    private Button tvolume;
    private Button tluas;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mview = inflater.inflate(R.layout.fragment_fragment2, container, false);
        tsisi = (EditText) mview.findViewById(R.id.sisi);
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
            String Sisi = tsisi.getText().toString().trim();

            double s = Double.parseDouble(Sisi);
            double luas = 6 * s * s;

            thasil.setText("Luas : " + luas);
        }
    }

    private void doProses() {
        if (isValid()) {
            String Sisi = tsisi.getText().toString().trim();

            double s = Double.parseDouble(Sisi);
            double luas = s * s * s;

            thasil.setText("Volume : " + luas);

        }

    }

    public boolean isValid() {
        boolean valid = true;

        String Sisi = tsisi.getText().toString().trim();

        if (Sisi.isEmpty()) {
            tsisi.setError("Sisi Belum Diisi");
            valid = false;
        } else {
            tsisi.setError(null);
        }


        return valid;
    }
}
