package app.common.service;

import app.common.entity.LastVisitedAccounts;

import java.util.List;

/**
 * Created by user on 18.08.2016.
 */
public interface LastVisitedAccountsService {

    List<LastVisitedAccounts> findAll();

    List<LastVisitedAccounts> getAllByUserId(long user_id);

    List<Integer> getDistinctByUserId(long user_id);
}
