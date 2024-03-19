package parameter.e;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class M {


    String userId;

    String orderId;


    Date date;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(String dateStr) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
        this.date = dateFormat.parse(dateStr);
    }

    @Override
    public String toString() {
        return "M{" +
                "userId='" + userId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", date=" + date +
                '}';
    }
}
