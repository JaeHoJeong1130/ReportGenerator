package TermProjectFinal;

public class CustomTitleReportComponent implements ReportComponent {
	private String title;
	
	public CustomTitleReportComponent(String title) {
		this.title = title;
	}
	
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
		return new FooterDecorator() { //꼬리말에 title 추가
			@Override
			public String decorate(String content) {
				return super.decorate(content) + "(Title:" + title + ")\n";
			}
			
			@Override
			public int getPrice() { //가격 추가
				return super.getPrice() + 3;
			}
		};
	}
}

