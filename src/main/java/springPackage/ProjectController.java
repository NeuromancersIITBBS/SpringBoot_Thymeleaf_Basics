package springPackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProjectController {

    private String string = "This is the initial output.";

    @RequestMapping(value = {"/start"})
    public String initPage(Model model) {

        model.addAttribute("output", string);

        return "init";
    }

    @RequestMapping(value = {"/submit"})
    public String onSubmit(@RequestParam("formInput") String formInput) {

        string = formInput;

        return "redirect:/start";
    }
}
