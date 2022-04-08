package com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.use_case

/**
 * Wrapper class for injecting [GetNotes], [AddNote] and [DeleteNote] use cases
 */
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote
)
