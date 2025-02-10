package com.uno.getinline.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Admin {

    private long id;

    private String email;
    private String nickname;
    private String phoneNumber;
    private String memo;

    private LocalDateTime cratedAt;
    private LocalDateTime modifiedAt;

}
