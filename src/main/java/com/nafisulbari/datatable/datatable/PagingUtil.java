package com.nafisulbari.datatable.datatable;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * @author Ahmed Nafisul Bari
 */
public class PagingUtil {

    public static String toSearchTerm(PagingRequest pagingRequest) {

        return pagingRequest.getSearch().getValue();
    }

    public static Pageable toPageable(PagingRequest pagingRequest) {
        int page = pagingRequest.getStart();
        int size = pagingRequest.getLength();
        if (page > 0) {
            page = page / size;
        }
        Sort sort = toSort(pagingRequest);

        return PageRequest.of(page, size, sort);
    }

    public static Sort toSort(PagingRequest pagingRequest) {
        int columnNo = pagingRequest.getOrder().get(0).getColumn();
        String columnName = pagingRequest.getColumns().get(columnNo).getData();
        Direction direction = pagingRequest.getOrder().get(0).getDir();

        Sort sort;
        if (direction == Direction.asc) {
            sort = Sort.by(columnName).ascending();
        } else {
            sort = Sort.by(columnName).descending();
        }

        return sort;
    }
}
