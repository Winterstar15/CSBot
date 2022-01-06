package Commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.BaseGuildMessageChannel;

import java.util.Locale;

public class Calculate extends ListenerAdapter implements Prefix {
    public void onMessageReceived(MessageReceivedEvent event) throws NumberFormatException{
        String[] message=event.getMessage().getContentRaw().split(" ");
        String name=event.getMember().getUser().getName();
        if((message[0].equalsIgnoreCase(prefix+"add")||message[0].equalsIgnoreCase("add")||message[0].equalsIgnoreCase(prefix+"sub")||message[0].equalsIgnoreCase("sub")) && (message.length==0 || message
                .length==1)){

            event.getChannel().sendMessage("Type "+prefix+"(add/sub/mul/div) num1 num2").queue();
        }
        else if((message[0].equalsIgnoreCase(prefix+"mul")||message[0].equalsIgnoreCase("mul")||message[0].equalsIgnoreCase(prefix+"div")||message[0].equalsIgnoreCase("div")) && (message.length==0 || message.length==1)){
            event.getChannel().sendMessage("Type "+prefix+"(add/sub/mul/div) num1 num2").queue();
        }


        if(message[0].equalsIgnoreCase(prefix+"add")){
            double n1=Double.parseDouble(message[1]);
            double n2=Double.parseDouble(message[2]);
            event.getChannel().sendMessage("Result: "+ (n1+n2)).queue();
        }
        else if(message[0].equalsIgnoreCase(prefix+"sub")){
            double n1=Double.parseDouble(message[1]);
            double n2=Double.parseDouble(message[2]);
            event.getChannel().sendMessage("Result: "+ (n1-n2)).queue();
        }
        else if(message[0].equalsIgnoreCase(prefix+"mul")){
            double n1=Double.parseDouble(message[1]);
            double n2=Double.parseDouble(message[2]);
            event.getChannel().sendMessage("Result: "+ (n1*n2)).queue();
        }
        else if(message[0].equalsIgnoreCase(prefix+"div")){
            double n1=Double.parseDouble(message[1]);
            double n2=Double.parseDouble(message[2]);
            event.getChannel().sendMessage("Result: "+ (n1/n2)).queue();
        }

    }
}