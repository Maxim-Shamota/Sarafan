package site.shamota.sarafan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import site.shamota.sarafan.domain.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long> {
}
