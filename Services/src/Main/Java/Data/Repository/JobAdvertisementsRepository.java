import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobAdvertisementsRepository extends JpaRepository<JobAdvertisements, Long> {
}