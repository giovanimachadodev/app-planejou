package com.example.app_planejou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RedirectSmilesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_redirect_smiles)
    }
}