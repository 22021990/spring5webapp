package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/*
At runtime Spring Data JPA is going to provide the implementation for us
and it will implement all methods from CrudRepository for us to work with!
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
