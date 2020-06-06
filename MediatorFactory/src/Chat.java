import java.util.HashMap;

public class Chat {
	
	private HashMap<String, Participant> participants = new HashMap<String, Participant>();
    private ParticipantFactory participantFactory;
    private Participant botSoftware;

    private void notifyParticipants() {
        participants.forEach((key, value) -> {
            value.receive(botSoftware.getName(), "'stupid' is a word not allowed here, "
            		+ "you are kick out of the chat " + key);
        });
    }

	public void register(Participant ivan) {
		
	}

	
}