package utilitiespkg;

import java.io.FileInputStream;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static  String getCellvalue(String xl, String Sheet, int r, int c)
	{
		try
		{
			FileInputStream f=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFCell cell=wb.getSheet(Sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
		}
		catch(Exception e)
		{
			return "";
			
		}
	}
public static int RowCount(String xl,String Sheet) {
		
		try
		{
			FileInputStream f= new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(f);
			return wb.getSheet(Sheet).getLastRowNum();
			
		}
		catch (Exception e) {
			
			return 0;
		}
		
	}

}
