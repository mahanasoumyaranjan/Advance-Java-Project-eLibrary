package elibrary;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if(UserDao.validate(email, password)){
			request.getRequestDispatcher("User2").include(request, response);
		}else{
			out.println("<p style='color:red;font-size:30px;'>Email or Password is invalid</p>");
			out.println("<a href='index.html' style='font-size:30px; text-decoration:none;'>Please Login Again</a>");
		}
		out.close();
	}
}
