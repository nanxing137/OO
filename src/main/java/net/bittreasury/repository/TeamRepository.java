package net.bittreasury.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.bittreasury.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
