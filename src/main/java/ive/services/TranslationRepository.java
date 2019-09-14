package ive.services;

import ive.entity.Translation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TranslationRepository extends PagingAndSortingRepository<Translation, Long> {
    List<Translation> getAllByLanguageName(String languageName);
}
