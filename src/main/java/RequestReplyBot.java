import clients.SymBotClient;
import listeners.FirehoseListener;
import model.InboundMessage;
import model.OutboundMessage;
import model.Stream;
import model.User;
import model.events.*;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestReplyBot {
    private static final Logger log = LoggerFactory.getLogger(RequestReplyBot.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        runOneBot();
    }

    private static void runOneBot() {
        try {
            SymBotClient botClient = SymBotClient.initBot("config.json");
            botClient.getMessagesClient().sendMessage("gXFV8vN37dNqjojYS_y2wX___o2KxfmUdA", new OutboundMessage("Hello!"));
//            botClient.getFirehoseService().addListener(new FirehoseListener() {
//                @Override
//                public void onRoomMessage(InboundMessage inboundMessage) {
//                    log.debug("Message received: {}", inboundMessage.getMessage());
//                }
//
//                @Override
//                public void onRoomCreated(RoomCreated roomCreated) {
//
//                }
//
//                @Override
//                public void onRoomDeactivated(RoomDeactivated roomDeactivated) {
//
//                }
//
//                @Override
//                public void onRoomMemberDemotedFromOwner(RoomMemberDemotedFromOwner roomMemberDemotedFromOwner) {
//
//                }
//
//                @Override
//                public void onRoomMemberPromotedToOwner(RoomMemberPromotedToOwner roomMemberPromotedToOwner) {
//
//                }
//
//                @Override
//                public void onRoomReactivated(Stream stream) {
//
//                }
//
//                @Override
//                public void onRoomUpdated(RoomUpdated roomUpdated) {
//
//                }
//
//                @Override
//                public void onUserJoinedRoom(UserJoinedRoom userJoinedRoom) {
//
//                }
//
//                @Override
//                public void onUserLeftRoom(UserLeftRoom userLeftRoom) {
//
//                }
//
//                @Override
//                public void onIMMessage(InboundMessage inboundMessage) {
//
//                }
//
//                @Override
//                public void onIMCreated(Stream stream) {
//
//                }
//
//                @Override
//                public void onConnectionAccepted(User user) {
//
//                }
//
//                @Override
//                public void onConnectionRequested(User user) {
//
//                }
//            });
//            botClient.getDatafeedEventsService().addListeners(
//                    new IMListenerImpl(botClient),
//                    new RoomListenerImpl(botClient)
//            );
        } catch (Exception e) {
            log.error("Error", e);
        }
    }

}
