import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tutorings")
public class TutoringController {

    @Autowired
    private TutoringRepository tutoringRepository;

    @GetMapping("/tutorings")
    public List<Tutoring> getAllTutorings() {
        return tutoringRepository.findAll();
    }

    @PostMapping("/tutorings")
    public Tutoring createTutoring(@RequestBody Tutoring tutoring) {
        return tutoringRepository.save(tutoring);
    }

    @GetMapping("/tutorings/{id}")
    public Tutoring getTutoringById(@PathVariable Long id) {
        return tutoringRepository.findById(id).orElse(null);
    }

    @PutMapping("/tutorings/{id}")
    public Tutoring updateTutoring(@PathVariable Long id, @RequestBody Tutoring tutoringDetails) {
        Tutoring tutoring = tutoringRepository.findById(id).orElse(null);

        tutoring.setTitle(tutoringDetails.getTitle());
        tutoring.setFrequencyOfEvent(tutoringDetails.getFrequencyOfEvent());
        tutoring.setDescription(tutoringDetails.getDescription());
        tutoring.setTimeline(tutoringDetails.getTimeline());

        return tutoringRepository.save(tutoring);
    }

    @DeleteMapping("/tutorings/{id}")
    public void deleteTutoring(@PathVariable Long id) {
        tutoringRepository.deleteById(id);
    }
}