import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumManagementRepository extends JpaRepository<ForumManagement, Long> {
}