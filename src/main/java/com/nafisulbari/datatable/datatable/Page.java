package com.nafisulbari.datatable.datatable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author Ahmed Nafisul Bari
 */
@Getter
@Setter
@NoArgsConstructor
public class Page<T> {


    private List<T> data;
    private int recordsFiltered;
    private int recordsTotal;



    public Page(List<T> data) {
        this.data = data;
    }

    public Page(List<T> data, int recordsFiltered, int recordsTotal) {
        this.data = data;
        this.recordsFiltered = recordsFiltered;
        this.recordsTotal = recordsTotal;

    }
}
