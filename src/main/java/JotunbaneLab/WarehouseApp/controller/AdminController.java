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
    ClientService clientService;

    public AdminController(ClientService clientService){
        this.clientService = clientService;
    }

    @GetMapping("/admin")
    public ModelAndView getAdminView() {
        return new ModelAndView("admin");
    }

    @GetMapping("/admin/addClient")
    public ModelAndView getAddClientView() {
        return new ModelAndView("addClient", "newClient", new ClientDTO());
    }


    @PostMapping("/admin/addClient")
    public String addClient(@ModelAttribute ClientDTO clientDTO) {
        clientService.addClient(clientDTO);

        return "redirect:/admin/clients";
    }

    @GetMapping("/admin/clients")
    public ModelAndView getAllClients() {
        List<ClientDTO> clientDTOList = clientService.getAllClients();
        return new ModelAndView("clients", "clientList", clientDTOList);
    }

    @PostMapping("/admin/deleteClient")
    public String deleteClient(@ModelAttribute ClientDTO clientDTO){
        System.out.println("Usuwam klienta:"+ clientDTO.getName());
        clientService.deleteClient(clientDTO.getId());

        return "redirect:/admin/clients";
    }


}
