package com.anmol.s_bookservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anmol.s_bookservice.dto.Library;
@Repository
public interface LIbraryRepository extends JpaRepository<Library, Integer> {

}
