package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.MenuDetailsBO;

public class MenuItemsDAOImpl implements MenuItemsDAO {
	private static final String MENU_INSERT_QUERY = "INSERT INTO MENUITEMS VALUES(MENUID,ITEMNAME,CATEGORY,PRICE,STATUS,RESTAURANT(?,?,?,?,?.?))";

	private JdbcTemplate jt;

	public MenuItemsDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int registerMenuItems(MenuDetailsBO bo) {

		int count = 0;
		count = jt.update(MENU_INSERT_QUERY, bo.getItemName(), bo.getCategory(), bo.getPrice(), bo.getStatus(),
				bo.getRestaurant());
		return count;
	}

}
