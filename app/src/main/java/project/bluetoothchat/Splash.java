package project.bluetoothchat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by bulbul-ulab on 5/21/16.
 */
public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.splash);

        Thread loading = new Thread() {
            public void run() {
                try {
                    sleep(4000);
                    Intent main = new Intent(Splash.this, MainActivity.class);
                    startActivity(main);
                }

                catch (Exception e) {
                    e.printStackTrace();
                }

                finally {
                    finish();
                }
            }
        };

        loading.start();
    }

}