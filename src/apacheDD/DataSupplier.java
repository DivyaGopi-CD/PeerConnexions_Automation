package apacheDD;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	
	 @DataProvider
	 public String [][] LoginData() throws IOException
	 {
		/* String loginData[][]= {
				 {"ravindrah+demodistyuser1@openspaceservices.com","Round@123"}
				 		 
		 };*/ 
		 //get the data from excel
		 String path=".\\dataFiles\\peercondetails.xlsx";
		 XLUtility xlutil=new XLUtility(path);
		 int totalrows=xlutil.getRowCount("Sheet1");
		 int totalcols=xlutil.getCellCount("Sheet1",1);
				 
		 String loginData[][]=new String[totalrows][totalcols];
		 
		 for(int i=1;i<=totalrows;i++)
		 {
			 for(int j=0;j<totalcols;j++)
			 {
				 loginData[i-1][j]=xlutil.getCellData("Sheet1",i,j);
			 }
		 }
				 
		 return loginData;
		 
		   
	 }
	 
	 @DataProvider
	 public String [][] DatePicker() throws IOException
	 {
		 
	 String path=".\\dataFiles\\siteactivtitydate.xlsx";
		 XLUtility xlutil=new XLUtility(path);
		 int totalrows=xlutil.getRowCount("Sheet1");
		 int totalcols=xlutil.getCellCount("Sheet1",1);
				 
		 String DatePicker[][]=new String[totalrows][totalcols];
		 
		 for(int i=1;i<=totalrows;i++)
		 {
			 for(int j=0;j<totalcols;j++)
			 {
				 DatePicker[i-1][j]=xlutil.getCellData("Sheet1",i,j);
			 }
		 }
				 
		 return DatePicker;
		 
		   
	 }

	 @DataProvider
	 public String [][] SearchOrgName() throws IOException
	 {
		 
	 String path=".\\dataFiles\\SiteOrgLogin.xlsx";
		 XLUtility xlutil=new XLUtility(path);
		 int totalrows=xlutil.getRowCount("Sheet1");
		 int totalcols=xlutil.getCellCount("Sheet1",1);
				 
		 String SearchOrgName[][]=new String[totalrows][totalcols];
		 
		 for(int i=1;i<=totalrows;i++)
		 {
			 for(int j=0;j<totalcols;j++)
			 {
				 SearchOrgName[i-1][j]=xlutil.getCellData("Sheet1",i,j);
			 }
		 }
				 
		 return SearchOrgName;
		 
		   
	 }
	 
	 @DataProvider
	 public String [][] Goto() throws IOException
	 {
		 
	 String path=".\\dataFiles\\Goto.xlsx";
		 XLUtility xlutil=new XLUtility(path);
		 int totalrows=xlutil.getRowCount("Sheet1");
		 int totalcols=xlutil.getCellCount("Sheet1",1);
				 
		 String GotoPage[][]=new String[totalrows][totalcols];
		 
		 for(int i=1;i<=totalrows;i++)
		 {
			 for(int j=0;j<totalcols;j++)
			 {
				 GotoPage[i-1][j]=xlutil.getCellData("Sheet1",i,j);
			 }
		 }
				 
		 return GotoPage;
		 
		   
	 }
	 
	 @DataProvider
	 public String [][] Eye() throws IOException
	 {
		 
	 String path=".\\dataFiles\\EyeSearch.xlsx";
		 XLUtility xlutil=new XLUtility(path);
		 int totalrows=xlutil.getRowCount("Sheet1");
		 int totalcols=xlutil.getCellCount("Sheet1",1);
				 
		 String NoOfViews[][]=new String[totalrows][totalcols];
		 
		 for(int i=1;i<=totalrows;i++)
		 {
			 for(int j=0;j<totalcols;j++)
			 {
				 NoOfViews[i-1][j]=xlutil.getCellData("Sheet1",i,j);
			 }
		 }
				 
		 return NoOfViews;
		 
		   
	 }
	 
	 @DataProvider
	 public String [][] BrandVCAT3() throws IOException
	 {
		 
	 String path=".\\dataFiles\\Brand.xlsx";
		 XLUtility xlutil=new XLUtility(path);
		 int totalrows=xlutil.getRowCount("Sheet1");
		 int totalcols=xlutil.getCellCount("Sheet1",1);
				 
		 String BrandVCAT3[][]=new String[totalrows][totalcols];
		 
		 for(int i=1;i<=totalrows;i++)
		 {
			 for(int j=0;j<totalcols;j++)
			 {
				 BrandVCAT3[i-1][j]=xlutil.getCellData("Sheet1",i,j);
			 }
		 }
				 
		 return BrandVCAT3;
		 
		   
	 }

}
