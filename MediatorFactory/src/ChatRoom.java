public abstract class ChatRoom {
	
	public abstract void register(Participant participant);
    public abstract void unregister(Participant participant);
    public abstract void send(String from, String to, String message);
	protected static void Participant(Participant participant) {

	}
	
    
}

