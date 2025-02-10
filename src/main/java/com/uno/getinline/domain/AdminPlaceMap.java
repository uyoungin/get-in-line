package com.uno.getinline.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AdminPlaceMap {

    private long id;

    private Admin admin;
    private Place place;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
