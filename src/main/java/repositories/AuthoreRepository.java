package repositories;

import domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthoreRepository extends CrudRepository<Author, Long> {
}
