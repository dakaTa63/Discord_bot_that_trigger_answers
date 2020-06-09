import events.reaction;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class javaBot {

    public static void main(String []args) throws Exception {

        JDA jda = new JDABuilder("your_bot_tag").build();

        jda.addEventListener(new reaction());

    }
}
