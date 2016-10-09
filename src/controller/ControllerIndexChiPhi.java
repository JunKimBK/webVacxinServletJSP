package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelChiPhi;
import model.ModelVacXin;

/**
 * Servlet implementation class ControllerIndexChiPhi
 */
@WebServlet("/indexChiPhi")
public class ControllerIndexChiPhi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerIndexChiPhi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ModelChiPhi mdcp = new ModelChiPhi();
		//day di mot goi cho trang jsp INDEXVACXIN cho chinh trang controller goi co gia tri laf list VacXin va ten la "arraylistvacxin"
		request.setAttribute("chiphitang",mdcp.getList());
		RequestDispatcher rd = request.getRequestDispatcher("/indexChiPhi.jsp");
		rd.forward(request, response);
	}

}
