
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message salah = new Message("Salah", "How are u today");
        MessagingService checking = new MessagingService();

        checking.add(salah);

        System.out.println(checking.getMessages());
    }
}