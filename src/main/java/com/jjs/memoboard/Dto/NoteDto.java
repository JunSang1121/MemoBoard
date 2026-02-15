package com.jjs.memoboard.Dto;

import com.jjs.memoboard.Domain.Note;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class NoteDto {


    @Getter
    @NoArgsConstructor
    public static class CreateRequest{
        private String title;
        private String content;
    }





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

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class CreateResponse{
        private Long noteId;

        public CreateResponse(Note entity){

            this.noteId = entity.getId();
        }
    }
}
