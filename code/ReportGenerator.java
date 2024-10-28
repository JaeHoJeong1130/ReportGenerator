package TermProjectFinal;

public class ReportGenerator {
    private ReportComponent component;

    public ReportGenerator(ReportComponent component) {
        this.component = component;
    }

    public String generateReport(String title, String body, String author, String contact) {
        //앞 페이지
    	String reportF = component.createCoverPage() + "\n\n";
        reportF += "제목: " + title + "\n\n";
        reportF += "작성자: " + author + "\n";
        reportF += "연락처: " + contact + "\n\n\n";
        
        ReportDecorator headerF = component.createHeader();
        reportF = headerF.decorate(reportF);
        ReportDecorator footerF = component.createFooter();
        reportF = footerF.decorate(reportF);
        
        //본문 페이지
        String reportC = component.createContentPage();
        reportC += body + "\n\n\n\n";
        
        ReportDecorator headerC = component.createHeader();
        reportC = headerC.decorate(reportC);
        ReportDecorator footerC = component.createFooter();
        reportC = footerC.decorate(reportC);
        
        //뒤 페이지
        String reportB = component.createBackPage();

        ReportDecorator headerB = component.createHeader();
        reportB = headerB.decorate(reportB);
        ReportDecorator footerB = component.createFooter();
        reportB = footerB.decorate(reportB);
        
        //리포트 합치기
        String report = reportF + reportC + reportB;

        //각 페이지들 가격 합산
        int totalPrice = headerF.getPrice() + footerF.getPrice() 
        				+ headerC.getPrice() + footerC.getPrice() 
        				+ headerB.getPrice() + footerB.getPrice();
        
        System.out.println("리포트 가격 : $" + totalPrice + "\n");
        return report;
    }
}

