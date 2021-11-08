package com.nafisulbari.datatable.person;

import com.nafisulbari.datatable.datatable.Page;
import com.nafisulbari.datatable.datatable.PagingRequest;

import java.util.List;

/**
 * @author Ahmed Nafisul Bari
 */
public interface PersonService {

    Page<Person> getPaginatedDatatable(PagingRequest pagingRequest);
}
