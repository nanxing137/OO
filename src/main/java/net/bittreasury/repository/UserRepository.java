package net.bittreasury.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.bittreasury.entity.Team;
import net.bittreasury.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "select * from oo_user where uname=?1 and upassword=?2", nativeQuery = true)
	User getByLogin(String name, String password);
}
