package TermProjectFinal;

public class Main {
	public static void main(String[] args) {
		// 기본 리포트
		ReportComponent standardCompoment = new StandardReportComponent();
		ReportGenerator standardGenerator = new ReportGenerator(standardCompoment);
		String standardReport = standardGenerator.generateReport("Standard Report", "~~본문~~", "정재호", "sean11301997@gmail.com");
		System.out.println("[[Standard Report]]\n" + standardReport + "\n\n\n");
   
		// 꼬리말에 출력일을 추가한 커스텀 리포트
		ReportComponent dateCustomComponent = new CustomDateReportComponent();
		ReportGenerator dateCustomGenerator = new ReportGenerator(dateCustomComponent);
		String dateCustomReport = dateCustomGenerator.generateReport("Date Customized Report", "~~본문~~", "정재호", "sean11301997@gmail.com");
		System.out.println("[[Date Custom Report]]\n" + dateCustomReport + "\n\n\n");
     
		// 꼬리말에 제목을 추가한 커스텀 리포트
		ReportComponent titleCustomComponent = new CustomTitleReportComponent("Title Customized Report");
		ReportGenerator titleCustomGenerator = new ReportGenerator(titleCustomComponent);
		String titleCustomReport = titleCustomGenerator.generateReport("Title Customized Report", "~~본문~~", "정재호", "sean11301997@gmail.com");
		System.out.println("[[Date Custom Report]]\n" + titleCustomReport + "\n\n\n");
	}
}

