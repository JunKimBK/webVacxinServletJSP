<%@page import="bean.VacXin"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>
<div class="bottom-spacing">
	  <!-- Button -->
	  <div class="float-left">
		  <a href="addVacXin.jsp" class="button">
			<span>Thêm Vắc Xin <img src="<%=request.getContextPath() %>/images/plus-small.gif" alt="Thêm Vắc Xin"></span>
		  </a>
	  </div>
	  <div class="clear"></div>
</div>

<div class="grid_12">
	<!-- Example table -->
	<div class="module">
	<%
	if(request.getParameter("msg")!=null){
		String msg = request.getParameter("msg");
		if("del1".equals(msg)){
			out.print("Xóa Vắc Xin thành công!");
		}else{
			out.print("Xóa Vắc Xin không thành công!");
		}
	}
	%>
		<h2><span>Danh sách Vắc Xin</span></h2>
		
		<div class="module-table-body">
			<form action="">
			<table id="myTable" class="tablesorter">
				<thead>
					<tr>
						<th style="width:4%; text-align: center;">Mã Vắc Xin</th>
						<th>Tên Vắc Xin</th>
						<th style="width:20%">Số Mũi</th>
						<th style="width:20%">Mô Tả</th>
						<th style="width:20%">Giá Vắc Xin</th>
						<th style="width:20%">Tên Hàng</th>
						<th style="width:11%; text-align: center;">Chức năng</th>
					</tr>
				</thead>
				<tbody>
				<%
					ArrayList<VacXin> alVacXin = (ArrayList<VacXin>)request.getAttribute("arraylistVacxin");
				for(VacXin vx:alVacXin){
				%>
					<tr>
						<td><a href=""><%=vx.getMaVacxin() %></a></td>
						<td><%=vx.getTenVacxin() %></td>
						<td><%=vx.getSomuiVacXin() %></td>
						<td><%=vx.getMotaVacXin() %></td>
						<td><%=vx.getGiaVacxin() %></td>
						<td><%=vx.getTenHang() %></td>
						<td align="center">
							<a href="<%=request.getContextPath() %>/editVacXin?VxID=<%=vx.getMaVacxin()%>">Sửa <img src="<%=request.getContextPath() %>/images/pencil.gif" alt="edit" /></a>
							<a href="<%=request.getContextPath() %>/deleteVacxin?VxID=<%= vx.getMaVacxin()%>">Xóa <img src="<%=request.getContextPath() %>/images/bin.gif" width="16" height="16" alt="delete" /></a>
						</td>
					</tr>
					<%
					}
					%>
					
				</tbody>
			</table>
			</form>
		 </div> <!-- End .module-table-body -->
	</div> <!-- End .module -->
		 <div class="pagination">           
			<div class="numbers">
				<span>Trang:</span> 
				<a href="">1</a> 
				<span>|</span> 
				<a href="">2</a> 
				<span>|</span> 
				<span class="current">3</span> 
				<span>|</span> 
				<a href="">4</a> 
				<span>|</span> 
				<a href="">5</a> 
				<span>|</span> 
				<a href="">6</a> 
				<span>|</span> 
				<a href="">7</a>
				<span>|</span> 
				<a href="">8</a> 
				<span>|</span> 
				<a href="">9</a>
				<span>|</span> 
				<a href="">10</a>   
			</div> 
			<div style="clear: both;"></div> 
		 </div>
	
</div> <!-- End .grid_12 -->
<%@include file="inc/footer.jsp" %> 