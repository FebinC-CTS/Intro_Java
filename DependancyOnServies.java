interface INotification{
    public void sendMessage();
}

class EmailService implements INotification{
    @Override
    public void sendMessage(){
        System.out.println("Sending the Email...");
    }
}

class WhatsappService implements INotification{
    @Override
    public void sendMessage(){
        System.out.println("Sending Whatsappp Message...");
    }
}

public class DependancyOnServies{
    public static void main(String args[]){
        INotification notify = new EmailService();
        notify.sendMessage();
        INotification notifyObj = new WhatsappService();
        notifyObj.sendMessage();
    }
}