package com.beshoykamal.idapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.rbddevs.splashy.Splashy;

public class MainActivity extends AppCompatActivity {
TextView call,followers;
int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        followers=findViewById(R.id.followers);

        new Splashy(this)  // For JAVA : new Splashy(this)
                .setLogo(R.drawable.newp)
                .setTitle("WELCOME\n")
//                .setTitleColor("#00BCD4")
                .show();
    }


    public void face(View view) {
        Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
        YoYo.with(Techniques.Wave).duration(200).repeat(1).playOn(findViewById(R.id.imageView8));

        startActivity(in);
    }

    public void inst(View view) {
        YoYo.with(Techniques.Bounce).duration(200).repeat(1).playOn(findViewById(R.id.imageView50));

        Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com"));
        startActivity(in);


    }

    public void call(View view) {
        YoYo.with(Techniques.FlipInX).duration(200).repeat(1).playOn(findViewById(R.id.call));

        Intent in = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+201093364710"));
        startActivity(in);
    }

    public void fool(View view) {
        YoYo.with(Techniques.Shake).duration(200).repeat(1).playOn(findViewById(R.id.follow));

        count++;
        if (count<3)
            Toast.makeText(this, "Thank you for Follow ", Toast.LENGTH_SHORT).show();


    }

    public void message(View view) {
        YoYo.with(Techniques.FlipInX).duration(200).repeat(1).playOn(findViewById(R.id.textView13));

        Intent in = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:+201093364710"));
        startActivity(in);
    }

    public void about(View view) {
        YoYo.with(Techniques.FlipInX).duration(200).repeat(1).playOn(findViewById(R.id.textView14));

        Intent in=new Intent(this,About.class);
        startActivity(in);
    }

    public void location(View view) {
        YoYo.with(Techniques.FlipInX).duration(200).repeat(1).playOn(findViewById(R.id.textView7));

        Intent in=new Intent(Intent.ACTION_VIEW,Uri.parse("geo: 30.1116976,31.3125198?z=13"));
        startActivity(in);
    }
}
