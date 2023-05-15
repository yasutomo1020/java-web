/**
 * 
 */
package server;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yasut
 *
 */
@WebServlet("/test")
public class Server extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Server() {
        super();
        // TODO Auto-generated constructor stub
    }
    //getメソッドで呼び出された場合の処理
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//文字コードの設定
    	request.setCharacterEncoding("UTF-8");
    	//jspから値を取得
    	String name = request.getParameter("name");
    	String pass = request.getParameter("pass");
    	//値をセット
    	request.setAttribute("name", name);
    	request.setAttribute("pass", pass);
    	//画面遷移
    	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/test.jsp");
    	rd.forward(request, response);
    }
    //postメソッドで呼び出された場合の処理
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//文字コードの設定
    	request.setCharacterEncoding("UTF-8");
    	//jspから値を取得
    	String name = request.getParameter("name");
    	String pass = request.getParameter("pass");
    	//値をセット
    	request.setAttribute("name", name);
    	request.setAttribute("pass", pass);
    	//画面遷移
    	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/test.jsp");
    	rd.forward(request, response);
    }
}   

