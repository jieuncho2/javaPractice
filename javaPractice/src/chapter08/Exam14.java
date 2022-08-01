package chapter08;

abstract class HttpServlet {
	public abstract void service();
}

public class LoginServlet extends HttpServlet {

	@Override
	public void service() {
		// TODO Auto-generated method stub

	}

}

public class FileDownloadServlet extends HttpServlet {

	@Override
	public void service() {
		// TODO Auto-generated method stub

	}

}

public class Exam14 {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());

	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
