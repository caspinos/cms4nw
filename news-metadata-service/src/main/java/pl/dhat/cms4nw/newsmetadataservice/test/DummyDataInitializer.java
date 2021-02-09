package pl.dhat.cms4nw.newsmetadataservice.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.dhat.cms4nw.newsmetadataservice.model.NewsMetaData;
import pl.dhat.cms4nw.newsmetadataservice.reposotory.NewsMetaDataRepository;

import java.time.LocalDateTime;
import java.util.List;

@Component
@Profile("dummy-data")
public class DummyDataInitializer implements ApplicationRunner {

    private final NewsMetaDataRepository newsMetaDataRepository;

    public DummyDataInitializer(NewsMetaDataRepository newsMetaDataRepository) {
        this.newsMetaDataRepository = newsMetaDataRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        this.newsMetaDataRepository.saveAll(List.of(
                new NewsMetaData(null, "Election day in USA", LocalDateTime.of(2020,9,30,10,54)),
                new NewsMetaData(null, "Protests erupt in Poland", LocalDateTime.of(2020,10,20,11,11)),
                new NewsMetaData(null, "COVID-19 cases rise in EU", LocalDateTime.of(2020,11,1,8,0))
        ));
    }
}
