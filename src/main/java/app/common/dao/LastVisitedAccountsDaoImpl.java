package app.common.dao;

import app.common.entity.LastVisitedAccounts;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by user on 17.08.2016.
 */

@Repository("LastVisitedAccountsDao")
public class LastVisitedAccountsDaoImpl extends AbstractDao<Long, LastVisitedAccounts> implements LastVisitedAccountsDao {


    public void save(LastVisitedAccounts lastVisitedAccounts) {
        persist(lastVisitedAccounts);
    }

    public List<LastVisitedAccounts> findAll() {
        Criteria criteria = createEntityCriteria();
        criteria.addOrder(Order.asc("lastVisitedAccountsID"));
        return (List<LastVisitedAccounts>) criteria.list();
    }


    public List<LastVisitedAccounts> getAllByUserId(long user_id) {
        Criteria criteria = createEntityCriteria();


        criteria.addOrder(Order.desc("date"));

        criteria.add(Restrictions.and(Restrictions.eq("userID", user_id)));

        return (List<LastVisitedAccounts>) criteria.list();
    }


    public List<Integer> getDistinctByUserId(long user_id) {
        Criteria criteria = createEntityCriteria();


        criteria.addOrder(Order.desc("date"));
        criteria.setProjection(Projections.distinct(Projections.property("accountID")));

        criteria.add(Restrictions.and(Restrictions.eq("userID", user_id)));

        return (List<Integer>) criteria.list();
    }

    public LastVisitedAccounts findById(long id) {
        return getByKey(id);
    }
}
