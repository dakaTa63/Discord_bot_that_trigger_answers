package events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
public class reaction extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        String messageSent = event.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("your_trigger_message")) {
            event.getChannel().sendMessage("your_triggered_answer").queue();
        }


    }
}


