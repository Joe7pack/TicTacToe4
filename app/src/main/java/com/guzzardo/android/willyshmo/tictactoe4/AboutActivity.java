package com.guzzardo.android.willyshmo.tictactoe4;

/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class AboutActivity extends Activity {

    private AdView mAdView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        findViewById(R.id.about_ok).setOnClickListener(
                new OnClickListener() {
            public void onClick(View v) {
//            	showAbout();
                finish();
            }
        });

        mAdView = (AdView) findViewById(R.id.ad_about);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("EE90BD2A7578BC19014DE8617761F10B") //Samsung Galaxy Note
                        // Create an ad request. Check your logcat output for the hashed device ID to
                        // get test ads on a physical device. e.g.
                        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
                        //.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build(); //mAdView.loadAd(adRequest);

        // Start loading the ad in the background.
        mAdView.loadAd(adRequest);
    }

//    private void showAbout() {
//        Intent i = new Intent(this, MainActivity.class);
//        startActivity(i);
//    }
}
