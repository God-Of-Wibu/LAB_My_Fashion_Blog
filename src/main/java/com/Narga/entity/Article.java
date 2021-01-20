package com.Narga.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Article {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;
	
	@Column(name = "title")
	private String title;
	
	public Article(String title, Date date, String icon, String poster, String description) {
		super();
		this.title = title;
		this.date = date;
		this.icon = icon;
		this.poster = poster;
		this.description = description;
	}

	@Column(name = "date")
	private Date date;
	
	@Column(name = "icon")
	private String icon;
	
	@Column(name = "poster")
	private String poster;

	@Column(name = "description", columnDefinition = "nvarchar(1000)")
	private String description;

	
	
	
}
