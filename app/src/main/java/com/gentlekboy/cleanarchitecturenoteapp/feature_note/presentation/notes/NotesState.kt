package com.gentlekboy.cleanarchitecturenoteapp.feature_note.presentation.notes

import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.util.OrderType

/**
 * Data class to handle state received from and sent to the UI in the [NotesViewModel]
 */
data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
