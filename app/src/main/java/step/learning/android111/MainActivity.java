package step.learning.android111;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        findViewById( R.id.main_button_calc )
                .setOnClickListener( this::onCalcButtonClick ) ;
        findViewById( R.id.main_button_game )
                .setOnClickListener( this::onGameButtonClick ) ;
        findViewById( R.id.main_button_rates )
                .setOnClickListener( this::onRatesButtonClick ) ;
        findViewById( R.id.main_button_chat )
                .setOnClickListener( this::onChatButtonClick ) ;
        findViewById( R.id.main_button_anim )
                .setOnClickListener( this::onAnimButtonClick ) ;
        findViewById( R.id.main_button_tic_tac_toe )
                .setOnClickListener( this::onTicTacToeButtonClick ) ;
    }

    private void onCalcButtonClick( View view ) {
        Intent intent = new Intent(
                this.getApplicationContext(),
                CalcActivity.class ) ;
        startActivity( intent ) ;
    }
    private void onGameButtonClick( View view ) {
        Intent intent = new Intent(
                this.getApplicationContext(),
                GameActivity.class ) ;
        startActivity( intent ) ;
    }
    private void onRatesButtonClick( View view ) {
        Intent intent = new Intent(
                this.getApplicationContext(),
                RatesActivity.class ) ;
        startActivity( intent ) ;
    }
    private void onChatButtonClick( View view ) {
        Intent intent = new Intent(
                this.getApplicationContext(),
                ChatActivity.class ) ;
        startActivity( intent ) ;
    }
    private void onAnimButtonClick( View view ) {
        Intent intent = new Intent(
                this.getApplicationContext(),
                AnimActivity.class ) ;
        startActivity( intent ) ;
    }

    private void onTicTacToeButtonClick( View view ) {
        Intent intent = new Intent(
                this.getApplicationContext(),
                TicTacToeActivity.class ) ;
        startActivity( intent ) ;
    }
}