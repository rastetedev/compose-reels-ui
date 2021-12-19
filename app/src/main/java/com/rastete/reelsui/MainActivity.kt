package com.rastete.reelsui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.rastete.reelsui.reel.ReelsView
import com.rastete.reelsui.ui.theme.ReelsUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReelsUITheme {
                ReelsView()
            }
        }
    }
}
