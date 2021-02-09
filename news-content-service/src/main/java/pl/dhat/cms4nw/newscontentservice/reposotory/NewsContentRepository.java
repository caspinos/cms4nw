package pl.dhat.cms4nw.newscontentservice.reposotory;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.dhat.cms4nw.newscontentservice.model.NewsContent;

@Repository
public interface NewsContentRepository extends PagingAndSortingRepository<NewsContent, Long> {
}
