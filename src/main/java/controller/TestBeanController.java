package controller;

import beans.GlobalSessionBean;
import beans.PrototypeBean;
import beans.RequestBean;
import beans.SessionBean;
import beans.SingletonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestBeanController {

    @Autowired
    RequestBean requestBean;
    @Autowired
    SingletonBean singletonBean;
    @Autowired
    PrototypeBean prototypeBean;
    @Autowired
    SessionBean sessionBean;
    @Autowired
    GlobalSessionBean globalSessionBean;

    @RequestMapping(value = "singleton.do", method = RequestMethod.GET)
    @ResponseBody
    String singleton() {
        return "singleton bean: " + singletonBean;
    }

    @RequestMapping(value = "prototype.do", method = RequestMethod.GET)
    @ResponseBody
    String prototype() {
        return "prototype bean: " + prototypeBean;
    }

    @RequestMapping(value = "request.do", method = RequestMethod.GET)
    @ResponseBody
    String request() {
        return "request bean: " + requestBean;
    }

    @RequestMapping(value = "session.do", method = RequestMethod.GET)
    @ResponseBody
    String session() {
        return "session bean: " + sessionBean;
    }

    @RequestMapping(value = "global-session.do", method = RequestMethod.GET)
    @ResponseBody
    String globalSession() {
        return "global session bean: " + globalSessionBean;
    }
}
