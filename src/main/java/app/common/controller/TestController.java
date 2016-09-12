package app.common.controller;

import app.common.entity.LastVisitedAccounts;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//import javax.ws.rs.core.Response;

/**
 * Created by user on 30.08.2016.
 */


@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping(value = {"/posttt"}, method = RequestMethod.POST)
//    @Consumes("application/json")
    public @ResponseBody LastVisitedAccounts verifyCode( @RequestBody LastVisitedAccounts lastVisitedAccounts) {

        System.out.println("HHHHHHHHHH");
        System.out.println(lastVisitedAccounts.toString());

        return lastVisitedAccounts;
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setLocation(ServletUriComponentsBuilder
//                .fromCurrentRequest().path("/{id}")
//                .buildAndExpand(lastVisitedAccounts.getAccountID()).toUri());
//        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED)}).get();
//        return Response.status(200).entity(lastVisitedAccounts).build();
//        Respon  se.status(200).entity(result).build();
    }


    @RequestMapping(value = {"/postttt"}, method = RequestMethod.POST)
//    @Consumes("application/json")
    public     @ResponseBody void  verifyCodte( LastVisitedAccounts lastVisitedAccounts) {

        System.out.println("HHHHHHHHHH");
        System.out.println(lastVisitedAccounts.toString());

    }


    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public ResponseEntity<LastVisitedAccounts> updateUser(@RequestBody LastVisitedAccounts lastVisitedAccounts ) {
        System.out.println("Updating User " + lastVisitedAccounts);

//        User currentUser = userService.findById(id);
//
//        if (currentUser==null) {
//            System.out.println("User with id " + id + " not found");
//            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//        }

//        currentUser.setName(user.getName());
//        currentUser.setAge(user.getAge());
//        currentUser.setSalary(user.getSalary());
//
//        userService.updateUser(currentUser);
        return new ResponseEntity<LastVisitedAccounts>(lastVisitedAccounts, HttpStatus.OK);
    }
}
