package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.VacXin;
import model.ModelVacXin;

/**
 * Servlet implementation class ControllerAdVacXin
 */
@WebServlet("/addVacXin")
public class ControllerAdVacXin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAdVacXin() {
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
		ModelVacXin mx = new ModelVacXin();
		if(request.getParameter("them")!=null){
			String tenVacxin = request.getParameter("tenVacXin");
			System.out.println(tenVacxin);
			int somuiVacXin = Integer.parseInt(request.getParameter("soMui"));
			String motaVacXin =request.getParameter("moTa");
			int giaVacxin = Integer.parseInt(request.getParameter("giaVacXin"));
			String tenHang = request.getParameter("tenHang");
			VacXin vx = new VacXin(0, tenVacxin, somuiVacXin, motaVacXin, giaVacxin, tenHang);
			if(mx.insertVacxin(vx)>0){
				response.sendRedirect(request.getContextPath()+"/indexVacxin");
			}else{
				response.sendRedirect(request.getContextPath()+"/addVacXin");//id 2
			}
		}
		//luc ban dau
		else{
			RequestDispatcher rd = request.getRequestDispatcher("/addVacXin.jsp");
			rd.forward(request, response);
		}
	}

}
