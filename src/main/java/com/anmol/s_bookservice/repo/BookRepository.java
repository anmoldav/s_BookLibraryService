package com.anmol.s_bookservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anmol.s_bookservice.dto.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
