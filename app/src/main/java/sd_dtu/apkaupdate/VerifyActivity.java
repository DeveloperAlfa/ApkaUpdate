package sd_dtu.apkaupdate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class VerifyActivity extends AppCompatActivity {

    Button otpbtn;
    EditText emob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        emob=(EditText)findViewById(R.id.Mobile);

        otpbtn=(Button)findViewById(R.id.rqstbtn);

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

}
