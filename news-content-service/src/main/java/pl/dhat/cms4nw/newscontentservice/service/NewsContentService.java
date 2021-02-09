package pl.dhat.cms4nw.newscontentservice.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.dhat.cms4nw.newscontentservice.model.NewsContent;
import pl.dhat.cms4nw.newscontentservice.reposotory.NewsContentRepository;

@Service
public class NewsContentService {

    private final NewsContentRepository newsContentRepository;

    public NewsContentService(NewsContentRepository newsContentRepository) {
        this.newsContentRepository = newsContentRepository;
    }

    public Page<NewsContent> getNewsPage(Pageable pageable) {
        return newsContentRepository.findAll(pageable);
    }
}
