import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/mentoring")
public class MentoringController {

    @Autowired
    private MentoringRepository mentoringRepository;

    @GetMapping
    public List<Mentoring> getAllMentorings() {
        return mentoringRepository.findAll();
    }

    @PostMapping
    public Mentoring createMentoring(@RequestBody Mentoring mentoring) {
        return mentoringRepository.save(mentoring);
    }

    @GetMapping("/{id}")
    public Mentoring getMentoringById(@PathVariable Long id) {
        return mentoringRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Mentoring updateMentoring(@PathVariable Long id, @RequestBody Mentoring mentoringDetails) {
        Mentoring mentoring = mentoringRepository.findById(id).orElse(null);

        if (mentoring != null) {
            mentoring.setTitle(mentoringDetails.getTitle());
            mentoring.setFrequencyOfEvent(mentoringDetails.getFrequencyOfEvent());
            mentoring.setDescription(mentoringDetails.getDescription());
            mentoring.setTimeline(mentoringDetails.getTimeline());

            return mentoringRepository.save(mentoring);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteMentoring(@PathVariable Long id) {
        mentoringRepository.deleteById(id);
    }
}
