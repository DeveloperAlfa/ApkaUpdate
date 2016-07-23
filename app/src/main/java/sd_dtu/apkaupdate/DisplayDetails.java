package sd_dtu.apkaupdate;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by sam AR on 6/14/2016.
 */
public class DisplayDetails extends AppCompatActivity {
    TextView namec,datel,datec,arrest,progress,csstatus;
    public void dispdetails(){
        namec=(TextView) findViewById(R.id.namec);
        datec=(TextView) findViewById(R.id.datec);
        datel=(TextView) findViewById(R.id.datel);
        arrest=(TextView) findViewById(R.id.arrest);
        progress=(TextView) findViewById(R.id.progress);
        csstatus=(TextView) findViewById(R.id.csstatus);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_display_details);
        dispdetails();

        Toast.makeText(this,"Complaint Button will start working here after 10 days.",Toast.LENGTH_LONG).show();


    }
}
