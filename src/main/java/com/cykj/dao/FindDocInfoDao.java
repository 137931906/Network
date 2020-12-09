package com.cykj.dao;

import com.cykj.bean.DocInfo;
import com.cykj.bean.FindUser;
import com.cykj.mapper.FindDocInfoMapper;
import com.cykj.mapper.FindUserMapper;
import com.cykj.util.MybatisUtil;
import com.cykj.util.ObjectFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class FindDocInfoDao {

    DocInfo docInfo = (DocInfo)ObjectFactory.newInstance("com.cykj.bean.DocInfo");

    public List<DocInfo> findDocInfoList(RowBounds rb){
        SqlSession session = MybatisUtil.getInstance().getSqlSession();
        FindDocInfoMapper findDocInfoMapper = session.getMapper(FindDocInfoMapper.class);
        List<DocInfo> findDocInfoList = findDocInfoMapper.findDocInfo(rb);
        return findDocInfoList;
    }


    public int docInfoCount(){
        SqlSession sqlSession= MybatisUtil.getInstance().getSqlSession();
        FindDocInfoMapper findDocInfoMapper = sqlSession.getMapper(FindDocInfoMapper.class);
        int countDoc = findDocInfoMapper.docInfoCount();
        return countDoc;
    }

}
