package zootopia_mini.zootopia.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import zootopia_mini.zootopia.controller.action.Action;
import zootopia_mini.zootopia.controller.action.ActionFactory;

import java.io.IOException;

@MultipartConfig(
			fileSizeThreshold = 1024*1024, maxFileSize = 1024*1024*5, maxRequestSize = 1024*1024*5*5
		)
public class ZootopiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ZootopiaServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String command = request.getParameter("command");
		
		if(command == null) System.out.print("commnad 값오류");
		ActionFactory af =  ActionFactory.getInstance();
		Action ac = af.getAction(command);
		if(ac == null) System.out.print("ActionFactory 값오류");
		ac.execute(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
