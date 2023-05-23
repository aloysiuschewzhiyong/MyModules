package sg.edu.rp.c346.id22001095.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC235;
    TextView tvC346;
    TextView tvC206;
    TextView tvC203;
    TextView tvC218;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC235 = findViewById(R.id.textViewC235);
        tvC346 = findViewById(R.id.textViewC346);
        tvC206 = findViewById(R.id.textViewC206);
        tvC203 = findViewById(R.id.textViewC203);
        tvC218 = findViewById(R.id.textViewC218);


        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C235");
                intent.putExtra("Name", "IT Security and Management");
                intent.putExtra("AY", 2023);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit" , 4);
                intent.putExtra("Venue" , "W64P");
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C346");
                intent.putExtra("Name", "Mobile App Development");
                intent.putExtra("AY", 2023);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit" , 4);
                intent.putExtra("Venue" , "E63A");
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C206");
                intent.putExtra("Name", "Software Development Process");
                intent.putExtra("AY", 2023);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit" , 4);
                intent.putExtra("Venue" , "W64P");
                startActivity(intent);
            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C203");
                intent.putExtra("Name", "Web Appln Development in php");
                intent.putExtra("AY", 2023);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit" , 4);
                intent.putExtra("Venue" , "W64P");
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C218");
                intent.putExtra("Name", "UI/UX Design for Apps");
                intent.putExtra("AY", 2023);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit" , 4);
                intent.putExtra("Venue" , "W64P");
                startActivity(intent);
            }
        });

    }
}