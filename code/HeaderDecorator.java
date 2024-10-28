package TermProjectFinal;

public class HeaderDecorator implements ReportDecorator {
	//변경불가능하고 다른 클래스에서 접근 불가능하게 캡슐화
	private static final int PRICE = 2;
	
	@Override
    public String decorate(String content) {
        return "\n------------- 머 리 말 -------------\n" + content;
    }
    
    @Override
    public int getPrice() {
        return PRICE;
    }
}

