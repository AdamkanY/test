import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerAsBuddyRepository extends JpaRepository<VolunteerAsBuddy, Long> {
}