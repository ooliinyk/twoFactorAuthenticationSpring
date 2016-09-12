package app.common.dao;

import app.common.entity.LastVisitedAccounts;

import java.util.List;

/**
 * Created by user on 17.08.2016.
 */
public interface LastVisitedAccountsDao {

    void save(LastVisitedAccounts user);


    List<LastVisitedAccounts> findAll();

    LastVisitedAccounts findById(long id);

    public List<LastVisitedAccounts> getAllByUserId(long user_id);

    public List<Integer> getDistinctByUserId(long user_id);
}
