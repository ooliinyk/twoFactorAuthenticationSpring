package app.common.service;

import app.common.dao.LastVisitedAccountsDao;
import app.common.entity.LastVisitedAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by user on 18.08.2016.
 */


@Service("LastVisitedAccountsService")
@Transactional
public class LastVisitedAccountsServiceImpl implements LastVisitedAccountsService {

    @Autowired
    LastVisitedAccountsDao dao;

    public List<LastVisitedAccounts> findAll() {
        return dao.findAll();
    }



}
