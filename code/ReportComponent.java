package TermProjectFinal;

public interface ReportComponent {
	abstract String createCoverPage();
	abstract String createContentPage();
	abstract String createBackPage();
	
	abstract ReportDecorator createHeader();
	abstract ReportDecorator createFooter();
}
