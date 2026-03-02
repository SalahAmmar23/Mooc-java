import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> message;


    public MessagingService() {
        this.message = new ArrayList<>();
    }

    public void add(Message add){
        if(add.getContent().length() <= 280){
            this.message.add(add);
        }
    }

    public ArrayList<Message> getMessages(){
        return this.message;
    }





}
