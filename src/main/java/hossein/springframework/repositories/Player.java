package hossein.springframework.repositories;

import hossein.springframework.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface Player extends CrudRepository<Team, Long> {
}
