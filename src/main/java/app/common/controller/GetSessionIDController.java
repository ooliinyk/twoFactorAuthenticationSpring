package app.common.controller;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Created by user on 21.08.2016.
 */

@Controller
@RequestMapping("/")
public class GetSessionIDController {



    @RequestMapping(value = "/login", produces = "text/plain")
    public String login() {
        System.out.println(" *** MainRestController.login");
        return "There is nothing special about login here, just use Authorization: Basic, or provide secure token.\n" +
                "For testing purposes you can use headers X-Username and X-Password instead of HTTP Basic Access Authentication.\n" +
                "THIS APPLIES TO ANY REQUEST protected by Spring Security (see filter-mapping).\n\n" +
                "Realize, please, that Authorization request (or the one with testing X-headers) must be POST, otherwise they are ignored.";
    }



    @RequestMapping(value = {"/getSessionID"}, method = RequestMethod.GET)

    public
    @ResponseBody
    String adsasd() {
//    public User test() {

        System.out.println("SessionId" + RequestContextHolder.currentRequestAttributes().getSessionId());
//
//        System.out.println("sss" + SecurityContextHolder.getContextHolderStrategy().getContext().getAuthentication());

        return RequestContextHolder.currentRequestAttributes().getSessionId();
    }


}
