package com.nafisulbari.datatable.person;

import com.nafisulbari.datatable.datatable.Page;
import com.nafisulbari.datatable.datatable.PagingRequest;
import com.nafisulbari.datatable.datatable.PagingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Ahmed Nafisul Bari
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Page<Person> getPaginatedDatatable(PagingRequest pagingRequest) {
        //Mapping DataTables PagingRequest to spring's Pageable
        Pageable pageable = PagingUtil.toPageable(pagingRequest);
        String searchTerm = PagingUtil.toSearchTerm(pagingRequest);

        org.springframework.data.domain.Page<Person> filteredRecordsPage =
                personRepository.getPagedData_jpql(searchTerm, pageable);

        int availableFilteredRecords = (int)filteredRecordsPage.getTotalElements();
        int totalRecords = (int)personRepository.count();

        return new Page<>(filteredRecordsPage.getContent(), availableFilteredRecords, totalRecords);
    }
}
