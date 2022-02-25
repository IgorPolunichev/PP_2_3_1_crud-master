package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.UserDaoImp;


@Controller
@RequestMapping(value = "/users")
public class UsersController {


    private final UserDaoImp userDAO;

    public UsersController(UserDaoImp userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping()
    public String index (Model model) {
        model.addAttribute("users", userDAO.index());
        return "users/index";
    }
    @GetMapping("/{id}")
    public String show (@PathVariable ("id") int id, Model model) {
        model.addAttribute("user", userDAO.show(id));
        return "users/show";
    }

}
