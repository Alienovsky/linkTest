package com.example.template;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by e-klti on 2018-05-29.
 */
@RestController
public class Controller {

    @Autowired
    private LinkRepository linkRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(value = "/links", method = RequestMethod.GET)
    public List<Link> getAllLinks(){
        return IteratorUtils.toList(linkRepository.findAll().iterator());
    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories(){
        return IteratorUtils.toList(categoryRepository.findAll().iterator());
    }

}
