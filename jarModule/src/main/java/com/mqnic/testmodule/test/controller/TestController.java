package com.mqnic.testmodule.test.controller;

import com.mqnic.testmodule.test.domain.SearchVO;
import com.mqnic.testmodule.test.mapper.TestMapper;
import com.mqnic.testmodule.test.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/")
@RequiredArgsConstructor
public class TestController {
    private final TestService service;

    @GetMapping("/")
    public String testList(ModelMap modelMap) {
        modelMap.addAttribute("pageData", service.getTestList(SearchVO.builder().pageSize(10).pageNo(1).sortKey("testType").build()));
        return "index";
    }
}
