package com.nafisulbari.datatable.person;

import com.nafisulbari.datatable.datatable.Page;
import com.nafisulbari.datatable.datatable.PagingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ahmed Nafisul Bari
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public String getView() {

        return "index.html";
    }

    @PostMapping("/dt")
    @ResponseBody
    public Page<Person> getPaginatedDatatable(@RequestBody PagingRequest pagingRequest) {

        return personService.getPaginatedDatatable(pagingRequest);
    }
}
