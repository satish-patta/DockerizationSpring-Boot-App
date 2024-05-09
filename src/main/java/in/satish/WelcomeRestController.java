package in.satish;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping
     public String getMsg() {
    	 return "Hello There!! I am Satish.";
     }
}
