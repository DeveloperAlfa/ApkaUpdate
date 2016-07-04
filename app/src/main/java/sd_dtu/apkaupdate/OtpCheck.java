package sd_dtu.apkaupdate;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OtpCheck extends AppCompatActivity {
    TextView Text;
    TextView resendotp;
    boolean isCounterRunning=false;



    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_check);
        Text=(TextView)findViewById(R.id.time);
        resendotp=(TextView)findViewById(R.id.resend);

        final CountDownTimer countDownTimer=new CountDownTimer(180000, 1000) {

            public void onTick(long millisUntilFinished) {
                Text.setText("seconds remaining: " + millisUntilFinished / 1000);

            }

            public void onFinish() {
                isCounterRunning = false;
            }


        }.start();


        resendotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    if( !isCounterRunning ){
                        isCounterRunning = true;
                        countDownTimer.start();
                    }
                    else{
                        countDownTimer.cancel();
                        countDownTimer.start();
                    }

                }
            }
        });



    }



    public void onclick(View view){
        Intent intent=new Intent(OtpCheck.this,QueryActivity.class);
        startActivity(intent);
    }

}
