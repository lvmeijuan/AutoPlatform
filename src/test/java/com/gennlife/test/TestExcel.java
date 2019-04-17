package com.gennlife.test;

import com.gennlife.autoplatform.bean.Excel;
import org.junit.Test;
import test.Test003;

/**
 * @author lvmeijuan
 * @create 2019-04-17 17:11
 */
public class TestExcel {

    private String filePath = "D:\\yujie";

    //配置表
    private String fileName = "2.xlsx";
    //数据表
    private String fileName2 = "12.xlsx";

    private String sheetName = "就诊-介入治疗(package)";




    @Test
    public void TestExcel() throws Exception{

        Excel excelread=new Excel(filePath,fileName,sheetName);
        Excel excelwrite=new Excel(filePath,fileName2,sheetName);
        Test003.writeline(excelread,excelwrite);
        System.out.println("写入完成");


    }


}
