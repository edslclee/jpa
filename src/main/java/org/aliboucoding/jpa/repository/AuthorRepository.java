package org.aliboucoding.jpa.repository;

import org.aliboucoding.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
