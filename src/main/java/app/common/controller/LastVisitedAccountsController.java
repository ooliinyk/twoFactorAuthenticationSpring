package app.common.controller;

import app.common.dao.LastVisitedAccountsDaoImpl;
import app.common.entity.LastVisitedAccounts;
import app.common.entity.User;
import app.common.service.LastVisitedAccountsService;
import app.common.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    @Autowired
    UserService userService;


    @RequestMapping(value = {"/lva"}, method = RequestMethod.GET)
    public
    @ResponseBody
    Queue<Integer> getShopInJSON() {


        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        List<Integer> lastVisitedAccountses = lastVisitedAccountsService.getDistinctByUserId(userService.findByLogin(auth.getName()).getId());

        System.out.println(lastVisitedAccountses.toString());
        Queue<Integer> queue = new ArrayDeque<Integer>(lastVisitedAccountses);

        return queue;
    }


    @RequestMapping(value = {"/lva1"}, method = RequestMethod.GET)
    public
    @ResponseBody
    Queue<Integer> getShopInJSON1() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        List<LastVisitedAccounts> lastVisitedAccountses = lastVisitedAccountsService.getAllByUserId(userService.findByLogin(auth.getName()).getId());


        Queue<Integer> queue = new ArrayDeque<Integer>();

        for (LastVisitedAccounts lastVisitedAccounts : lastVisitedAccountses) {
            queue.add(lastVisitedAccounts.getAccountID());
        }

        return queue;
    }

    @RequestMapping(value = {"/lva2"}, method = RequestMethod.GET)
    public
    @ResponseBody
    List<LastVisitedAccounts> getShopInJSON11() {

//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        List<LastVisitedAccounts> lastVisitedAccountses = lastVisitedAccountsService.getAllByUserId(userService.findByLogin("user2").getId());


        return lastVisitedAccountses;
    }


    @RequestMapping(value = {"/post"}, method = RequestMethod.POST)
//    @Consumes("application/json")
    public     @ResponseBody  LastVisitedAccounts verifyCode( @RequestBody LastVisitedAccounts lastVisitedAccounts) {

        System.out.println(lastVisitedAccounts.toString());

        return lastVisitedAccounts;
    }
//    @POST
//    @Path("/post")
//    @Consumes("application/json")
//    public Response createProductInJSON(Product product) {
//
//        String result = "Product created : " + product;
//        return Response.status(201).entity(result).build();
//
//    }

}
