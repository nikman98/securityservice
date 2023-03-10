package in.ibm.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= "http://applicationfront.s3-website-ap-southeast-1.amazonaws.com/")
public class UserController {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String getEmployees() {
        return "Welcome!";
    }
    
}
