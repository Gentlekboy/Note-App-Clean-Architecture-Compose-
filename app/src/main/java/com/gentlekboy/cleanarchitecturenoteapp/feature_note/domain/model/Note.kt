package com.gentlekboy.cleanachitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey
    val id: Int,
    val title: String,
    val content: String,
    val timeStamp: Long,
    val colour: Int? = null
)
