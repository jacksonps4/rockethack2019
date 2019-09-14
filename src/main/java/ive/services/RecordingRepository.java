package ive.services;

import ive.entity.Recording;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordingRepository extends PagingAndSortingRepository<Recording, Long> {
    List<Recording> getAllByTagsContaining(String tag);
}
