package com.example.demogestureapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
        private GestureDetectorCompat gestureDetectorCompat = null;
        private VideoView videoView;
        TextView txtinfo;
        public int count = 1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            txtinfo = (TextView)findViewById(R.id.txtinfo);
            videoView = (VideoView) findViewById(R.id.video_id);
            GestureIdentification ges = new GestureIdentification();
            ges.setActivity(this);
            gestureDetectorCompat = new GestureDetectorCompat(this, ges);

            String path1 = "android.resource://" + getPackageName() + "/" + R.raw.vid1;
            Uri uri1 = Uri.parse(path1);
            videoView.setVideoURI(uri1);
            videoView.start();
            txtinfo.setText("Funny Animals");

        }


        @Override
        public boolean onTouchEvent(MotionEvent event) {
            gestureDetectorCompat.onTouchEvent(event);
            return true;
        }

        public void swipeRight() {

            Intent intent;
            intent = new Intent(MainActivity.this, SwipeActivity.class);
            startActivity(intent);
        }

        public void swipeLeft() {


            OpenDialogue();
        }

        public void OpenDialogue() {

            AlertBox dia = new AlertBox();
            dia.show(getSupportFragmentManager(), "Subscribe");
        }

        public void swipeUp() {
            count++;
            if (count == 5) {
                count = 1;
            }


            switch (count) {
                case 1:
                    String path1 = "android.resource://" + getPackageName() + "/" + R.raw.vid1;
                    Uri uri1 = Uri.parse(path1);
                    videoView.setVideoURI(uri1);
                    videoView.start();
                    txtinfo.setText("Funny Animals");
                    break;
                case 2:
                    String path2 = "android.resource://" + getPackageName() + "/" + R.raw.vid2;
                    Uri uri2 = Uri.parse(path2);
                    videoView.setVideoURI(uri2);
                    videoView.start();
                    txtinfo.setText("Football Highlights");
                    break;
                case 3:
                    String path3 = "android.resource://" + getPackageName() + "/" + R.raw.vid3;
                    Uri uri3 = Uri.parse(path3);
                    videoView.setVideoURI(uri3);
                    videoView.start();
                    txtinfo.setText("Music video");
                    break;
                case 4:String path4 = "android.resource://" + getPackageName() + "/" + R.raw.vid4;
                    Uri uri4 = Uri.parse(path4);
                    videoView.setVideoURI(uri4);
                    videoView.start();
                    txtinfo.setText("Gameplay");
                    break;
            }


        }

        public void swipeDown() {

            count--;
            if (count == 0) {
                count = 4;
            }
            switch (count) {
                case 1:
                    String path1 = "android.resource://" + getPackageName() + "/" + R.raw.vid1;
                    Uri uri1 = Uri.parse(path1);
                    videoView.setVideoURI(uri1);
                    videoView.start();
                    txtinfo.setText("Funny Animals");
                    break;
                case 2:
                    String path2 = "android.resource://" + getPackageName() + "/" + R.raw.vid2;
                    Uri uri2 = Uri.parse(path2);
                    videoView.setVideoURI(uri2);
                    videoView.start();
                    txtinfo.setText("Football Highlights");
                    break;
                case 3:
                    String path3 = "android.resource://" + getPackageName() + "/" + R.raw.vid3;
                    Uri uri3 = Uri.parse(path3);
                    videoView.setVideoURI(uri3);
                    videoView.start();
                    txtinfo.setText("Music video");
                    break;
                case 4:String path4 = "android.resource://" + getPackageName() + "/" + R.raw.vid4;
                    Uri uri4 = Uri.parse(path4);
                    videoView.setVideoURI(uri4);
                    videoView.start();
                    txtinfo.setText("Gameplay");
                    break;
            }
        }

    }
