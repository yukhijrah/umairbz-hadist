package decloudius.app.kumpulanhadits;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Umair
 */

public class SplashActivity extends AppCompatActivity {

    private static final int TIGA_DETIK = 3000; //satuan menunggu "ms"

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        countdown();
        //pindah();
    }

//    private void pindah(){
//        new Handler().postDelayed(new Runnable() {
//            public void run() {
//
//                     /* Create an intent that will start the main activity. */
//                Intent mainIntent = new Intent(SplashActivity.this,
//                        MainActivity.class);
//                mainIntent.putExtra("id", "1");
//
//                //SplashScreen.this.startActivity(mainIntent);
//                startActivity(mainIntent);
//                     /* Finish splash activity so user cant go back to it. */
//                SplashActivity.this.finish();
//
//                     /* Apply our splash exit (fade out) and main
//                        entry (fade in) animation transitions. */
//                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
//            }
//        }, 3000L);
//    }



    private void countdown() {
        Handler handler = new Handler();

        Runnable menunggu = new Runnable() {
            @Override
            public void run() {
                gotoMain();
            }
        };

        handler.postDelayed(menunggu, TIGA_DETIK);
    }

    private void gotoMain(){
        Intent intentMain = new Intent(this, MainActivity.class);
        startActivity(intentMain);
        finish();
    }
}
