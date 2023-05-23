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
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C346");
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C206");
                startActivity(intent);
            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C203");
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C218");
                startActivity(intent);
            }
        });

    }
}