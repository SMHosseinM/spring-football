package hossein.springframework.repositories;

import hossein.springframework.model.Pitch;
import org.springframework.data.repository.CrudRepository;

public interface PitchRepository extends CrudRepository<Pitch, Long> {
}
