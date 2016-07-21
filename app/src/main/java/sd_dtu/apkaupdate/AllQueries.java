package sd_dtu.apkaupdate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AllQueries extends AppCompatActivity {

    String[] firarr={"fir111","fir112","fir113"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_queries);
        ListView Querieslv=(ListView)findViewById(R.id.alquerieslv);
        Querieslv.setAdapter(new QListAdapter(this,R.layout.activity_all_queries,firarr));
        Querieslv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(AllQueries.this,DisplayEnquire.class);
                startActivity(intent);
            }
        });
    }


}
