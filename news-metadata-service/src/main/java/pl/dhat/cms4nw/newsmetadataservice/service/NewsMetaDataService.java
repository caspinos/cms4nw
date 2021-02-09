package pl.dhat.cms4nw.newsmetadataservice.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.dhat.cms4nw.newsmetadataservice.model.NewsMetaData;
import pl.dhat.cms4nw.newsmetadataservice.reposotory.NewsMetaDataRepository;

@Service
public class NewsMetaDataService {

    private final NewsMetaDataRepository newsMetaDataRepository;

    public NewsMetaDataService(NewsMetaDataRepository newsMetaDataRepository) {
        this.newsMetaDataRepository = newsMetaDataRepository;
    }

    public Page<NewsMetaData> getNewsPage(Pageable pageable) {
        return newsMetaDataRepository.findAll(pageable);
    }
}
