package app.common.dao;

import app.common.entity.LastVisitedAccounts;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Queue;

/**
 * Created by user on 17.08.2016.
 */

@Repository("LastVisitedAccountsDao")
public class LastVisitedAccountsDaoImpl extends AbstractDao<Long, LastVisitedAccounts> implements LastVisitedAccountsDao {


    public List<LastVisitedAccounts> findAll() {
        Criteria criteria = createEntityCriteria();
        criteria.addOrder(Order.asc("lastVisitedAccountsID"));
        return (List<LastVisitedAccounts>)criteria.list();
    }
    public LastVisitedAccounts findById(long id) {
        return getByKey(id);
    }
}
