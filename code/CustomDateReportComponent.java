package TermProjectFinal;

import java.util.Date;

public class CustomDateReportComponent implements ReportComponent {
	@Override
    public String createCoverPage() {
    	String CoverPage = "    *=* Custom FrontPage *=*    ";
    	
        return CoverPage;
    }
	
	@Override
    public String createContentPage() {
    	String ContentPage = "                              \n";
    	
        return ContentPage;
    }

    @Override
    public String createBackPage() {
    	String BackPage = "    *=* Custom Back Page *=*    ";
    	
    	for(int i = 0; i < 6; i++) {
    		BackPage += "\n";
    	}
    	
        return BackPage;
    }

    @Override
    public ReportDecorator createHeader() {
        return new HeaderDecorator();
    }

	@Override
	public ReportDecorator createFooter() {
		Date date = new Date();
		
		return new FooterDecorator() { //꼬리말에 date 추가
			@Override
			public String decorate(String content) {
				return super.decorate(content) + "Date:" + date + "\n";
			}
			
			@Override
			public int getPrice() { //가격 추가
				return super.getPrice() + 4;
			}
		};
	}
}

