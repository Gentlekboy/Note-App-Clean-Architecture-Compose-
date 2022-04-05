package com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gentlekboy.cleanarchitecturenoteapp.ui.theme.*

@Entity
data class Note(
    @PrimaryKey
    val id: Int,
    val title: String,
    val content: String,
    val timeStamp: Long,
    val colour: Int? = null
) {
    companion object {
        val noteColours = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

/**
 * Class to throw an exception when validating the addition of a new note to the local database
 */
class InvalidNoteException(message: String) : Exception(message)