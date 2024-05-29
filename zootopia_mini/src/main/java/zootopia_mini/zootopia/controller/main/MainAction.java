package zootopia_mini.zootopia.controller.main;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import zootopia_mini.zootopia.controller.action.Action;

public class MainAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/main.jsp").forward(request, response);
	}

}
