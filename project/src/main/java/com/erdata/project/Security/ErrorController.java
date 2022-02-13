package com.erdata.project.Security;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/login-error")
    public String login(Model model) {
        String errorMessage = "Unable to login. Check your username and password.";
        model.addAttribute("errorMessage", errorMessage);
        return "login";
    }
    @GetMapping("/accessdenied")
    public String access(Model model, @AuthenticationPrincipal User user) {
        String errorMessage = "Sorry, you do not have permission to view this page.";
        model.addAttribute("errorMessage", errorMessage);
        if(!(user == null)){
            model.addAttribute("currentUser", user);
        }
        return "accessdenied";
    }
}
