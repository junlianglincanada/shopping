package com.junlianglin.groupon.repository;

import com.junlianglin.groupon.domain.Role;
import com.junlianglin.groupon.support.AbstractRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
public interface RoleRepository extends AbstractRepository<Role> {
	Role findByRole(String role);

}
