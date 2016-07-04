package sd_dtu.apkaupdate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class VerifyActivity extends AppCompatActivity {

    Button otpbtn;
    EditText eemail,emob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        eemail=(EditText)findViewById(R.id.Email);
        emob=(EditText)findViewById(R.id.Mobile);
        emob.setEnabled(false);

        otpbtn=(Button)findViewById(R.id.rqstbtn);

    }

    public void radCheck(View view){
        boolean checked=((RadioButton)view).isChecked();
        switch (view.getId())
        {
            case R.id.radioButton:
                if(checked) {
                    eemail.setEnabled(false);
                    emob.setEnabled(true);
                }

                break;
            case R.id.radioButton2:
                if (checked) {
                    emob.setEnabled(false);
                    eemail.setEnabled(true);

                }
                break;
        }
    }


    public void onClick(View view){
        Intent intent=new Intent(VerifyActivity.this,OtpCheck.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.radioGroup) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
