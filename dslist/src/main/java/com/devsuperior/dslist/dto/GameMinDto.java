package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDto {
	

	private Long id;
	private String title;	
	private Integer yaer;
	private String imgUrl;	
	private String shortDescription;
	
	public GameMinDto() {
		
	}
	
	public GameMinDto(Game entity) {
		
		id = entity.getId();
		title = entity.getTitle();
		yaer = entity.getYaer();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYaer() {
		return yaer;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	

}
