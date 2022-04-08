package com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

/**
 * Use case class to get a note by its ID]
 */
class GetNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(id: Int) = noteRepository.getNoteById(id)
}