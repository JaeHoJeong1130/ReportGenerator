package TermProjectFinal;

public class FooterDecorator implements ReportDecorator {
	//변경불가능하고 다른 클래스에서 접근 불가능하게 캡슐화
	private static final int PRICE = 3;
	
	@Override
    public String decorate(String content) {
        return content + "\n------------- 꼬 리 말 -------------\n";
    }
	
	@Override
    public int getPrice() {
        return PRICE;
    }
}


