import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/forummanagement")
public class ForumManagementController {

    @Autowired
    private ForumManagementRepository forumManagementRepository;

    @GetMapping
    public List<ForumManagement> getAllForumPosts() {
        return forumManagementRepository.findAll();
    }

    @PostMapping
    public ForumManagement createForumPost(@RequestBody ForumManagement forumPost) {
        return forumManagementRepository.save(forumPost);
    }

    @GetMapping("/{id}")
    public ForumManagement getForumPostById(@PathVariable Long id) {
        return forumManagementRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public ForumManagement updateForumPost(@PathVariable Long id, @RequestBody ForumManagement forumPostDetails) {
        ForumManagement forumPost = forumManagementRepository.findById(id).orElse(null);

        if (forumPost != null) {
            forumPost.setForumPost(forumPostDetails.getForumPost());

            return forumManagementRepository.save(forumPost);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteForumPost(@PathVariable Long id) {
        forumManagementRepository.deleteById(id);
    }
}
