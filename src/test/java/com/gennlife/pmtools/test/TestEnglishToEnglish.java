package com.gennlife.pmtools.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gennlife.autoplatform.bean.Excel;
import com.gennlife.pmtools.EnglishToEnglish;

import java.io.IOException;

public class TestEnglishToEnglish {

/*	private String filePath = "D:\\yujie";
	private String fileName = "英文版乳腺癌2.xlsx";
	private String sheetName = "就诊-介入治疗(package)";
	
	private String fileName2 = "CRF表字段配置2.xlsx";*/
	private String filePath = "D:\\yujie";
	private String fileName = "2.xlsx";
	private String sheetName = "就诊-介入治疗(package)";

	private String fileName2 = "12.xlsx";
    //打開excel文件，用來調是否文件名為中文字符不可以
/*	@Test
	public void test(){
		try{
			Runtime.getRuntime().exec("cmd /c start D:\\yujie\\2.xlsx");
		}catch(IOException e){}

	}*/

	@Test
	public void testYujie(){
		Excel excelrx = new Excel(filePath, fileName, sheetName);
		
		Excel exceldc = new Excel(filePath, fileName2, sheetName);
		
		String str = EnglishToEnglish.testYujie(excelrx, 2, exceldc, 2);
		
		System.out.println(str);
	}
	
	
	
}