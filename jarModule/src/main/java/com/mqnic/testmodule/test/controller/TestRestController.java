package com.mqnic.testmodule.test.controller;

import com.mqnic.testmodule.test.domain.PageData;
import com.mqnic.testmodule.test.domain.SearchVO;
import com.mqnic.testmodule.test.domain.TestListVO;
import com.mqnic.testmodule.test.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TestRestController {

    private final TestService service;

    @PostMapping("/page")
    public ResponseEntity<PageData> getTestList(SearchVO searchVO) {
        return ResponseEntity.ok(service.getTestList(searchVO));
    }
}
