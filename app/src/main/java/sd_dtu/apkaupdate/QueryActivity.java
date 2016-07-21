package sd_dtu.apkaupdate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by sam AR on 6/4/2016.
 */
public class QueryActivity extends Activity{


    Spinner districtsp,pstationsp,statussp,querysp;
    EditText fillnodd;
    Button donedd;
    EditText Name,Query;



    ArrayAdapter<CharSequence> districtadapter;
    ArrayAdapter<CharSequence> policestationadapter;
    ArrayAdapter<CharSequence> statusadapter;
    ArrayAdapter<CharSequence> queryadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);

        districtsp = (Spinner) findViewById(R.id.districtspinner);
        pstationsp = (Spinner) findViewById(R.id.police_station_spinner);
        statussp=(Spinner)findViewById(R.id.statusspinner);
        querysp=(Spinner)findViewById(R.id.queryspinner);
        fillnodd = (EditText) findViewById(R.id.fillno);
        Name = (EditText) findViewById(R.id.name);
        Query=(EditText)findViewById(R.id.customquery);
        Name.setEnabled(false);
        Query.setEnabled(false);
        fillnodd.setMovementMethod(new ScrollingMovementMethod());

        donedd = (Button) findViewById(R.id.dropdownbtn);
        donedd.setMovementMethod(new ScrollingMovementMethod());

        donedd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QueryActivity.this,"Your Query is Submitted!!",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(QueryActivity.this,AllQueries.class);
                startActivity(intent);
            }
        });


        queryadapter=ArrayAdapter.createFromResource(this,R.array.QUERY,R.layout.support_simple_spinner_dropdown_item);
        queryadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        querysp.setAdapter(queryadapter);
        querysp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){
                    case 0:
                        Query.setEnabled(true);
                        break;
                    case 1:
                        Query.setEnabled(false);
                        break;
                    case 2:
                        Query.setEnabled(false);
                        break;
                    case 3:
                        Query.setEnabled(false);
                        break;
                    case 4:
                        Query.setEnabled(false);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        districtadapter = ArrayAdapter.createFromResource(this, R.array.District, R.layout.support_simple_spinner_dropdown_item);
        districtadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        districtsp.setAdapter(districtadapter);
        districtsp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {

                    case 0:
                        policestationadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.Outer_District_PS, R.layout.support_simple_spinner_dropdown_item);
                        policestationadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                        pstationsp.setAdapter(policestationadapter);
                        pstationsp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                switch (position){
                                    case 0:
                                    statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad0, R.layout.support_simple_spinner_dropdown_item);
                                    statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                    statussp.setAdapter(statusadapter);
                                    statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                            switch (position) {

                                                case 0:

                                                    Name.setEnabled(false);
                                                    break;
                                                case 1:
                                                    Name.setEnabled(true);
                                                    break;

                                            }
                                        }
                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });

                                        break;



                                    case 1:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad1, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;

                                    case 2:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad2, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });

                                        break;
                                    case 3:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad3, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 4:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad4, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 5:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad5, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 6:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad6, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 7:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad7, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 8:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad8, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 9:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad9, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 10:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad10, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });break;

                                    case 11:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad11, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 12:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad12, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 13:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad13, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 14:
                                        statusadapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.IO_Shahbad14, R.layout.support_simple_spinner_dropdown_item);
                                        statusadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                                        statussp.setAdapter(statusadapter);
                                        statussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position) {

                                                    case 0:

                                                        Name.setEnabled(false);
                                                        break;
                                                    case 1:
                                                        Name.setEnabled(true);
                                                        break;

                                                }
                                            }
                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;


                                }

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






    }




}



