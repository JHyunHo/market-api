package sample.samplemarket.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.samplemarket.entity.member.Role;
import sample.samplemarket.entity.member.RoleType;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleType(RoleType roleType);
}
