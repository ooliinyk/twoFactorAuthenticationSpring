package app.common.service;

import app.common.dao.LastVisitedAccountsDao;
import app.common.entity.LastVisitedAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by user on 18.08.2016.
 */

@PreAuthorize("hasRole('AA')")
@Service("LastVisitedAccountsService")
@Transactional
public class LastVisitedAccountsServiceImpl implements LastVisitedAccountsService {

    @Autowired
    LastVisitedAccountsDao dao;

    public List<LastVisitedAccounts> findAll() {
        return dao.findAll();
    }

    @Override
    public List<LastVisitedAccounts> getAllByUserId(long user_id) {
        return dao.getAllByUserId(user_id);
    }

    public List<Integer> getDistinctByUserId(long user_id){

        return dao.getDistinctByUserId(user_id);
    }


}
