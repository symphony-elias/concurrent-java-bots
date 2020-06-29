import clients.SymBotClient;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestReplyBot {
    private static final Logger log = LoggerFactory.getLogger(RequestReplyBot.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        new Thread(() -> runBot("config.json")).start();
        new Thread(() -> runBot("config_bis.json")).start();
    }

    private static void runBot(String configFilePath) {
        try {
            SymBotClient botClient = SymBotClient.initBotRsa(configFilePath);
            botClient.getDatafeedEventsService().addListeners(
                    new IMListenerImpl(botClient),
                    new RoomListenerImpl(botClient)
            );
        } catch (Exception e) {
            log.error("Error", e);
        }
    }
}
