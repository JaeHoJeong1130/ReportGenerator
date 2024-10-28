package TermProjectFinal;

public class StandardReportComponent implements ReportComponent {
    //앞 페이지 구체화
	@Override
    public String createCoverPage() {
    	String CoverPage = "      = Standard FrontPage =      ";
    	
        return CoverPage;
    }
    //중간 페이지 구체화
    @Override
    public String createContentPage() {
    	String ContentPage = "                              \n";
    	
        return ContentPage;
    }
    //뒤 페이지 구체화
    @Override
    public String createBackPage() {
    	String BackPage = "      = Standard Back Page =      ";
    	
    	for(int i = 0; i < 6; i++) {
    		BackPage += "\n";
    	}
    	
        return BackPage;
    }

    @Override
    public ReportDecorator createHeader() {
        return new HeaderDecorator();
    }

    //오버라이드로 원하는 형태로 바꿀 수 있음
    @Override
    public ReportDecorator createFooter() {
        return new FooterDecorator();
    }
}

