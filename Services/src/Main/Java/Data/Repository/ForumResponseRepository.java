import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumResponseRepository extends JpaRepository<ForumResponse, Long> {
    // You can add custom query methods here if needed
}