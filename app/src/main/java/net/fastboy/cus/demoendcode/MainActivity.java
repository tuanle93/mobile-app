package net.fastboy.cus.demoendcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.widget.TextView;

import com.scottyab.aescrypt.AESCrypt;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.data);

        String source = "One more time";
        String message = "service";
        try {
            String encryptedMsg = AESCrypt.encrypt(source, message);
            String messageAfterDecrypt = AESCrypt.decrypt(source, encryptedMsg);
            tv.setText(encryptedMsg + " Gải mã " + messageAfterDecrypt);
        }catch (GeneralSecurityException e){
            //handle error
        }

    }
}
