package com.nafisulbari.datatable.datatable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Ahmed Nafisul Bari
 */

@Setter
@Getter
@NoArgsConstructor
public class Column {

    private String data;

    private String name;

    private Boolean searchable;

    private Boolean orderable;

    private Search search;
}
