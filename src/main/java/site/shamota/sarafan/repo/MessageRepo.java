package site.shamota.sarafan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import site.shamota.sarafan.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
