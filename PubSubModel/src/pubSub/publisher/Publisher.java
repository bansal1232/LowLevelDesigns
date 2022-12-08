package pubSub.publisher;

import pubSub.Message;
import pubSub.service.PubSubService;

public interface Publisher {
    void publish(Message message, PubSubService pubSubService);
}
