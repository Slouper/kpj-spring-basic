package cz.inventi.academy.spring;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * @see CountService
 */
public class CountServiceImpl implements CountService {

    @Autowired
    CountServiceImpl countService;

    @Autowired
    MessageService messageService;


    private int count;

    @PostConstruct
    public void init() {
        setCount(10);
    }

    public void printMessage() {
        for (int i = 0; i < count; i++) {
            System.out.println(i + " : " + messageService.getMessage());
        }
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}