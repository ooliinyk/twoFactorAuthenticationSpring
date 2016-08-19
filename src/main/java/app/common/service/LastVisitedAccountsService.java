package app.common.service;

import app.common.entity.LastVisitedAccounts;

import java.util.List;

/**
 * Created by user on 18.08.2016.
 */
public interface LastVisitedAccountsService {

     List<LastVisitedAccounts> findAll();
}
