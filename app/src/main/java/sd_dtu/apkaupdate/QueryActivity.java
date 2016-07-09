package sd_dtu.apkaupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class QueryActivity extends AppCompatActivity {

    Spinner districtsp,pstationsp,iosp;
    EditText firnoet,otheriomob,customq;
    Button submitqbtn;
    ArrayAdapter<CharSequence> districtadapter;
    ArrayAdapter<CharSequence> policestationadapter;
    ArrayAdapter<CharSequence> ioadapter;
    ArrayAdapter<CharSequence> queryapter;

    public void adapterwork(){
        districtadapter = ArrayAdapter.createFromResource(this, R.array.District, R.layout.support_simple_spinner_dropdown_item);
        districtadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        districtsp.setAdapter(districtadapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);
        districtsp = (Spinner) findViewById(R.id.districtspinner);
        pstationsp = (Spinner) findViewById(R.id.police_station_spinner);
        iosp=(Spinner)findViewById(R.id.iospinner);
        firnoet = (EditText) findViewById(R.id.firno);
        submitqbtn=(Button)findViewById(R.id.subqbtn);
        otheriomob = (EditText) findViewById(R.id.other_io_mob);
        customq = (EditText) findViewById(R.id.custom_query);
        adapterwork();

    }
}
