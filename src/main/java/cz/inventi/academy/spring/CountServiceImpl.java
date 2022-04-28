package cz.inventi.academy.spring;

/**
 * @see {@link CountService}
 */
// TODO: Write annotation for service
public class CountServiceImpl implements CountService {

    // TODO: Define messageService parameter and inject it via spring annotation @Autowired

    private int count;

    // TODO: Write annotation for post construct operation
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