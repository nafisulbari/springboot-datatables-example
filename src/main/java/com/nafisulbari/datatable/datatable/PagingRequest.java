package com.nafisulbari.datatable.datatable;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Ahmed Nafisul Bari
 */

@Setter
@Getter
@NoArgsConstructor
public class PagingRequest {

    private int start;
    private int length;

    private List<Order> order;
    private List<Column> columns;
    private Search search;

}
