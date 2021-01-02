package JotunbaneLab.WarehouseApp.controller;

import JotunbaneLab.WarehouseApp.model.dto.ClientDTO;
import JotunbaneLab.WarehouseApp.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
    ClientService clientService;

    public AdminController(ClientService clientService){
        this.clientService = clientService;
    }

    @GetMapping("/admin")
    public ModelAndView getAdminView() {
        return new ModelAndView("admin");
    }

    @GetMapping("/addClient")
    public ModelAndView getAddClientView() {
        return new ModelAndView("addClient", "newClient", new ClientDTO());
    }


    @PostMapping("/addClient")
    public String addClient(@ModelAttribute ClientDTO clientDTO) {
        clientService.addClient(clientDTO);

        return "admin";
    }


}
