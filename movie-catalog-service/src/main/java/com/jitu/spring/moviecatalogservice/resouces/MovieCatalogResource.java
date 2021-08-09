package com.jitu.spring.moviecatalogservice.resouces;

import java.util.Collections;
import java.util.List;

import com.jitu.spring.moviecatalogservice.models.CatalogItem;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId) {
        return Collections.singletonList(new CatalogItem("Witcher", "desc", 10));
    }
}
