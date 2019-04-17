package test;

import com.gennlife.autoplatform.bean.Excel;
import com.gennlife.autoplatform.utils.ExcelUtils;
import com.gennlife.pmtools.TranslateToEnglish;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * @author lvmeijuan
 * @create 2019-04-17 17:20
 */
public class Test003 {
    private static Logger logger = Logger.getLogger(Test003.class);

    public static  void writeline(Excel excelread, Excel excelwrite) throws Exception{

        List<String> list =ExcelUtils.readExcelOfList(excelread,1);
        logger.info(list);

        for (int i = 0; i < list.size(); i++) {
            logger.info(list.get(i));
            int a=i+1;
            if (ExcelUtils.checkSheetOfExcelExist(excelread)) {
                ExcelUtils.writeOneListAndSaveContent(excelwrite, list, 3);
               // ExcelUtils.writeAndSaveContent(excelwrite, list.get(i), a, 1);

            }
            if (!ExcelUtils.checkSheetOfExcelExist(excelread)) {
                System.out.println("没有能够写入的内容");

            }

        }



    }

}
