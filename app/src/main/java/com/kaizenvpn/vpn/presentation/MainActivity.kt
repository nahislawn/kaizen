package com.kaizenvpn.vpn.presentation

import android.os.AsyncTask
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.kaizenvpn.vpn.core.base.BaseActivity
import com.kaizenvpn.vpn.databinding.ActivityMainBinding
import com.loopj.android.http.HttpGet
import dagger.hilt.android.AndroidEntryPoint
import java.io.ByteArrayOutputStream
import java.io.IOException


import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.HttpStatus;
import cz.msebera.android.httpclient.StatusLine;
import cz.msebera.android.httpclient.client.ClientProtocolException;
import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onActivityCreated(savedInstanceState: Bundle?) {

        MobileAds.setRequestConfiguration(
            RequestConfiguration.Builder().setTestDeviceIds(
                listOf(
                    "6F8A2D4A6BB0DC76EB8D7C3AFEAAF5E8"
                )
            ).build()
        )


    }

    override val isFlagLight: Boolean
        get() = false




}