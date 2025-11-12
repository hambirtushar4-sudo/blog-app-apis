package com.example.demo.services;

import java.util.List;

import com.example.demo.payloads.CategoryDto;

public interface CategoryService {
	// Create
	CategoryDto createCategory(CategoryDto CategoryDto);

	// Update
	CategoryDto UpdateCategory(CategoryDto CategoryDto, Integer categoryId);

	// delete
	void deleteCategory(Integer categoryId);

	// get
	CategoryDto getCategory(Integer categoryId);

	// GetAll
	List<CategoryDto> getCategories();
}
