package com.note.restfullNote.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.note.restfullNote.entity.User;

public interface UserRepository extends CrudRepository<User, Serializable> {
}
