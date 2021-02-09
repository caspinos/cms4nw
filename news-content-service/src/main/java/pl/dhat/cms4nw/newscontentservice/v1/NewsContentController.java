package pl.dhat.cms4nw.newscontentservice.v1;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dhat.cms4nw.newscontentservice.model.NewsContent;
import pl.dhat.cms4nw.newscontentservice.service.NewsContentService;

@RestController
@RequestMapping("/api/v1/news")
public class NewsContentController {

    private final NewsContentService newsContentService;

    public NewsContentController(NewsContentService newsContentService) {
        this.newsContentService = newsContentService;
    }

    @GetMapping("/")
    public Page<NewsContent> getNewsPage(
            Pageable pageable) {
        return this.newsContentService.getNewsPage(pageable);
    }

}