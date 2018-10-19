package com.sssuuu.commerce.sys.controller;

import com.sssuuu.commerce.sys.model.ParamModel;
import com.sssuuu.commerce.sys.model.ResultModel;
import com.sssuuu.commerce.sys.model.SysOrg;
import com.sssuuu.commerce.sys.service.SysOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "sys/org")
public class SysOrgController {

    @Autowired
    private SysOrgService sysOrgService;

    @RequestMapping(value = "getOrgList")
    public ResultModel<List<SysOrg>> getOrgList(@RequestBody ParamModel<SysOrg> sysOrgParamModel){
        return sysOrgService.getOrgList(sysOrgParamModel);

    }

}
