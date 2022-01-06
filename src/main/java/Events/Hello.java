package Events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.BaseGuildMessageChannel;

import java.util.Locale;

public class Hello extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event){
        String message=event.getMessage().getContentRaw();
        String name=event.getMember().getUser().getName();
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase("Hello") || message.toLowerCase(Locale.ROOT).equalsIgnoreCase("Hi") || message.toLowerCase(Locale.ROOT).equalsIgnoreCase("Hey") || message.toLowerCase(Locale.ROOT).equalsIgnoreCase("Heya")){
            event.getChannel().sendMessage("Hello "+name+", I am the CSGO Lineup bot and I am here to help you.").queue();
        }

    }
}
