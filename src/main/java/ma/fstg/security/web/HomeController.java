package ma.fstg.security.web;

import org.springframework.stereotype.Controller; // Import corrigé !
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/user/dashboard")
    @ResponseBody
    public String userDashboard() {
        return "Espace utilisateur - accessible aux rôles USER et ADMIN.";
    }

    @GetMapping("/admin/dashboard")
    @ResponseBody
    public String adminDashboard() {
        return "Espace administrateur - réservé au rôle ADMIN.";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}