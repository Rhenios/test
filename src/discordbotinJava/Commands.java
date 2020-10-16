package discordbotinJava;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class Commands extends ListenerAdapter {
	private int kodai = 905000;
	private int kioku = 1790000;
	private int other = 0;
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(Dcbot.prefix + "hi")) {
            event.getChannel().sendMessage("im alive now.").queue();
        }


        if (args[0].equalsIgnoreCase(Dcbot.prefix + "help")) {

        	EmbedBuilder help = new EmbedBuilder();
        	help.setTitle("help rist");
        	help.setDescription("");
        	help.addField("123","456",true);
        	help.setColor(0x213214);
        	event.getChannel().sendMessage(help.build()).queue();
        	help.clear();

        }


        if (args[0].equalsIgnoreCase(Dcbot.prefix + "kodaikinsaku")) {
        	EmbedBuilder help = new EmbedBuilder();
        	help.setTitle("価格一覧");
        	help.setDescription("古代；"+String.valueOf(kodai) + "記憶：" + String.valueOf(kioku) + "そのた；" + String.valueOf(other));
        	event.getChannel().sendMessage(help.build()).queue();
        	help.clear();

        	float income = 0;
        	float kodaix = kodai * 1 ;
        	float kiokux = (float) (kioku * 0.65 * 1.3);
        	float otherx = other * 1;
        	income = (kiokux*5 + otherx - kodaix*5)/1000000;

        	EmbedBuilder kodaia = new EmbedBuilder();
        	kodaia.setTitle("古代の一回当たりの収入");
        	kodaia.setDescription(String.valueOf(income) + "M");
        	kodaia.addField("古代１時間当たりの収入",String.valueOf(income*41) + "M",true);
        	event.getChannel().sendMessage(kodaia.build()).queue();
        	kodaia.clear();

        }


        if (args[0].equalsIgnoreCase(Dcbot.prefix + "kodai")) {
        	int kodaiin = 0;
        	kodaiin = Integer.parseInt(args[1]);
        	kodai = kodaiin;
        	String kodaiS = String.valueOf(kodai);

        	EmbedBuilder kodai = new EmbedBuilder();
        	kodai.setTitle("古代の価格がいかに設定されました");
        	kodai.setDescription(kodaiS);
        	event.getChannel().sendMessage(kodai.build()).queue();
        	kodai.clear();
        	}


        if (args[0].equalsIgnoreCase(Dcbot.prefix + "kioku")) {
        	int kiokuin = 0;
        	kiokuin = Integer.parseInt(args[1]);
        	kioku = kiokuin;
        	String kiokuS = String.valueOf(kioku);

        	EmbedBuilder kioku = new EmbedBuilder();
        	kioku.setTitle("記憶の価格がいかに設定されました");
        	kioku.setDescription(kiokuS);
        	event.getChannel().sendMessage(kioku.build()).queue();
        	kioku.clear();
        	}


        if (args[0].equalsIgnoreCase(Dcbot.prefix + "other")) {
        	int otherin = 0;
        	otherin = Integer.parseInt(args[1]);
        	other = otherin;
        	String otherS = String.valueOf(other);

        	EmbedBuilder other = new EmbedBuilder();
        	other.setTitle("その他の価格がいかに設定されました");
        	other.setDescription(otherS);
        	event.getChannel().sendMessage(other.build()).queue();
        	other.clear();
        	}
        if (args[0].equalsIgnoreCase(Dcbot.prefix + "jk")) {


        	String myobj = "";
        	String eobj =  args[1];
        	boolean obj = true;
        	switch(eobj) {
        	case "グー" :
        		myobj = "パー";

        		break;
        	case "パー":
        		myobj = "チョキ";
        		break;
        	case "チョキ":
        		myobj = "グー";
        		break;
        	default:
        		obj = false;
        		break;
        	}
        	if(obj) {
        		EmbedBuilder jk = new EmbedBuilder();
                jk.setTitle("じゃんけん");
        		jk.setDescription("プレイヤーが選択したのは：" + eobj );
        		jk.addField("","nasusususuが選択したのは：" + myobj,false);
        		jk.addField("","nasusususuの勝利",false);
        		event.getChannel().sendMessage(jk.build()).queue();
        		jk.clear();
        	}else {
        		
        		EmbedBuilder jk = new EmbedBuilder();
        		jk.setTitle("じゃんけん");
        		jk.setDescription("正常な値を入力してください");
        		event.getChannel().sendMessage(jk.build()).queue();
        		jk.clear();
        	}
        	}
        if (args[0].equalsIgnoreCase(Dcbot.prefix + "jkhelp")) {
        	EmbedBuilder jk = new EmbedBuilder();
        	jk.setTitle("じゃんけん");
        	jk.setDescription("!jk ぐー　か　!jk パー　か　!jk チョキ　を入力してください");
    		event.getChannel().sendMessage(jk.build()).queue();
    		jk.clear();
        	
        	
        	
        }
        }
        
    }

