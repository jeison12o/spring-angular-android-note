package com.note.restfullNote.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.note.restfullNote.entity.Note;

public interface NoteRepository extends CrudRepository<Note, Serializable> {
}
