@Component
public class WebhookHandler {

    private static final Logger logger = LoggerFactory.getLogger(WebhookHandler.class);

    @PostMapping("/webhook")
    public void handleWebhookEvent(@RequestBody String payload) {
        logger.info("Received webhook event: {}", payload);
    }
}
