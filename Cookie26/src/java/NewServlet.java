import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class NewServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter o = response.getWriter();
String n=request.getParameter("first");
String v=request.getParameter("second");
Cookie c = new Cookie(n,v);
c.setMaxAge(6000);
response.addCookie(c);
o.println(" <h1> Cookie Created Successfully </h1> ");
o.close();
}
}