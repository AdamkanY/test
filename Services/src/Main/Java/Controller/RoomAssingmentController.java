import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/roomAssignments")
public class RoomAssignmentController {

    @Autowired
    private RoomAssignmentRepository roomAssignmentRepository;

    @GetMapping("/roomAssignments")
    public List<RoomAssignment> getAllRoomAssignments() {
        return roomAssignmentRepository.findAll();
    }

    @PostMapping("/roomAssignments")
    public RoomAssignment createRoomAssignment(@RequestBody RoomAssignment roomAssignment) {
        return roomAssignmentRepository.save(roomAssignment);
    }

    @GetMapping("/roomAssignments/{id}")
    public RoomAssignment getRoomAssignmentById(@PathVariable Long id) {
        return roomAssignmentRepository.findById(id).orElse(null);
    }

    @PutMapping("/roomAssignments/{id}")
    public RoomAssignment updateRoomAssignment(@PathVariable Long id, @RequestBody RoomAssignment roomAssignmentDetails) {
        RoomAssignment roomAssignment = roomAssignmentRepository.findById(id).orElse(null);

        roomAssignment.setFrequencyOfEvent(roomAssignmentDetails.getFrequencyOfEvent());
        roomAssignment.setTimeline(roomAssignmentDetails.getTimeline());

        return roomAssignmentRepository.save(roomAssignment);
    }

    @DeleteMapping("/roomAssignments/{id}")
    public void deleteRoomAssignment(@PathVariable Long id) {
        roomAssignmentRepository.deleteById(id);
    }
}