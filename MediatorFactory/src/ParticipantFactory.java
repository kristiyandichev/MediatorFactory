
public class ParticipantFactory {
	
	public Participant getParticipant(String participantType, String participantName) {
		
        if(participantType == null) {
            return null;
        }

        if(participantType.equalsIgnoreCase("USER")) {
            return new Participant(participantName);
        }

        if(participantType.equalsIgnoreCase("BOT")) {
            return new Participant(participantName);
        }

        return null;

	}
}
