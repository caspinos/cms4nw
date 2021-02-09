package pl.dhat.cms4nw.newsmetadataservice.api.v1;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dhat.cms4nw.newsmetadataservice.model.NewsMetaData;
import pl.dhat.cms4nw.newsmetadataservice.service.NewsMetaDataService;

@RestController
@RequestMapping("/api/v1/newsMetaData")
public class NewsMetaDataController {

    private final NewsMetaDataService newsMetaDataService;

    public NewsMetaDataController(NewsMetaDataService newsMetaDataService) {
        this.newsMetaDataService = newsMetaDataService;
    }

    @GetMapping("/")
    public Page<NewsMetaData> getNewsPage(
            Pageable pageable) {
        return this.newsMetaDataService.getNewsPage(pageable);
    }
}