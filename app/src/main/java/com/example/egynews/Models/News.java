package com.example.egynews.Models;

import java.util.List;

public class News {
	private int totalResults;
	private List<Article> articles;
	private String status;

	public int getTotalResults(){
		return totalResults;
	}

	public List<Article> getArticles(){
		return articles;
	}

	public String getStatus(){
		return status;
	}
}