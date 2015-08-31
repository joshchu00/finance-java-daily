package idv.trashchu.finance;

import java.io.IOException;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {

	private static Logger logger = LoggerFactory.getLogger(MainClass.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		try {
			
			/*IncomeStatement is = null;
			
			IncomeStatementDAO isdao = null;
			
			
			
			is = new IncomeStatement("201301", "2301", "測試", 0.3);
			
			isdao = (IncomeStatementDAO) FinanceDAOFactory.generateDAO(TableEntity.INCOMESTATEMENT, DatabaseUtil.HIBERNATE);
			
			isdao.insertOrUpdate(is);
			
			is = isdao.get(new IncomeStatementPrimaryKey("201301", "2301"));
			
			logger.info("IncomeStatement: " + is.getSeason() + ", " + is.getSymbol() + ", " + is.getName() + ", " + is.getEps());
			
			
			
			
			is = new IncomeStatement("201302", "2301", "測試", 0.5);
			
			isdao = (IncomeStatementDAO) FinanceDAOFactory.generateDAO(TableEntity.INCOMESTATEMENT, DatabaseUtil.PUREJDBC);
			
			isdao.insertOrUpdate(is);
			
			is = isdao.get(new IncomeStatementPrimaryKey("201302", "2301"));
			
			logger.info("IncomeStatement: " + is.getSeason() + ", " + is.getSymbol() + ", " + is.getName() + ", " + is.getEps());*/
			
			
			
			
			
			
			
			
			
			
			
			//Parsers.ParseStockRecordHTML();
			
		//} catch (SQLException sqle) {
			//sqle.printStackTrace();
		//	logger.error("", sqle);
		//} catch (IOException ioe) {
			//ioe.printStackTrace();
		//	logger.error("", ioe);
		//}
		} catch (Exception e) {
		//	e.printStackTrace();
		//	logger.error("", e);
		}
	}

}
