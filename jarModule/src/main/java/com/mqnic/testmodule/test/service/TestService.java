package com.mqnic.testmodule.test.service;

import com.mqnic.testmodule.test.domain.PageData;
import com.mqnic.testmodule.test.domain.SearchVO;
import com.mqnic.testmodule.test.domain.TestListVO;

import java.util.List;

public interface TestService {
    PageData<TestListVO> getTestList(SearchVO searchVO);
}
