package app.common.controller;

import app.common.dao.LastVisitedAccountsDaoImpl;
import app.common.entity.LastVisitedAccounts;
import app.common.entity.User;
import app.common.service.LastVisitedAccountsService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * Created by user on 17.08.2016.
 */

@Controller
@RequestMapping("/lva")
public class LastVisitedAccountsController {

    @Autowired
    LastVisitedAccountsService lastVisitedAccountsService;


    @RequestMapping(value = {"/lva"} ,method = RequestMethod.GET)

    public @ResponseBody  Queue<Integer>  getShopInJSON() {
//    public User test() {

        System.out.println("sddd" +   RequestContextHolder.currentRequestAttributes().getSessionId());

        System.out.println("sss"+     SecurityContextHolder.getContextHolderStrategy().getContext());

        List<LastVisitedAccounts> lastVisitedAccountses = lastVisitedAccountsService.findAll();

        for(LastVisitedAccounts lastVisitedAccounts:lastVisitedAccountses){
            System.out.println(lastVisitedAccounts.toString());

        }


//        System.out.println(lastVisitedAccountses.toString());
//        String json = new Gson().toJson(lastVisitedAccountses);
//        System.out.println(json);

        Queue<Integer> queue = new ArrayDeque<Integer>();

        for (LastVisitedAccounts lastVisitedAccounts: lastVisitedAccountses){
            queue.add(lastVisitedAccounts.getAccountID());
        }

        return queue;
    }


    @RequestMapping(value = {"/lva1"} ,method = RequestMethod.GET)

    public @ResponseBody  String  adsasd() {
//    public User test() {

        System.out.println("sddd" +   RequestContextHolder.currentRequestAttributes().getSessionId());

        System.out.println("sss"+     SecurityContextHolder.getContextHolderStrategy().getContext());

//        List<LastVisitedAccounts> lastVisitedAccountses = lastVisitedAccountsService.findAll();
//
//        for(LastVisitedAccounts lastVisitedAccounts:lastVisitedAccountses){
//            System.out.println(lastVisitedAccounts.toString());
//
//        }
//
//
////        System.out.println(lastVisitedAccountses.toString());
////        String json = new Gson().toJson(lastVisitedAccountses);
////        System.out.println(json);
//
//        Queue<Integer> queue = new ArrayDeque<Integer>();
//
//        for (LastVisitedAccounts lastVisitedAccounts: lastVisitedAccountses){
//            queue.add(lastVisitedAccounts.getAccountID());
//        }

        return RequestContextHolder.currentRequestAttributes().getSessionId();
    }

    @RequestMapping(value = {"/lva2"} ,method = RequestMethod.GET)

    public @ResponseBody  String  dd() {
//    public User test() {

        System.out.println("sddd" +   RequestContextHolder.currentRequestAttributes().getSessionId());

        System.out.println("sss"+     SecurityContextHolder.getContextHolderStrategy().getContext());

//        List<LastVisitedAccounts> lastVisitedAccountses = lastVisitedAccountsService.findAll();
//
//        for(LastVisitedAccounts lastVisitedAccounts:lastVisitedAccountses){
//            System.out.println(lastVisitedAccounts.toString());
//
//        }
//
//
////        System.out.println(lastVisitedAccountses.toString());
////        String json = new Gson().toJson(lastVisitedAccountses);
////        System.out.println(json);
//
//        Queue<Integer> queue = new ArrayDeque<Integer>();
//
//        for (LastVisitedAccounts lastVisitedAccounts: lastVisitedAccountses){
//            queue.add(lastVisitedAccounts.getAccountID());
//        }

        return RequestContextHolder.currentRequestAttributes().getSessionId();
    }

}
