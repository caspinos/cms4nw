package pl.dhat.cms4nw.newsmetadataservice.reposotory;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.dhat.cms4nw.newsmetadataservice.model.NewsMetaData;

@Repository
public interface NewsMetaDataRepository extends PagingAndSortingRepository<NewsMetaData, Long> {
}
