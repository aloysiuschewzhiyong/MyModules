package sg.edu.rp.c346.id22001095.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvAY;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvAY = findViewById(R.id.textViewAY);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("Module");
        String moduleSelectedName = intentReceived.getStringExtra("Name");
        int moduleSelectedAY = intentReceived.getIntExtra("AY" , 0);
        int moduleSelectedSem = intentReceived.getIntExtra("Semester" , 0);
        int moduleSelectedCredit = intentReceived.getIntExtra("Credit" , 0);
        String moduleSelectedVenue = intentReceived.getStringExtra("Venue");

        tvCode.setText("Module Code: " + moduleSelected );
        tvName.setText("Module Name: " + moduleSelectedName);
        tvAY.setText("Academic Year: " + moduleSelectedAY);
        tvSem.setText("Semester: " + moduleSelectedSem);
        tvCredit.setText("Module Credit: " + moduleSelectedCredit);
        tvVenue.setText("Venue: " + moduleSelectedVenue);



        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        }

    }
