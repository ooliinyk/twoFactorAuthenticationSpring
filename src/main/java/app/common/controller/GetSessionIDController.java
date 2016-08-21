package app.common.controller;

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
