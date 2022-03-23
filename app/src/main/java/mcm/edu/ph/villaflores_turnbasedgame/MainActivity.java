package mcm.edu.ph.villaflores_turnbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        ImageButton startBtn = (ImageButton)findViewById(R.id.startBtn);
        TextView titleText = (TextView)findViewById(R.id.titleText);


    }
    public void goSelectScreen(View view){

        Intent selectScreen = new Intent(this, SelectScreen.class);
        startActivity(selectScreen);
    }
}