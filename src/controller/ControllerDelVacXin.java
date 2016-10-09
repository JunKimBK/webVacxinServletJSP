package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelVacXin;

/**
 * Servlet implementation class ControllerDelVacXin
 */
@WebServlet("/deleteVacxin")
public class ControllerDelVacXin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerDelVacXin() {
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
		ModelVacXin mx = new ModelVacXin();
		int vxID = Integer.parseInt(request.getParameter("VxID"));
		if(mx.delVacXin(vxID)>1){
			response.sendRedirect(request.getContextPath()+"/indexVacxin?msg=del1");
		}else{
			response.sendRedirect(request.getContextPath()+"/indexVacxin?msg=del0");
		}
	}

}
