package com.bookSzpan;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity
{
    private int id;
    private String title;
    private String author;
    private int owner_user_id;
    private int holder_user_id;
    private int status;
}