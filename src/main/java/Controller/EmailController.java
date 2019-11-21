package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class EmailController {
    private static Pattern pattern ;
    private Matcher matcher;
    private final String Email_Regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public EmailController(){
        //pattern coi như 1 đối tượng lưu trữ những giá trị thỏa mãn biểu thức email_regex
        pattern = Pattern.compile(Email_Regex);
    }
    @GetMapping("/")
    String getIndex(){
        return "index";
    }
    @PostMapping("/validate")
    String validateEmail(@RequestParam("email") String email, Model model){
        boolean isValid = this.validate(email);
        if(!isValid){
            model.addAttribute("message" ,"email is invalid");
            return "index";
        }
        model.addAttribute("email", email);
        return "success";

    }
    private boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
