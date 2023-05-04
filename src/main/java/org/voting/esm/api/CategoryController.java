package org.voting.esm.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.voting.esm.model.Category;
import org.voting.esm.service.CategoryService;

import java.util.List;

import static org.voting.esm.util.WebPaths.*;

@RestController
@RequestMapping(path = BASE_URL + API + CATEGORIES, produces = JSON)
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @PostMapping()
    public ResponseEntity<Object> createCategory(@RequestBody Category category) {
        Category createdCategory = categoryService.create(category);
        return ResponseEntity.ok().body(createdCategory);
    }
}
