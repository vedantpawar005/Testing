import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class NewServlet extends HttpServlet
{
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException
{
 response.setContentType("text/html;charset=UTF-8");
 try (PrintWriter out = response.getWriter())
{
 out.println("<!DOCTYPE html>");
 out.println("<html>");
 out.println("<head>");
 out.println("<title>Servlet NewServlet</title>");
 out.println("</head>");
 out.println("<body>");
 HttpSession session = request.getSession();
 String user =(String)session.getAttribute("user");
 String id = session.getId();
 out.println("User Session ID = "+id);
 out.println("</body>");
 out.println("</html>");
}
}
}