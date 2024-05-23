import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteerAsBuddies")
public class VolunteerAsBuddyController {

    @Autowired
    private VolunteerAsBuddyRepository volunteerAsBuddyRepository;

    @GetMapping("/volunteerAsBuddies")
    public List<VolunteerAsBuddy> getAllVolunteerAsBuddies() {
        return volunteerAsBuddyRepository.findAll();
    }

    @PostMapping("/volunteerAsBuddies")
    public VolunteerAsBuddy createVolunteerAsBuddy(@RequestBody VolunteerAsBuddy volunteerAsBuddy) {
        return volunteerAsBuddyRepository.save(volunteerAsBuddy);
    }

    @GetMapping("/volunteerAsBuddies/{id}")
    public VolunteerAsBuddy getVolunteerAsBuddyById(@PathVariable Long id) {
        return volunteerAsBuddyRepository.findById(id).orElse(null);
    }

    @PutMapping("/volunteerAsBuddies/{id}")
    public VolunteerAsBuddy updateVolunteerAsBuddy(@PathVariable Long id, @RequestBody VolunteerAsBuddy volunteerAsBuddyDetails) {
        VolunteerAsBuddy volunteerAsBuddy = volunteerAsBuddyRepository.findById(id).orElse(null);

        volunteerAsBuddy.setLanguage(volunteerAsBuddyDetails.getLanguage());

        return volunteerAsBuddyRepository.save(volunteerAsBuddy);
    }

    @DeleteMapping("/volunteerAsBuddies/{id}")
    public void deleteVolunteerAsBuddy(@PathVariable Long id) {
        volunteerAsBuddyRepository.deleteById(id);
    }
}