package com.eira.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class SuccessController {

    // initialization of a Success Service
    @Autowired
    SuccessService successService;

    // endpoint "/success"
    @GetMapping("/success")
    public String MakeSuccess(Model model) {

        // get a random boolean
        boolean nextTry = successService.MakeTry();

        // process it
        String success = successService.ProcessSuccess(nextTry);

        // bind the returned string to the model, eg send it to the HTML page
        model.addAttribute("success", success);

        // return HTML
        return("springfundamentals/success");
    }
}
