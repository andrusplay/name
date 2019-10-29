package com.example.name ;

import androidx.appcompat.app.AppCompatActivity ;

import android.content.Intent ;
import android.os.Bundle ;
import android.view.View ;
import android.widget.Button ;

import com.example.name.R;
import com.example.name.dashboard;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button registro ;
    private Button cuenta ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name22);
    }

    private void initcontrol() {
        registro=(Button)findViewById(R.id.registro) ;
        cuenta=(Button)findViewById(R.id.cuenta) ;

        registro.setOnClickListener(this);
        cuenta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.registro :
                Intent intent=new Intent(view.getContext(), dashboard.class);
                break ;
            case R.id.cuenta :
                Intent intent2=new Intent(view.getContext(),name22.class);
                startActivityForResult(intent2, 0);
                break ;
        }

    }
}
