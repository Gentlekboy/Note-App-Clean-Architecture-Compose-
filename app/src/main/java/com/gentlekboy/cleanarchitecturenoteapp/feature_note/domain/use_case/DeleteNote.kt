package com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

/**
 * Use case class to delete a note
 */
class DeleteNote(private val repository: NoteRepository) {
    suspend operator fun invoke(note: Note) = repository.deleteNote(note)
}