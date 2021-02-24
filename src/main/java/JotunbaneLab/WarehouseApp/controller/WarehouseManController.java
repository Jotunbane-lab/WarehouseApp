package JotunbaneLab.WarehouseApp.controller;

import JotunbaneLab.WarehouseApp.model.dto.ClientDTO;
import JotunbaneLab.WarehouseApp.model.dto.WarehouseManDTO;
import JotunbaneLab.WarehouseApp.service.WarehouseManService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WarehouseManController {
    private WarehouseManService warehouseManService;

    public WarehouseManController(WarehouseManService warehouseManService) {this.warehouseManService = warehouseManService;}

    @GetMapping("/admin/warehousemen")
    public ModelAndView getAllWarehousemans() {
        List<WarehouseManDTO> warehouseManDTOList = warehouseManService.getAllWarehousemans();
        return new ModelAndView("warehousemen", "warehousemanList", warehouseManDTOList);
    }

    @GetMapping("/admin/addWarehouseman")
    public ModelAndView getAddWarehousemanView() {
        return new ModelAndView("addWarehouseman", "newWarehouseman", new WarehouseManDTO());
    }


    @PostMapping("/admin/addWarehouseman")
    public String addWarehouseMan(@ModelAttribute WarehouseManDTO warehouseManDTO) {
        warehouseManService.addWarehouseman(warehouseManDTO);

        return "redirect:/admin/warehousemen";
    }

    @PostMapping("/admin/deleteWarehouseman")
    public String deleteWarehouseman(@ModelAttribute WarehouseManDTO warehouseManDTO){
        System.out.println("Usuwam: " + warehouseManDTO.getName());
        warehouseManService.deleteById(warehouseManDTO.getId());

        return "redirect:/admin/warehousemen";
    }


}
