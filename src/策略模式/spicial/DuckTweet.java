package 策略模式.spicial;

/**
 * create by blackjack on 2019/6/11
 */
public class DuckTweet implements Tweet {
    @Override
    public void tweet() {
        System.out.println("嘎嘎的叫");
    }
}
