package in.nit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.nit.Service.IShipmentTypeService;
import in.nit.model.ShipmentType;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;
	
	@RequestMapping("/register")
	public String ShowRegPage(){
		
		return "ShipmentTypeRegister";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveShipment(
			@ModelAttribute ShipmentType shipmentType,Model model ) {
		
		Integer id=service.saveShipmentType(shipmentType);
		
		String message="shipment type'"+id+"'saved";
		model.addAttribute("message",message);
		return "ShipmentTypeRegister";
	
		
	}
	
	

}
