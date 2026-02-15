package com.jjs.memoboard.Service;

import com.jjs.memoboard.Dto.NoteDto;

public interface NoteService {

    NoteDto.CreateResponse createNote(NoteDto.CreateRequest createRequestDto);
}
