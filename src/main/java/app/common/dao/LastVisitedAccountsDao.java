package app.common.dao;

import app.common.entity.LastVisitedAccounts;

import java.util.List;

/**
 * Created by user on 17.08.2016.
 */
public interface LastVisitedAccountsDao {

     List<LastVisitedAccounts> findAll();
     LastVisitedAccounts findById(long id);
}
