package Events;

import Commands.Prefix;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.BaseGuildMessageChannel;

import java.util.Locale;

public class Lineups extends ListenerAdapter implements Prefix {
    public void onMessageReceived(MessageReceivedEvent event){
        String message=event.getMessage().getContentRaw();
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage")){
            event.getChannel().sendMessage("Just type the map name and number corresponding the lineup."+ "\n"+ "For example: Mirage 1" +"\n"+"1. CT Spawn to A Ramp"+"\n"+ "2. CT Spawn to A Ramp 2"+"\n"+"3. CT Spawn to Palace"+"\n"+"4. T Spawn to Mid Window"+"\n"+"5. Mirage A CT 1"+"\n"+"6. Mirage A CT 2"+"\n"+"7. Mirage A CT 3"+"\n"+"8. Mirage B Both Arches"+"\n"+"9. Mirage B Door for Aps"+"\n"+"10. Mirage B Window for Aps"+"\n"+"11. Mirage Bottom Mid Box to A Jungle"+"\n"+"12. Mirage High Mid to B Short"+"\n"+"13. Mirage T Spawn to A Connector"+"\n"+"14. Mirage T Spawn to Mid Window 2"+"\n"+"15. Mirage T Spawn to Mid Window 3"+"\n"+"16. Mirage T Spawn to Mid Window 4"+"\n"+"17. Mirage T Spawn to Mid Window 5"+"\n"+"18. Mirage T Spawn to Mid Window 6").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 1")) {
            event.getChannel().sendMessage("CT Spawn to A Ramp"+"\n"+"https://drive.google.com/file/d/113kEnZlesfXsdLxOtus73LeptEXBOmgg/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 2")) {
            event.getChannel().sendMessage("CT Spawn to A Ramp 2"+"\n"+"https://drive.google.com/file/d/14Z8QiTOG7XnkXudcu7MJE75C-uIBmjQd/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 3")) {
            event.getChannel().sendMessage("CT Spawn to Palace"+"\n"+"https://drive.google.com/file/d/1Y_VnXRxlMQfUn10LqiKB1YODVIl8yx8l/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 4")) {
            event.getChannel().sendMessage("T Spawn to Mid Window"+"\n"+"https://drive.google.com/file/d/12ndavF45aa_V-TQI-cZEGVaunc-sAuG-/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 5")) {
            event.getChannel().sendMessage("Mirage A CT 1"+"\n"+"https://drive.google.com/file/d/1EGjhICp-eWQc20fw5xBnghSfp-T8teg6/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 6")) {
            event.getChannel().sendMessage("Mirage A CT 2"+"\n"+"https://drive.google.com/file/d/1FepYGaS4ZG9yYr-sMg4b-C8p5EugTpjC/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 7")) {
            event.getChannel().sendMessage("Mirage A CT 3"+"\n"+"https://drive.google.com/file/d/1QY2y1oHx1eMITT6A61nqgu39iUQgIWWq/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 8")) {
            event.getChannel().sendMessage("Mirage B Both Arches"+"\n"+"https://drive.google.com/file/d/1_24XRLUyLEYyZaIajchXWf5tyDfR0mSu/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 9")) {
            event.getChannel().sendMessage("Mirage B Door for Aps"+"\n"+"https://drive.google.com/file/d/1Ncs-877nKwiSLi0J_NUl1b07NqelopgU/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 10")) {
            event.getChannel().sendMessage("Mirage B Window for Aps"+"\n"+"https://drive.google.com/file/d/1QbfSa-RXlP6RyBcqri2huaG70dDlipCe/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 11")) {
            event.getChannel().sendMessage("Mirage Bottom Mid Box to A Jungle"+"\n"+"https://drive.google.com/file/d/1T_YN7Kf5tTMpg4LwIaJsSCgMm2OSc-30/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 12")) {
            event.getChannel().sendMessage("Mirage High Mid to B Short"+"\n"+"https://drive.google.com/file/d/1LDUbdngM29ZpIV_S4vClw9BqOqYA6EKU/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 13")) {
            event.getChannel().sendMessage("Mirage T Spawn to A Connector"+"\n"+"https://drive.google.com/file/d/1ubmjrgYKe60h5iuTUN9A9ytl266RKTsX/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 14")) {
            event.getChannel().sendMessage("Mirage T Spawn to Mid Window 2"+"\n"+"https://drive.google.com/file/d/1ZXTdz2EkAmEF8qkv271z_aXWiwfIBDLt/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 15")) {
            event.getChannel().sendMessage("Mirage T Spawn to Mid Window 3"+"\n"+"https://drive.google.com/file/d/1CkUP4Snov7vsyRvV9D6Q1q9aJ9PikbRV/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 16")) {
            event.getChannel().sendMessage("Mirage T Spawn to Mid Window 4"+"\n"+"https://drive.google.com/file/d/1x4cX0l1KlCQlkHLGpJrO5r4aiNbi0rWI/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 17")) {
            event.getChannel().sendMessage("Mirage T Spawn to Mid Window 5"+"\n"+"https://drive.google.com/file/d/1Lzko9-d_sS5Gv4XSPYOwRP5b59kTU4yo/view?usp=sharing").queue();
        }
        if(message.toLowerCase(Locale.ROOT).equalsIgnoreCase(prefix+"mirage 18")) {
            event.getChannel().sendMessage("Mirage T Spawn to Mid Window 6"+"\n"+"https://drive.google.com/file/d/1Iv6KYxbB_d6idA44jPwQM_eNp2H42mvA/view?usp=sharing").queue();
        }
    }
}
