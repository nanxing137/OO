package net.bittreasury.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.bittreasury.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {

}
