package site.shamota.sarafan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.shamota.sarafan.domain.Comment;
import site.shamota.sarafan.domain.User;
import site.shamota.sarafan.domain.Views;
import site.shamota.sarafan.dto.EventType;
import site.shamota.sarafan.dto.ObjectType;
import site.shamota.sarafan.repo.CommentRepo;
import site.shamota.sarafan.util.WsSender;

import java.util.function.BiConsumer;

@Service
public class CommentService {
    private final CommentRepo commentRepo;
    private final BiConsumer<EventType, Comment> wsSender;

    @Autowired
    public CommentService(CommentRepo commentRepo, WsSender wsSender) {
        this.commentRepo = commentRepo;
        this.wsSender = wsSender.getSender(ObjectType.COMMENT, Views.FullComment.class);
    }

    public Comment create(Comment comment, User user) {
        comment.setAuthor(user);
        Comment commentFromDb = commentRepo.save(comment);

        wsSender.accept(EventType.CREATE, commentFromDb);

        return commentFromDb;
    }
}