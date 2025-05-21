package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjections;

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
	
	
public GameMinDto(GameMinProjections projections) {
		
		id = projections.getId();
		title = projections.getTitle();
		yaer = projections.getYear();
		imgUrl =projections.getImaUrl();
		shortDescription = projections.getShortDescription();
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
