package com.mqnic.testmodule.test.service;

import com.mqnic.testmodule.test.domain.PageData;
import com.mqnic.testmodule.test.domain.SearchVO;
import com.mqnic.testmodule.test.domain.TestListVO;
import com.mqnic.testmodule.test.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestMapper mapper;

    public PageData<TestListVO> getTestList(SearchVO searchVO) {
        List<TestListVO> testList = mapper.getTestList(searchVO);
        int cnt = mapper.getTestListCnt(searchVO);

        return PageData.<TestListVO>builder().data(testList)
                .pageNo(searchVO.getPageNo()).pageSize(searchVO.getPageSize())
                .totalCnt(cnt).build();

    }
}
