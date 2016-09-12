package com.daoTest;

import app.common.dao.LastVisitedAccountsDao;
import app.common.dao.LastVisitedAccountsDaoImpl;
import app.common.dao.UserDao;
import app.common.entity.LastVisitedAccounts;
import com.AbstractTest;
import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by user on 17.08.2016.
 */


@Transactional
public class LastVisitedAccountsTest extends AbstractTest {
    @Autowired
    LastVisitedAccountsDao lastVisitedAccountsDao;

    @Autowired
    UserDao userDao;

//    @Test
    public void test() {

        List<LastVisitedAccounts> lastVisitedAccountses = lastVisitedAccountsDao.findAll();

        for (LastVisitedAccounts lastVisitedAccounts : lastVisitedAccountses) {
            System.out.println(lastVisitedAccounts.toString());

        }

        List<LastVisitedAccounts> list = lastVisitedAccountsDao.getAllByUserId(300102);
        System.out.println(list.toString());


    }

}
