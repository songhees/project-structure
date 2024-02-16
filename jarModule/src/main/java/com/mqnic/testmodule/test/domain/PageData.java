package com.mqnic.testmodule.test.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageData<T> {

    private int pageSize;
    private int pageNo;
    private int totalCnt;
    private int totalPage;
    private List<T> data;

}
