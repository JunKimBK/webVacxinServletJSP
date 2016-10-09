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
 * Servlet implementation class ControllerEditVacXin
 */
@WebServlet("/editVacXin")
public class ControllerEditVacXin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerEditVacXin() {
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
		int vxID = 0;
		if(request.getParameter("VxID")!=null){
			vxID = Integer.parseInt(request.getParameter("VxID"));
		}
		//id 1
		//neu nhan sua thi thuc hien
		if(request.getParameter("sua")!=null){
			String tenVacxin = request.getParameter("tenVacXin");
			System.out.println(tenVacxin);
			int somuiVacXin = Integer.parseInt(request.getParameter("soMui"));
			String motaVacXin =request.getParameter("moTa");
			int giaVacxin = Integer.parseInt(request.getParameter("giaVacXin"));
			String tenHang = request.getParameter("tenHang");
			VacXin vx = new VacXin(vxID, tenVacxin, somuiVacXin, motaVacXin, giaVacxin, tenHang);
			if(mx.updateVacxin(vx)>0){
				response.sendRedirect(request.getContextPath()+"/indexVacxin");
			}else{
				response.sendRedirect(request.getContextPath()+"/editVacXin?VxID="+vxID+"&msg=trungten");//id 2
			}
		}
		//luc ban dau
		else{
			request.setAttribute("suaVacXin", mx.getVacXin(vxID));
			RequestDispatcher rd = request.getRequestDispatcher("/editVacXin.jsp");
			rd.forward(request, response);
		}
	}

}
