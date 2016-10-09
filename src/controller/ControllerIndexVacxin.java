package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelVacXin;

/**
 * Servlet implementation class ControllerIndexVacxin
 */
@WebServlet("/indexVacxin")

public class ControllerIndexVacxin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerIndexVacxin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModelVacXin mv = new ModelVacXin();
		//day di mot goi cho trang jsp INDEXVACXIN cho chinh trang controller goi co gia tri laf list VacXin va ten la "arraylistvacxin"
		request.setAttribute("arraylistVacxin", mv.getList());
		RequestDispatcher rd = request.getRequestDispatcher("/indexVacxin.jsp");
		rd.forward(request, response);
	}

}
