package nanodegree.udacity.com.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView(R.layout.activity_main);

    }

    public void selfMessage1(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Filmes populares app!";
        int duration = LENGTH_SHORT;

        Toast toast = makeText(context, text, duration);
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 10, 400);
        toast.show();
    }

    public void selfMessage2(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Stock Hawk app!";
        int duration = LENGTH_SHORT;

        Toast toast = makeText(context, text, duration);
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 10, 400);
        toast.show();
    }

    public void selfMessage3(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Faça-o maior app!";
        int duration = LENGTH_SHORT;

        Toast toast = makeText(context, text, duration);
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 10, 400);
        toast.show();
    }

    public void selfMessage4(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Faça seu aplicativo com Material app!";
        int duration = LENGTH_SHORT;

        Toast toast = makeText(context, text, duration);
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 10, 400);
        toast.show();
    }

    public void selfMessage5(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Seja onipresente app!";
        int duration = LENGTH_SHORT;

        Toast toast = makeText(context, text, duration);
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 10, 400);
        toast.show();
    }

    public void selfMessage6(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone app!";
        int duration = LENGTH_SHORT;

        Toast toast = makeText(context, text, duration);
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 10, 400);
        toast.show();
    }

}

