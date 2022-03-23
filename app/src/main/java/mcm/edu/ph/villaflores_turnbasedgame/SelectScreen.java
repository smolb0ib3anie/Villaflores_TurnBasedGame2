package mcm.edu.ph.villaflores_turnbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class SelectScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_select_screen);

        ImageView mykCard,angelicaCard,carlosCard,minchaeCard,erikaCard,lyzCard,caloyCard,eliseCard,renziCard,jewelCard,beaCard,nyoomCard,louisCard,
                  marienelCard,samCard,raphCard,josephCard,merzelleCard,seanCard,maxCard,alexCard,shawnCard,miguelCard,philipCard,staceyCard,vinceCard,
                  nyxCard,evCard,julliannaCard,nathanCard;

        mykCard = findViewById(R.id.mykCard);
        angelicaCard = findViewById(R.id.angelicaCard);
        carlosCard = findViewById(R.id.carlosCard);
        minchaeCard = findViewById(R.id.minchaeCard);
        erikaCard = findViewById(R.id.erikaCard);
        lyzCard = findViewById(R.id.lyzCard);
        caloyCard = findViewById(R.id.caloyCard);
        eliseCard = findViewById(R.id.eliseCard);
        renziCard = findViewById(R.id.renziCard);
        jewelCard = findViewById(R.id.jewelCard);
        beaCard = findViewById(R.id.beaCard);
        nyoomCard = findViewById(R.id.nyoomCard);
        louisCard = findViewById(R.id.louisCard);
        marienelCard = findViewById(R.id.marienelCard);
        samCard = findViewById(R.id.samCard);
        raphCard = findViewById(R.id.raphCard);
        josephCard = findViewById(R.id.josephCard);
        merzelleCard = findViewById(R.id.merzelleCard);
        seanCard = findViewById(R.id.seanCard);
        maxCard = findViewById(R.id.maxCard);
        alexCard = findViewById(R.id.alexCard);
        shawnCard = findViewById(R.id.shawnCard);
        miguelCard = findViewById(R.id.miguelCard);
        philipCard = findViewById(R.id.philipCard);
        staceyCard = findViewById(R.id.staceyCard);
        vinceCard = findViewById(R.id.vinceCard);
        nyxCard = findViewById(R.id.nyxCard);
        evCard = findViewById(R.id.evCard);
        julliannaCard = findViewById(R.id.julliannaCard);
        nathanCard = findViewById(R.id.nathanCard);


        mykCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {}
        });
    }

public void startgame() {
    int selected = 5;
        if (selected > 0) {
            selected--;
        } else if (selected == 5) {
            Intent intent = new Intent(this, GameScreen.class);
            startActivity(intent);
            }
        }
    }
}
