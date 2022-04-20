package com.gentlekboy.cleanarchitecturenoteapp.feature_note.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note.AddEditNoteScreen
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.presentation.notes.components.NotesScreen
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.presentation.util.Screens
import com.gentlekboy.cleanarchitecturenoteapp.ui.theme.CleanArchitectureNoteAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanArchitectureNoteAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Screens.NotesScreen.route
                    ) {
                        composable(route = Screens.NotesScreen.route) {
                            NotesScreen(navController = navController)
                        }

                        composable(
                            route = Screens.AddEditNoteScreen.route + "?noteId={noteId}&noteColour={noteColour}",
                            arguments = listOf(
                                navArgument(name = "noteId") {
                                    type = NavType.IntType
                                    defaultValue = -1
                                },
                                navArgument(name = "noteColour") {
                                    type = NavType.IntType
                                    defaultValue = -1
                                }
                            )
                        ) {
                            val noteColour = it.arguments?.getInt("noteColour") ?: -1

                            AddEditNoteScreen(
                                navController = navController,
                                noteColour = noteColour
                            )
                        }
                    }
                }
            }
        }
    }
}