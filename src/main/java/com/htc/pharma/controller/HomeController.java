package com.htc.pharma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.htc.pharma.model.Pharma;
import com.htc.pharma.service.IPharmaService;

@Controller
public class HomeController {
	
	@Autowired
	IPharmaService pharmaService;

	@RequestMapping("/")
	public String getHomePage() {
		return "index"; 
	}
	
	@RequestMapping("/contactUs")
	public String getContactUsPage() {
		return "contactus";
	}
	@RequestMapping("/logout")
	public String getLoginPage() {
		return "redirect:/login";
	}
	
	
	@RequestMapping("/registration")
	public ModelAndView getRegistrationPage()
	{
		ModelAndView modelAndView = new ModelAndView("registration", "Pharma", new Pharma());
		return modelAndView;
	}
	
	@RequestMapping(value="/addMedicine", method=RequestMethod.POST)
	public String postRegisteredMedicine(@ModelAttribute(name="pharma") Pharma pharma,RedirectAttributes redirectAttrs) {
		
		boolean registerMedicineFlag = pharmaService.addMedicine(pharma);
		if(registerMedicineFlag)
		{
			redirectAttrs.addFlashAttribute("msg","registered medicine");
			return "redirect:/viewRegisteredMedicines";
		}
		else
			return "registration";
	}
	
	@RequestMapping(value = "/viewRegisteredMedicines")
	 public ModelAndView processMedicine(Pharma pharma) {
	 
		List<Pharma> medicines = null;
		medicines = pharmaService.getAllMedicines();
		ModelAndView modelandview = new ModelAndView("viewRegisteredMedicines", "Pharma", medicines);
		return modelandview;
	 }
	
	@RequestMapping(value = "/editMedicine")
	public String getEditPharmaForm(@RequestParam("medicineId") int medicineId, Model model) {
		
		Pharma pharma = null;
		pharma = pharmaService.getMedicine(medicineId);
		model.addAttribute("pharma", pharma);
		
		return "editPharmaForm";
	}
	
	@PostMapping("/updateMedicine")
	public String getUpdate(@RequestParam("medicineId") int medicineId, int price,int dose,int grams ) {
		
		pharmaService.updateMedicine(medicineId, price, dose, grams);
		return "redirect:/viewRegisteredMedicines";
	}
	@RequestMapping(value="/deleteMedicine")
	public String getdeleteMedicine(@RequestParam("medicineId")int medicineId,Model model) {
		boolean deleteMedicine=pharmaService.deleteMedicine(medicineId);
		model.addAttribute("pharma",deleteMedicine);
		return "redirect:/viewRegisteredMedicines";
		
	}

	@RequestMapping(value="/searchMedicine")
	public ModelAndView processSerarch() 
	{
		ModelAndView modelAndView=new ModelAndView("searchMedicine","Pharma",new Pharma());
		return modelAndView;
	}
	
	@RequestMapping(value = "/searchview")
	public String getPharmaForm(@RequestParam("medicineId") int medicineId,Model model) {
		
		Pharma searchview=pharmaService.getMedicine(medicineId);
		
		model.addAttribute("pharma",searchview);
		return "searchview";
	}
}

