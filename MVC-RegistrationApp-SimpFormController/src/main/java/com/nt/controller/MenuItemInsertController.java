package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import com.nt.command.MenuDetailsCommand;
import com.nt.dto.MenuDetailsDTO;
import com.nt.service.MenuItemMgmtService;

public class MenuItemInsertController extends SimpleFormController {
	private MenuItemMgmtService service;
	
	public MenuItemInsertController(MenuItemMgmtService service) {
		this.service = service;
	}
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		       
		        String rMsg=null;
	            MenuDetailsCommand cmd=null;
	            MenuDetailsDTO dto=null;
            //type casting
	        cmd = (MenuDetailsCommand)command;
	        //convert cmd to dto
	        dto=new MenuDetailsDTO();
	        //use service
	        service.register(dto);
	        //return MAV object
	         return new ModelAndView(getSuccessView(), "rMsg", rMsg);
	}

}
