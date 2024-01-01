package com.byron.children.repository;

import com.byron.children.entities.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ChildRepository extends JpaRepository<Child, String> {

    @Query("SELECT c FROM Child c WHERE c.name = :name")
    Optional<Child> findChildByName(String name);
}
