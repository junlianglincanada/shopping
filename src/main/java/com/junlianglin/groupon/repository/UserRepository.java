package com.junlianglin.groupon.repository;

import com.junlianglin.groupon.domain.User;
import com.junlianglin.groupon.support.AbstractRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends AbstractRepository<User> {
	 User findByEmail(String email);
}
