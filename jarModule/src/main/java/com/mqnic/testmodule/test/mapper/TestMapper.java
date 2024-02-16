package com.mqnic.testmodule.test.mapper;

import com.mqnic.testmodule.test.domain.SearchVO;
import com.mqnic.testmodule.test.domain.TestListVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<TestListVO> getTestList(SearchVO searchVO);

    int getTestListCnt(SearchVO searchVO);
}
