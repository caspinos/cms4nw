package pl.dhat.cms4nw.newscontentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsContent {

    @Id
    private String id;
    private String title;
    private LocalDateTime publishDate;
    private String content;
}
