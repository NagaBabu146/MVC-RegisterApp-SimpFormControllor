package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class MenuDetailsDTO  implements Serializable{

	 
	private String itemName;
	private String category;
	private Double price;
	private String status;
	private String restaurant;
	
}
