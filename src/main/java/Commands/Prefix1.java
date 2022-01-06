package Commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.BaseGuildMessageChannel;

import java.util.Locale;

public class Prefix1 extends ListenerAdapter implements Prefix{

    public void onMessageReceived(MessageReceivedEvent event){
        String[] message=event.getMessage().getContentRaw().split(" ");
        if(message.length==2 && message[0].toLowerCase(Locale.ROOT).equalsIgnoreCase("Bot") && message[1].toLowerCase(Locale.ROOT).equalsIgnoreCase("prefix")){
            event.getChannel().sendMessage(String.valueOf(prefix)+ " is the Prefix.").queue();
        }
        /*else if(message.length==3 && message[0].toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"Prefix1")&& message[1].toLowerCase(Locale.ROOT).equalsIgnoreCase("set")){
            this.prefix=message[2];
        }*/

    }
}