package discordbotinJava;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;


public class Dcbot {
	  public static JDA jda;
	  public static String prefix = "!";
	public static void main(String[] args) throws LoginException {
		  String TOKEN = "NzUxNzIzMDQ4NTExNDcxNjY3.X1NOpQ.iDdJtWTclIaXOGPTmQrTqWq3W74";
		  jda = new JDABuilder(AccountType.BOT).setToken(TOKEN).build();
		  jda.getPresence().setStatus(OnlineStatus.ONLINE);
		  jda.addEventListener(new Commands());





	  }
}
