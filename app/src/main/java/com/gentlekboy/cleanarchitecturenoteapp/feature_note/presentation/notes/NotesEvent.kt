package com.gentlekboy.cleanarchitecturenoteapp.feature_note.presentation.notes

import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder

/**
 * Sealed class to handle events received from the UI in the [NotesViewModel]
 */
sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}