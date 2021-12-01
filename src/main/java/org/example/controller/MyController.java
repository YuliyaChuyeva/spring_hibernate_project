package org.example.controller;

import org.example.dao.OverviewDAO;
import org.example.entity.Overview;
import org.example.entity.User;
import org.example.service.OverviewService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private OverviewService overviewService;

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String showAllOverviews(Model model){

        List<Overview> overviews = overviewService.getAllOverview();
        model.addAttribute("allViews", overviews);
        return "all-overviews";
    }



    @RequestMapping("/addNewOverview")
    public String addNewOverview(Model model){

        Overview overview = new Overview();
        model.addAttribute("overview", overview);

        return "overview-info";
    }

    @RequestMapping("/addNewUser")
    public String addNewUser(Model model){

        User user = new User();
        model.addAttribute("user", user);

        return "user-info";
    }


    @RequestMapping("/saveOverview")
    public String saveOverview(@Valid @ModelAttribute("overview") Overview overview,
                               BindingResult bindingResult){

            if(bindingResult.hasErrors()){
                return "overview-info";
            }
            else{
        overviewService.saveOverview(overview);
        return "redirect:/";}
    }

    @RequestMapping("/saveUser")
    public String saveUser(@Valid @ModelAttribute("user") User user,
                               BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "user-info";
        }
        else{
            userService.saveUser(user);
            return "redirect:/";}
    }

    @RequestMapping("/updateInfo")
    public String updateOverview(@RequestParam("viewId") int id,
                                 Model model){
        Overview overview = overviewService.getOverview(id);
        model.addAttribute("overview",overview);
        return "overview-info";
    }

    @RequestMapping("/deleteOverview")
    public String deleteOverview(@RequestParam("viewId") int id){
        overviewService.deleteOverview(id);
        return "redirect:/";
    }
}
