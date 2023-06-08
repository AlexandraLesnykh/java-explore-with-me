package ru.practicum.category.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.practicum.category.dto.CategoryDto;
import ru.practicum.category.service.CategoryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/categories")
@Slf4j
public class PublicCategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> getAllCompilationPub(@RequestParam(name = "from", defaultValue = "0") int from,
                                                  @RequestParam(name = "size", defaultValue = "10") int size) {
        return categoryService.getAll(from, size);
    }

    @GetMapping(value = "/{catId}")
    public CategoryDto getCompilationPub(@PathVariable Long catId) {
        return categoryService.getById(catId);
    }
}
