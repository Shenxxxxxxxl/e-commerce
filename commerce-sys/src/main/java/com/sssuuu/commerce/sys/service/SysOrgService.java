package com.sssuuu.commerce.sys.service;

import com.sssuuu.commerce.sys.model.ParamModel;
import com.sssuuu.commerce.sys.model.ResultModel;
import com.sssuuu.commerce.sys.model.SysOrg;

import java.util.List;

public interface SysOrgService {
    ResultModel<List<SysOrg>> getOrgList(ParamModel<SysOrg> sysOrgParamModel);
}
