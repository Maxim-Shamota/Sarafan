package site.shamota.sarafan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import site.shamota.sarafan.domain.User;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
