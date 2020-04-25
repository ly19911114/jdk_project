package chapter6;

/**
 * @author LiuYang
 * @date 2020/4/23
 */
public class VideoOrder {
    private String tradeNo;
    private int money;
    private String title;
    public VideoOrder(String tradeNo,String title, int money ){
        this.tradeNo = tradeNo;
        this.title = title;
        this.money = money;
    }
    public String getTradeNo() {
        return tradeNo;
    }
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VideoOrder){
            return this.title.equals(((VideoOrder) obj).title);
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return this.title.hashCode();
    }

    @Override
    public String toString() {
        return "VideoOrder{" +
                "title='" + title + '\'' +
                '}';
    }
}
