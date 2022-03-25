package mcm.edu.ph.villaflores_turnbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class GameScreen extends AppCompatActivity {
    int selected = 5;

    TextView HeroHp1, HeroHp2, HeroHp3, HeroHp4, HeroHp5, MonsterHealth;
    ImageView mykCard, angelicaCard, carlosCard, minchaeCard, erikaCard, lyzCard, caloyCard, eliseCard, renziCard, jewelCard, beaCard, nyoomCard, louisCard,
            marienelCard, samCard, raphCard, josephCard, merzelleCard, seanCard, maxCard, alexCard, shawnCard, miguelCard, philipCard, staceyCard, vinceCard,
            nyxCard, evCard, julliannaCard, nathanCard, monster;
    ProgressBar Hero1, Hero2, Hero3, Hero4, Hero5, monsterHp;

    String MonsterStats = "Forest Monster";
    int MonsterHp = 5000;
    int MonsterHPPercentage;
    int MonsterMinDmg = 50;
    int MonsterMaxDmg = 150;
    Boolean disablestatus = false;
    int buttoncounter = 0;

    String Hero1Stats = "Hero 1";
    int Hero1Hp = 1200;
    int Hero1HpPercentage;
    int Hero1MinDmg = 15;
    int Hero1MaxDmg = 95;
    int TurnNumber = 1;

    String Hero2Stats = "Hero 2";
    int Hero2Hp = 1200;
    int Hero2HpPercentage;
    int Hero2MinDmg = 15;
    int Hero2MaxDmg = 95;
    int TurnNumber2 = 1;

    String Hero3Stats = "Hero 3";
    int Hero3Hp = 1200;
    int Hero3HpPercentage;
    int Hero3MinDmg = 15;
    int Hero3MaxDmg = 95;
    int TurnNumber3 = 1;

    String Hero4Stats = "Hero 4";
    int Hero4Hp = 1200;
    int Hero4HpPercentage;
    int Hero4MinDmg = 15;
    int Hero4MaxDmg = 95;
    int TurnNumber4 = 1;

    String Hero5Stats = "Hero 5";
    int Hero5Hp = 1200;
    int Hero5HpPercentage;
    int Hero5MinDmg = 15;
    int Hero5MaxDmg = 95;
    int TurnNumber5 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_game_screen);

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

        monster = findViewById(R.id.monster);

        HeroHp1 = findViewById(R.id.HeroHp1);
        HeroHp2 = findViewById(R.id.HeroHp2);
        HeroHp3 = findViewById(R.id.HeroHp3);
        HeroHp4 = findViewById(R.id.HeroHp4);
        HeroHp5 = findViewById(R.id.HeroHp5);
        MonsterHealth = findViewById(R.id.MonsterHealth);

        Hero1 = findViewById(R.id.Hero1);
        Hero2 = findViewById(R.id.Hero3);
        Hero3 = findViewById(R.id.Hero2);
        Hero4 = findViewById(R.id.Hero4);
        Hero5 = findViewById(R.id.Hero5);
        monsterHp = findViewById(R.id.monsterHp);


        mykCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (mykCard.isSelected())
                    setVisibility++;
                mykCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber % 2 == 1) {
                    mykCard.setEnabled(false);
                } else if (TurnNumber % 2 != 1) {
                    mykCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    mykCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    mykCard.setEnabled(true);
                }
            }
        });

        angelicaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (angelicaCard.isSelected())
                    setVisibility++;
                angelicaCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber2 % 2 == 1) {
                    angelicaCard.setEnabled(false);
                } else if (TurnNumber2 % 2 != 1) {
                    angelicaCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    angelicaCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    angelicaCard.setEnabled(true);
                }
            }
        });

        carlosCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (carlosCard.isSelected())
                    setVisibility++;
                carlosCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber3 % 2 == 1) {
                    carlosCard.setEnabled(false);
                } else if (TurnNumber3 % 2 != 1) {
                    carlosCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    carlosCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    carlosCard.setEnabled(true);
                }
            }
        });

        minchaeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (minchaeCard.isSelected())
                    setVisibility++;
                minchaeCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber4 % 2 == 1) {
                    minchaeCard.setEnabled(false);
                } else if (TurnNumber4 % 2 != 1) {
                    minchaeCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    minchaeCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    minchaeCard.setEnabled(true);
                }
            }
        });

        erikaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (erikaCard.isSelected())
                    setVisibility++;
                erikaCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber5 % 2 == 1) {
                    erikaCard.setEnabled(false);
                } else if (TurnNumber5 % 2 != 1) {
                    erikaCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    erikaCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    erikaCard.setEnabled(true);
                }
            }
        });

        lyzCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (lyzCard.isSelected())
                    setVisibility++;
                lyzCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber % 2 == 1) {
                    lyzCard.setEnabled(false);
                } else if (TurnNumber % 2 != 1) {
                    lyzCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    lyzCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    lyzCard.setEnabled(true);
                }
            }
        });

        caloyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (caloyCard.isSelected())
                    setVisibility++;
                caloyCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber2 % 2 == 1) {
                    caloyCard.setEnabled(false);
                } else if (TurnNumber2 % 2 != 1) {
                    caloyCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    caloyCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    caloyCard.setEnabled(true);
                }
            }
        });

        eliseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (eliseCard.isSelected())
                    setVisibility++;
                eliseCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber3 % 2 == 1) {
                    eliseCard.setEnabled(false);
                } else if (TurnNumber3 % 2 != 1) {
                    eliseCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    eliseCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    eliseCard.setEnabled(true);
                }
            }
        });

        renziCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (renziCard.isSelected())
                    setVisibility++;
                renziCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber4 % 2 == 1) {
                    renziCard.setEnabled(false);
                } else if (TurnNumber4 % 2 != 1) {
                    renziCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    renziCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    renziCard.setEnabled(true);
                }
            }
        });

        jewelCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (jewelCard.isSelected())
                    setVisibility++;
                jewelCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber5 % 2 == 1) {
                    jewelCard.setEnabled(false);
                } else if (TurnNumber5 % 2 != 1) {
                    jewelCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    jewelCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    jewelCard.setEnabled(true);
                }
            }
        });

        beaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (beaCard.isSelected())
                    setVisibility++;
                beaCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber % 2 == 1) {
                    beaCard.setEnabled(false);
                } else if (TurnNumber % 2 != 1) {
                    beaCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    beaCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    beaCard.setEnabled(true);
                }
            }
        });

        nyoomCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (nyoomCard.isSelected())
                    setVisibility++;
                nyoomCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber2 % 2 == 1) {
                    nyoomCard.setEnabled(false);
                } else if (TurnNumber2 % 2 != 1) {
                    nyoomCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    nyoomCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    nyoomCard.setEnabled(true);
                }
            }
        });

        louisCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (louisCard.isSelected())
                    setVisibility++;
                louisCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber3 % 2 == 1) {
                    louisCard.setEnabled(false);
                } else if (TurnNumber3 % 2 != 1) {
                    louisCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    louisCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    louisCard.setEnabled(true);
                }
            }
        });

        marienelCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (marienelCard.isSelected())
                    setVisibility++;
                marienelCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber4 % 2 == 1) {
                    marienelCard.setEnabled(false);
                } else if (TurnNumber4 % 2 != 1) {
                    marienelCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    marienelCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    marienelCard.setEnabled(true);
                }
            }
        });

        samCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (samCard.isSelected())
                    setVisibility++;
                samCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber5 % 2 == 1) {
                    samCard.setEnabled(false);
                } else if (TurnNumber5 % 2 != 1) {
                    samCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    samCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    samCard.setEnabled(true);
                }
            }
        });

        raphCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (raphCard.isSelected())
                    setVisibility++;
                raphCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber % 2 == 1) {
                    raphCard.setEnabled(false);
                } else if (TurnNumber % 2 != 1) {
                    raphCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    raphCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    raphCard.setEnabled(true);
                }
            }
        });

        josephCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (josephCard.isSelected())
                    setVisibility++;
                josephCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber2 % 2 == 1) {
                    josephCard.setEnabled(false);
                } else if (TurnNumber2 % 2 != 1) {
                    josephCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    josephCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    josephCard.setEnabled(true);
                }
            }
        });

        merzelleCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (merzelleCard.isSelected())
                    setVisibility++;
                merzelleCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber3 % 2 == 1) {
                    merzelleCard.setEnabled(false);
                } else if (TurnNumber3 % 2 != 1) {
                    merzelleCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    merzelleCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    merzelleCard.setEnabled(true);
                }
            }
        });

        seanCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (seanCard.isSelected())
                    setVisibility++;
                seanCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber4 % 2 == 1) {
                    seanCard.setEnabled(false);
                } else if (TurnNumber4 % 2 != 1) {
                    seanCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    seanCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    seanCard.setEnabled(true);
                }
            }
        });

        maxCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (maxCard.isSelected())
                    setVisibility++;
                maxCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber5 % 2 == 1) {
                    maxCard.setEnabled(false);
                } else if (TurnNumber5 % 2 != 1) {
                    maxCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    maxCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    maxCard.setEnabled(true);
                }
            }
        });

        alexCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (alexCard.isSelected())
                    setVisibility++;
                alexCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber % 2 == 1) {
                    alexCard.setEnabled(false);
                } else if (TurnNumber % 2 != 1) {
                    alexCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    alexCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    alexCard.setEnabled(true);
                }
            }
        });

        shawnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (shawnCard.isSelected())
                    setVisibility++;
                shawnCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber2 % 2 == 1) {
                    shawnCard.setEnabled(false);
                } else if (TurnNumber2 % 2 != 1) {
                    shawnCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    shawnCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    shawnCard.setEnabled(true);
                }
            }
        });

        miguelCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (miguelCard.isSelected())
                    setVisibility++;
                miguelCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber3 % 2 == 1) {
                    miguelCard.setEnabled(false);
                } else if (TurnNumber3 % 2 != 1) {
                    miguelCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    miguelCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    miguelCard.setEnabled(true);
                }
            }
        });

        philipCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (philipCard.isSelected())
                    setVisibility++;
                philipCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber4 % 2 == 1) {
                    philipCard.setEnabled(false);
                } else if (TurnNumber4 % 2 != 1) {
                    philipCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    philipCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    philipCard.setEnabled(true);
                }
            }
        });

        staceyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (staceyCard.isSelected())
                    setVisibility++;
                staceyCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber5 % 2 == 1) {
                    staceyCard.setEnabled(false);
                } else if (TurnNumber5 % 2 != 1) {
                    staceyCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    staceyCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    staceyCard.setEnabled(true);
                }
            }
        });

        vinceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (vinceCard.isSelected())
                    setVisibility++;
                vinceCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber % 2 == 1) {
                    vinceCard.setEnabled(false);
                } else if (TurnNumber % 2 != 1) {
                    vinceCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    vinceCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    vinceCard.setEnabled(true);
                }
            }
        });

        nyxCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (nyxCard.isSelected())
                    setVisibility++;
                nyxCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber2 % 2 == 1) {
                    nyxCard.setEnabled(false);
                } else if (TurnNumber2 % 2 != 1) {
                    nyxCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    nyxCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    nyxCard.setEnabled(true);
                }
            }
        });

        evCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (evCard.isSelected())
                    setVisibility++;
                evCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber3 % 2 == 1) {
                    evCard.setEnabled(false);
                } else if (TurnNumber3 % 2 != 1) {
                    evCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    evCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    evCard.setEnabled(true);
                }
            }
        });

        julliannaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (julliannaCard.isSelected())
                    setVisibility++;
                julliannaCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber4 % 2 == 1) {
                    julliannaCard.setEnabled(false);
                } else if (TurnNumber4 % 2 != 1) {
                    julliannaCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    julliannaCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    julliannaCard.setEnabled(true);
                }
            }
        });

        nathanCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setVisibility = 0;
                if (nathanCard.isSelected())
                    setVisibility++;
                nathanCard.setVisibility(setVisibility >= 1 ? View.VISIBLE : View.GONE);

                if (TurnNumber5 % 2 == 1) {
                    nathanCard.setEnabled(false);
                } else if (TurnNumber5 % 2 != 1) {
                    nathanCard.setEnabled(true);
                }
                if (buttoncounter > 0) {
                    nathanCard.setEnabled(false);
                    buttoncounter--;
                } else if (buttoncounter == 0) {
                    nathanCard.setEnabled(true);
                }
            }
        });

    }

    public void onClick(View view) {

        Random randomizer = new Random();
        int Hero1Dmg = randomizer.nextInt(Hero1MaxDmg - Hero1MinDmg) + Hero1MaxDmg;
        int Hero2Dmg = randomizer.nextInt(Hero2MaxDmg - Hero2MinDmg) + Hero2MaxDmg;
        int Hero3Dmg = randomizer.nextInt(Hero3MaxDmg - Hero3MinDmg) + Hero3MaxDmg;
        int Hero4Dmg = randomizer.nextInt(Hero4MaxDmg - Hero4MinDmg) + Hero4MaxDmg;
        int Hero5Dmg = randomizer.nextInt(Hero5MaxDmg - Hero5MinDmg) + Hero5MaxDmg;
        int MonsterDmg = randomizer.nextInt(MonsterMaxDmg - MonsterMinDmg) + MonsterMaxDmg;
        int critChance = randomizer.nextInt(60);
        if (critChance <= 25) {

        }

        int evade = randomizer.nextInt(22);
        if (evade < 5) {

        }

        switch (view.getId()) {

            case R.id.monster:
                MonsterHp = MonsterHp - 80;
                MonsterHPPercentage = MonsterHp * 710 / 5000;
                monsterHp.setProgress((int) MonsterHPPercentage, true);
                TurnNumber++;
                TurnNumber2++;
                TurnNumber3++;
                TurnNumber4++;
                TurnNumber5++;

                if (MonsterHp < 0) {
                    Hero1Hp = 1200;
                    Hero2Hp = 1200;
                    Hero3Hp = 1200;
                    Hero4Hp = 1200;
                    Hero5Hp = 1200;
                    MonsterHp = 5000;
                    TurnNumber = 1;
                    TurnNumber2 = 1;
                    TurnNumber3 = 1;
                    TurnNumber4 = 1;
                    TurnNumber5 = 1;
                }

                buttoncounter = 1;
                break;


            case R.id.Hero1:
                if (TurnNumber % 2 == 1) {
                    MonsterHp = MonsterHp - Hero1Dmg;
                    TurnNumber++;

                    if (MonsterHp < 0) {
                        Hero1Hp = 1200;
                        MonsterHp = 5000;
                        TurnNumber = 1;
                    }
                }
                else if (TurnNumber % 2 != 1) {
                    Hero1Hp = Hero1Hp - MonsterDmg;
                    TurnNumber++;

                    if (Hero1Hp < 0) {
                        Hero1Hp = 1200;
                        MonsterHp = 5000;
                        TurnNumber = 1;

                        break;
                    }
                }

            case R.id.Hero2:
                if (TurnNumber2 % 2 == 1) {
                    MonsterHp = MonsterHp - Hero2Dmg;
                    TurnNumber2++;

                    if (MonsterHp < 0) {
                        Hero2Hp = 1200;
                        MonsterHp = 5000;
                        TurnNumber2 = 1;
                    }
                }
                else if (TurnNumber % 2 != 1) {
                    Hero2Hp = Hero2Hp - MonsterDmg;
                    TurnNumber2++;

                    if (Hero2Hp < 0) {
                        Hero2Hp = 1200;
                        MonsterHp = 5000;
                        TurnNumber2 = 1;

                        break;
                    }
                }

            case R.id.Hero3:
                if (TurnNumber3 % 2 == 1) {
                    MonsterHp = MonsterHp - Hero3Dmg;
                    TurnNumber3++;

                    if (MonsterHp < 0) {
                        Hero3Hp = 1200;
                        MonsterHp = 5000;
                        TurnNumber3 = 1;
                    }
                }
                else if (TurnNumber3 % 2 != 1) {
                    Hero3Hp = Hero3Hp - MonsterDmg;
                    TurnNumber3++;

                    if (Hero3Hp < 0) {
                        Hero3Hp = 1200;
                        MonsterHp = 5000;
                        TurnNumber3 = 1;

                        break;
                    }
                }

            case R.id.Hero4:
                if (TurnNumber4 % 2 == 1) {
                    MonsterHp = MonsterHp - Hero4Dmg;
                    TurnNumber4++;

                    if (MonsterHp < 0) {
                        Hero4Hp = 1200;
                        MonsterHp = 5000;
                        TurnNumber4 = 1;
                    }
                }
                else if (TurnNumber4 % 2 != 1) {
                    Hero4Hp = Hero4Hp - MonsterDmg;
                    TurnNumber3++;

                    if (Hero4Hp < 0) {
                        Hero4Hp = 1200;
                        MonsterHp = 5000;
                        TurnNumber4 = 1;

                        break;
                    }
                }

            case R.id.Hero5:
                if (TurnNumber5 % 2 == 1) {
                    MonsterHp = MonsterHp - Hero5Dmg;
                    TurnNumber5++;

                    if (MonsterHp < 0) {
                        Hero5Hp = 1200;
                        MonsterHp = 5000;
                        TurnNumber5 = 1;
                    }
                }
                else if (TurnNumber5 % 2 != 1) {
                    Hero5Hp = Hero5Hp - MonsterDmg;
                    TurnNumber3++;

                    if (Hero5Hp < 0) {
                        Hero5Hp = 1200;
                        MonsterHp = 5000;
                        TurnNumber5 = 1;

                        break;
                    }
                }

        }
    }
}
