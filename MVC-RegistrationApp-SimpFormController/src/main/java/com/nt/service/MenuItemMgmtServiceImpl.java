package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.MenuDetailsBO;
import com.nt.dao.MenuItemsDAO;
import com.nt.dto.MenuDetailsDTO;

public class MenuItemMgmtServiceImpl implements MenuItemMgmtService {

	private MenuItemsDAO dao;

	public MenuItemMgmtServiceImpl(MenuItemsDAO dao) {
		this.dao = dao;
	}

	@Override
	public String register(MenuDetailsDTO dto) {
		MenuDetailsBO bo = null;
		int count = 0;
		//convert dto to bo
		bo = new MenuDetailsBO();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count = dao.registerMenuItems(bo);
		if (count == 0)
			return "adding item to menu list is failed";
		else
			return "adding item to menu list is successed";
	}

}
