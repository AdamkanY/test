import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuddySystemRepository extends JpaRepository<BuddySystem, Long> {
    List<BuddySystem> findByLanguage(String language);
    // You can add custom query methods here if needed
}