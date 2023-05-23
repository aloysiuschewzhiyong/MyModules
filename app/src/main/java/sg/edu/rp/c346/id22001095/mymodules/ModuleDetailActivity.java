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

        if (moduleSelected.equals("C235")){
            tvCode.setText("Module Code:" + moduleSelected );
            tvName.setText("Module Name: IT Security and Management");
            tvAY.setText("Academic Year: 2023");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W64P");
        }
        else if(moduleSelected.equals("C346")){
            tvCode.setText("Module Code:" + moduleSelected );
            tvName.setText("Module Name: Mobile App Development");
            tvAY.setText("Academic Year: 2023");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E63A");
        }
        else if (moduleSelected.equals("C206")){
            tvCode.setText("Module Code:" + moduleSelected );
            tvName.setText("Module Name: Software Development Process");
            tvAY.setText("Academic Year: 2023");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W64P");
        }
        else if (moduleSelected.equals("C203")){
            tvCode.setText("Module Code:" + moduleSelected );
            tvName.setText("Module Name: Web Appln Development in php");
            tvAY.setText("Academic Year: 2023");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W64P");
        }
        else if (moduleSelected.equals("C218")){
            tvCode.setText("Module Code:" + moduleSelected );
            tvName.setText("Module Name: UI/UX Design for Apps");
            tvAY.setText("Academic Year: 2023");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W64P");
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        }

    }
