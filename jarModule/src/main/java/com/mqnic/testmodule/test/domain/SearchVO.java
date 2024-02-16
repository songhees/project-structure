package com.mqnic.testmodule.test.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchVO {
    private String searchType;
    private String keyword;
    private int pageSize; // 페이지 사이즈
    private int pageNo;
    private String sortVal; // 정렬 방식
    private String sortKey; // 정렬 키
    private String serverName; // 서버 이름

    public int getStartIndex() {
        return (pageNo -1) * pageSize;
    }
}
