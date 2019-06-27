package hossein.springframework.repositories;

import hossein.springframework.model.Coach;
import org.springframework.data.repository.CrudRepository;

public interface CoachRepository extends CrudRepository<Coach, Long> {
}
