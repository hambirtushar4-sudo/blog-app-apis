package com.example.demo.payloads;


import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO class used to send paginated post data with metadata.
 */
@Getter
@Setter
@NoArgsConstructor
public class PostResponse {

    private List<PostDto> content;    // List of posts on this page
    private int pageNumber;           // Current page number
    private int pageSize;             // Size of page
    private long totalElements;       // Total posts in DB
    private int totalPages;           // Total number of pages
    private boolean lastPage;         // Whether this is the last page
}
