package com.example.demo2.repository;

import com.example.demo2.model.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository

public interface IWardRepository extends JpaRepository<Ward, UUID> {
}
