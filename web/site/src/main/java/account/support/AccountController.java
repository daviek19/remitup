package account.support;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/")
    public String welcome(){
        return "account/welcome";
    }
}
