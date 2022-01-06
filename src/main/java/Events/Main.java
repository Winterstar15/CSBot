package Events;

import Commands.BrotherMan;
import Commands.Calculate;
import Commands.Prefix1;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;


public class Main {
    public static void  main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("OTI4MTcxNzI1MzU3NzQ0MjA4.YdU5Rw.kk1hTZKfdvV_PPwdUV1BpBXmq18").build();
        jda.addEventListener(new Hello());
        jda.addEventListener(new Lineups());
        jda.addEventListener(new BrotherMan());
        jda.addEventListener(new Calculate());
        jda.addEventListener(new Prefix1());

    }
}
