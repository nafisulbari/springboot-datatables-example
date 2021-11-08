package com.nafisulbari.datatable.person;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author Ahmed Nafisul Bari
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Page<Person> findAll(Pageable pageable);

    @Query("SELECT p FROM Person p " +
            "WHERE (LOWER(p.id) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.name) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.address) LIKE LOWER(CONCAT('%',:searchTerm, '%')))")
    Page<Person> getPagedData_jpql(@Param("searchTerm") String searchTerm, Pageable pageable);

    @Query(value = "SELECT * FROM PERSON_TABLE " +
            "WHERE (LOWER(ID) LIKE LOWER(CONCAT('%', :searchTerm, '%')) " +
            "OR LOWER(NAME) LIKE LOWER(CONCAT('%', :searchTerm, '%')) " +
            "OR LOWER(ADDRESS) LIKE LOWER(CONCAT('%', :searchTerm, '%')))",
            nativeQuery = true)
    Page<Person> getPagedData_native(@Param("searchTerm") String searchTerm, Pageable pageable);
}
