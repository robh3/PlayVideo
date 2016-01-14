package com.robh3.playvideo.activity;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import com.robh3.playvideo.R;

/**
 * Created by U0172450 on 1/13/2016.
 */
public class VideoViewActivity extends AppCompatActivity {

    // Declare variables
    ProgressDialog pDialog;
    VideoView videoview;

    // Insert your Video URL
    String VideoURL = "https://clips.vorwaerts-gmbh.de/VfE_html5.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the layout from video_main.xml
        setContentView(R.layout.videoview_main);

        final VideoView mVideoView = (VideoView) findViewById(R.id.VideoView);
        mVideoView.setVideoPath(VideoURL);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(mVideoView);
        //mVideoView.setMediaController(mediaController);
        mVideoView.requestFocus();
        mVideoView.setOnPreparedListener(new OnPreparedListener() {
            // Close the progress bar and play the video
            public void onPrepared(MediaPlayer mp) {
                mVideoView.start();
            }
        });


    }
}
