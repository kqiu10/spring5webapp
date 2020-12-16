package guru.springframework.spring5webapp.repositories;
/**
 * Date: 12/16/20
 * Question Description
 */

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
