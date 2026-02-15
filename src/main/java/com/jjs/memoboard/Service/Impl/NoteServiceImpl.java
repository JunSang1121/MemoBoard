package com.jjs.memoboard.Service.Impl;

import com.jjs.memoboard.Domain.Note;
import com.jjs.memoboard.Dto.NoteDto;
import com.jjs.memoboard.Repository.NoteRepository;
import com.jjs.memoboard.Service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;
    private final NoteService noteService;

    @Transactional
    @Override
    public NoteDto.CreateResponse createNote(NoteDto.CreateRequest createRequestDto){

        Note note = Note.builder()
                .title(createRequestDto.getTitle())
                .content(createRequestDto.getContent())
                .build();
        Long noteId = noteRepository.save(note).getId();


        return NoteDto.CreateResponse.builder()
                .noteId(noteId)
                .build();
    }
}
