package com.example.neumi.constraintdemo;

import android.os.Build;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvText;
    EditText etComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvText = findViewById(R.id.tvText);
        etComment = findViewById(R.id.etComment);
        if (savedInstanceState != null) {
            etComment.setText(savedInstanceState.getString("comment"));
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        String str="Voici un petit schéma pour tout ceux qui ne savent pas quels personnages prendre dans leur équipe. Vous pouvez voir qu'il existe 3 pôles bien distincts mais certains personnages se trouvent entre les deux.\n\n Vous voyez donc un pôle Magie, un autre Dextérité et enfin un dernier Force./n dans le pôle Magic il ne se trouve qu'un seul personnage: Aeris qui est surtout spécialisée dans la magis blanche.\n\n" +
                "Dans le pôle Dextérité vous trouverez Nanaki et Yuffie. Le premier est un personnage \"obligatoire\" alors que le second est un personnage dont l'acquisition est optionelle\n\n Dans le dernier pôle, Barret et Cid se partage le rôle du personnage qui possède de la force et de la vitalité.\n\n Vous pouvez encore trouver trois autres personnages qui se trouvent entre deux catégorie: Tifa entre Force et Dextérité, Vincent entre Magic et Dextérité et enfin Cait Sith entre Force et Magic."
;
        tvText.setText(str);
        if (Build.VERSION.SDK_INT >= 26) {
            tvText.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("comment", etComment.getText().toString());
    }
}
