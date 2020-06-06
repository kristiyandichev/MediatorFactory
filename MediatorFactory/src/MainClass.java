
public class MainClass {

	public static void main(String[] args) {
		
		 Chat chatRoom = new Chat();

        ParticipantFactory participantFactory = new ParticipantFactory();
        Participant ivan = participantFactory.getParticipant("USER", "Ivan");
        Participant sasho = participantFactory.getParticipant("USER", "Sasho");
        Participant gosho = participantFactory.getParticipant("USER", "Georgi");

        chatRoom.register(ivan);
        chatRoom.register(sasho);
        chatRoom.register(gosho);

        
	}

}
	