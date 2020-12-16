package repositories;
/**
 * Date: 12/16/20
 * Question Description
 */

import domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
