package com.sssuuu.commerce.sys.service.impl;

import com.sssuuu.commerce.sys.mapper.SysOrgMapper;
import com.sssuuu.commerce.sys.model.ParamModel;
import com.sssuuu.commerce.sys.model.ResultModel;
import com.sssuuu.commerce.sys.model.SysOrg;
import com.sssuuu.commerce.sys.service.SysOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysOrgServiceImpl implements SysOrgService {

    @Autowired
    private SysOrgMapper sysOrgMapper;

    @Override
    public ResultModel<List<SysOrg>> getOrgList(ParamModel<SysOrg> sysOrgParamModel) {
        return sysOrgMapper.getOrgList(sysOrgParamModel);
    }
}
