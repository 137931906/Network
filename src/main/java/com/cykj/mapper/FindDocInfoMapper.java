package com.cykj.mapper;


import com.cykj.bean.DocInfo;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface FindDocInfoMapper {

    List<DocInfo> findDocInfo(RowBounds rb);
    int docInfoCount();
}
