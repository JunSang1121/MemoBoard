package com.jjs.memoboard.Dto;

import com.jjs.memoboard.Domain.Note;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class NoteDto {

    @Getter
    @NoArgsConstructor
    public static class Response{
        private Long noteId;
        private String title;
        private String content;

        public Response(Note entity){
            this.noteId = entity.getId();
            this.title = entity.getTitle();
            this.content = entity.getContent();
        }
    }
}
