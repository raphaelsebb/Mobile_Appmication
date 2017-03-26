package fr.esilv.s8.tubeyou.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import fr.esilv.s8.tubeyou.R;

public class MainActivity extends AppCompatActivity {

    private Button button_go;
    private EditText editText_query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_go = (Button) findViewById(R.id.button_go);
        editText_query = (EditText) findViewById(R.id.editText_query);

        button_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultElementIntent = new Intent(MainActivity.this, ResultElementActivity.class);
                resultElementIntent.putExtra("query", editText_query.getText().toString());
                MainActivity.this.startActivity(resultElementIntent);
            }
        });


    }
}
