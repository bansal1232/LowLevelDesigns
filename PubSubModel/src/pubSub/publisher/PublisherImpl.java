package pubSub.publisher;


import pubSub.Message;
import pubSub.service.PubSubService;

public class PublisherImpl implements Publisher {
    //Publishes new message to PubSubService
    public void publish(Message message, PubSubService pubSubService) {
        pubSubService.addMessageToQueue(message);
    }
}