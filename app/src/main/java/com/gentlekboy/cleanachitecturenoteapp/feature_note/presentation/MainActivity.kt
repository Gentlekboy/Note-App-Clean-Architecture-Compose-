package com.gentlekboy.cleanachitecturenoteapp.feature_note.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gentlekboy.cleanachitecturenoteapp.ui.theme.CleanAchitectureNoteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanAchitectureNoteAppTheme {

            }
        }
    }
}