import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndependentProjectRepository extends JpaRepository<IndependentProject, Long> {
    // You can add custom query methods here if needed
}