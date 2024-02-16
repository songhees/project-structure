package com.mqnic.testmodule.test.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestListVO {
    private String testListId;
    private String testNm;
    private String testType;
    private String execPlcyId;
    private String srvcListId;
    private String testTime; // 실행 시간
    private String testCycl; // 실행 주기
    private Date rgstDttm; // 등록일자
    private String userId; // 사용자
}
