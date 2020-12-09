package com.cykj.orm;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Field;

public class MappingUtils {

    public static Element fetchXml(){
        File file = new File("src/main/resources/TestUser.xml");
        //
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read(file);
            Element root = doc.getRootElement();
            return root;
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String fetchInsertSql(String bean){
        try {
            Class clz = Class.forName(bean);
            String clzStr = clz.toString();
            //获取类名
            String beanName = clzStr.substring(clzStr.lastIndexOf(".") + 1).toLowerCase();
            //获取类中的所有属性
            Field[] fields = clz.getDeclaredFields();
            StringBuffer sb = null;
            String fieldName = "";
            for (Field field:fields){
                fieldName += "," + field.getName();
                if (sb == null){
                    sb = new StringBuffer();
                    sb.append("?");
                }else{
                    sb.append(" , ? ");
                }
            }
            return "insert into " + beanName +"("+fieldName.substring(1)+") values("+sb.toString()+")";
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}

