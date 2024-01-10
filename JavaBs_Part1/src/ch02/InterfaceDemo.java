package JavaBs_Part1.src.ch02;

/**
 * IMessage 定義一個 Interface
 */
interface IMessage {
    public static final String INFO = "default INFO ";// 全局常量

    public abstract String getInfo();// 抽象方法
}

/**
 * Ichannel
 */
interface Ichannel {
    public abstract boolean connect();

}

/**
 * MessageImple
 */
class MessageImple implements IMessage, Ichannel {

    @Override // "覆寫Interface的抽象方法"
    public String getInfo() {
        if (connect()) {
            return "IAN 好帥";
        } else {
            return "connect error";
        }
    }

    @Override
    public boolean connect() {
        System.out.println("connect successfully ... ");
        return true;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        IMessage msg = new MessageImple();
        Ichannel cahl =(Ichannel) msg;
        System.out.println(cahl.connect());
        
        // System.out.println(msg.getInfo());
        // System.out.println(msg.INFO); // 直接輸出變數

    }

}