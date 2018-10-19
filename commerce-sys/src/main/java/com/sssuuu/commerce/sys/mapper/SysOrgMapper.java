package com.sssuuu.commerce.sys.mapper;

import com.sssuuu.commerce.sys.model.ParamModel;
import com.sssuuu.commerce.sys.model.ResultModel;
import com.sssuuu.commerce.sys.model.SysOrg;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface SysOrgMapper {
    ResultModel<List<SysOrg>> getOrgList(ParamModel<SysOrg> sysOrgParamModel);
}
