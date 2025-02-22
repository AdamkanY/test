import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
@RestController
@RequestMapping(path = "/buddysystem")
public class BuddySystemController {

    @PostMapping(path = "/api/buddy/volunteer",consumes = "application/json",produces = "application/json")
    public ResponseEntity<BuddySystem> createBuddySystem(@RequestBody BuddySystem buddySystem) {
        BuddySystem savedBuddySystem = buddySystemRepository.save(buddySystem);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBuddySystem);
}
    @GetMapping(path = "/api/buddy/match?language={language}",produces = "application/json")
    public ResponseEntity<List<BuddySystem>> getAllBuddySystems(@RequestParam(name = "language") String language) {
        List<BuddySystem> buddySystems = buddySystemRepository.findByLanguage(language);
        return ResponseEntity.ok(buddySystems);
    }
    @PostMapping(value = "/api/admin/buddy/assign",consumes = "application/json",produces = "application/json")
    public ResponseEntity<String> assignBuddyToInternationalStudent(@RequestBody BuddyAssignmentRequest request) {
        boolean assignmentSuccessful = buddyAssignmentService.assignBuddy(request.getInternationalStudentId(), request.getBuddyId());
        if (assignmentSuccessful) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Buddy assigned successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to assign buddy.");
    }
}