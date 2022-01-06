package Commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.BaseGuildMessageChannel;

import java.util.Locale;

public class BrotherMan extends ListenerAdapter implements Prefix{
    public void onMessageReceived(MessageReceivedEvent event){
        String message=event.getMessage().getContentRaw();
        String name=event.getMember().getUser().getName();
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"brother")){
            event.getChannel().sendMessage("Brother Maaaaaaaaaan").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"Cyka Blyat")){
            event.getChannel().sendMessage("Cyka Blyat, Rush B!").queue();
        }

    }
}