package JotunbaneLab.WarehouseApp.controller;

import JotunbaneLab.WarehouseApp.model.dto.ClientDTO;
import JotunbaneLab.WarehouseApp.model.entity.Client;
import JotunbaneLab.WarehouseApp.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {




    @GetMapping("/admin")
    public ModelAndView getAdminView() {
        return new ModelAndView("admin");
    }




}
