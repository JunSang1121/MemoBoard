package com.jjs.memoboard.Controller;


import com.jjs.memoboard.Dto.NoteDto;
import com.jjs.memoboard.Service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NoteController {

    private final NoteService noteService;

    @PostMapping
    public ResponseEntity<NoteDto.CreateResponse> createNote(@RequestBody NoteDto.CreateRequest createRequest){
         NoteDto.CreateResponse response = noteService.createNote(createRequest);
         return ResponseEntity.ok(response);
    }
}
