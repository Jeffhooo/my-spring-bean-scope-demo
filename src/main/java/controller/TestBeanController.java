package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestBeanController {
    @Autowired
    ApplicationContext applicationContext;

    @RequestMapping(value = "singleton.do", method = RequestMethod.GET)
    @ResponseBody
    String singleton() {
        return "singleton bean: " + applicationContext.getBean("singleton");
    }

    @RequestMapping(value = "prototype.do", method = RequestMethod.GET)
    @ResponseBody
    String prototype() {
        return "prototype bean: " + applicationContext.getBean("prototype");
    }

    @RequestMapping(value = "request.do", method = RequestMethod.GET)
    @ResponseBody
    String request() {
        return "request bean: " + applicationContext.getBean("request");
    }

    @RequestMapping(value = "session.do", method = RequestMethod.GET)
    @ResponseBody
    String session() {
        return "session bean: " + applicationContext.getBean("session");
    }

    @RequestMapping(value = "global-session.do", method = RequestMethod.GET)
    @ResponseBody
    String globalSession() {
        return "global session bean: " + applicationContext.getBean("global-session");
    }
}
