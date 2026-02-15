package com.jjs.memoboard.Repository;

import com.jjs.memoboard.Domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note,Long> {
}
