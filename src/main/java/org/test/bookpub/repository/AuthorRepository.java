package org.test.bookpub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.bookpub.entity.Author;

/**
 * Created by willson on 7/12/17.
 */
@RepositoryRestResource
public interface AuthorRepository
        extends JpaRepository<Author, Long> {
}


