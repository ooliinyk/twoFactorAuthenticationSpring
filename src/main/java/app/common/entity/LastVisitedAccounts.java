package app.common.entity;


import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "last_visited_accounts")
public class LastVisitedAccounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "last_visited_accounts_id")
    private long lastVisitedAccountsID;
    @Column(name = "user_id")
    private int userID;
    @Column(name = "account_id")
    private int accountID;
    @Column(name = "order")
    private int order;

    @Column(name = "date")
    private Date date;
    @Column(name = "time")
    private Date time;


    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
//

    public long getLastVisitedAccountsID() {
        return lastVisitedAccountsID;
    }

    public void setLastVisitedAccountsID(long lastVisitedAccountsID) {
        this.lastVisitedAccountsID = lastVisitedAccountsID;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "LastVisitedAccounts{" +
                "lastVisitedAccountsID=" + lastVisitedAccountsID +
                ", userID=" + userID +
                ", accountID=" + accountID +
                ", order=" + order +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
