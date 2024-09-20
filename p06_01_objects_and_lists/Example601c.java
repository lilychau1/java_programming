package p06_01_objects_and_lists;

public class Example601c {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService(); 

        Message message1 = new Message("Sender A", "Hello World"); 

        String message2_content = "a".repeat(300); 
        Message message2 = new Message("Sender A", message2_content); 

        messagingService.add(message1);
        messagingService.add(message2);

        for (Message message:messagingService.getMessages()) {
            System.out.println(message);
        }

    }
}
