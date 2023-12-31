package com.zohocrmapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.zohocrmapp.Service.ContactService;

import com.zohocrmapp.entity.Contact;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;
	
	
      @RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id") long id ,Model model) {
    	Contact contact =  contactService.getContactById(id);
    	  model.addAttribute("contact", contact);
		return "generate_bill";
	}
     
}