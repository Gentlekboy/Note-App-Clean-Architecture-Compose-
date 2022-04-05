package com.gentlekboy.cleanarchitecturenoteapp.di

import android.app.Application
import androidx.room.Room
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.data.data_source.NoteDatabase
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.data.repository.NoteRepositoryImpl
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.use_case.AddNote
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.use_case.DeleteNote
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.use_case.GetNotes
import com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Application): NoteDatabase =
        Room.databaseBuilder(application, NoteDatabase::class.java, NoteDatabase.DATABASE_NAME)
            .build()

    @Provides
    @Singleton
    fun provideNoteRepository(database: NoteDatabase): NoteRepository =
        NoteRepositoryImpl(database.noteDao)

    @Provides
    @Singleton
    fun provideNoteUseCases(noteRepository: NoteRepository): NoteUseCases =
        NoteUseCases(
            getNotes = GetNotes(noteRepository),
            deleteNote = DeleteNote(noteRepository),
            addNote = AddNote(noteRepository)
        )
}