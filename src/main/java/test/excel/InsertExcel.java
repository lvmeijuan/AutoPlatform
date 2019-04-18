package test.excel;

import org.apache.poi.hssf.usermodel.*;

import java.io.FileOutputStream;
import java.util.List;
import java.io.OutputStream;

/**
 * @author lvmeijuan
 * @create 2019-04-18 14:04
 */
public class InsertExcel {

    /**
     *
     * @param xls
     *            XlsDto实体类的一个对象
     * @throws Exception
     *             在导入Excel的过程中抛出异常
     */
    public static void xlsDto2Excel(List<Student> xls) throws Exception {
        // 获取总列数
        int CountColumnNum = xls.size();
        // 创建Excel文档
        HSSFWorkbook hwb = new HSSFWorkbook();
        Student xlsDto = null;
        // sheet 对应一个工作页
        HSSFSheet sheet = hwb.createSheet("pldrxkxxmb");
        HSSFRow firstrow = sheet.createRow(0); // 下标为0的行开始
        HSSFCell[] firstcell = new HSSFCell[CountColumnNum];
        String[] names = new String[CountColumnNum];
        names[0] = "学号";
        names[1] = "姓名";
        names[2] = "年龄";
        names[3] = "成绩";
        for (int j = 0; j < CountColumnNum; j++) {
            firstcell[j] = firstrow.createCell(j);
            firstcell[j].setCellValue(new HSSFRichTextString(names[j]));
        }
        for (int i = 0; i < xls.size(); i++) {
            // 创建一行
            HSSFRow row = sheet.createRow(i + 1);
            // 得到要插入的每一条记录
            xlsDto = xls.get(i);
            for (int colu = 0; colu <= 3; colu++) {
                // 在一行内循环
                HSSFCell xm = row.createCell(0);
                xm.setCellValue(xlsDto.getNo());
                HSSFCell yxsmc = row.createCell(1);
                yxsmc.setCellValue(xlsDto.getName());
                HSSFCell kcm = row.createCell(2);
                kcm.setCellValue(xlsDto.getAge());
                HSSFCell cj = row.createCell(3);
                cj.setCellValue(xlsDto.getScore());
               /* (xlsDto.getMessage());*/
            }
        }
        // 创建文件输出流，准备输出电子表格
        OutputStream out = new FileOutputStream(Common.STUDENT_XLS_PATH);
        hwb.write(out);
        out.close();
        System.out.println("数据库导出成功");
    }

}
