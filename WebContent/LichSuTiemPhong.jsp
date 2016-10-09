<%@page import="bean.LichSuTiemPhong"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>

<div class="grid_12">
	<!-- Example table -->
	<div class="module">
		<h2><span>Khách hàng</span></h2>
		<div class="module-table-body">
			<form action="">
			<table id="myTable" class="tablesorter">
				<thead>
					<tr>
						<th style="width:4%; text-align: center;">Mã Khách Hàng</th>
						<th>Tên Khách Hàng</th>
						<th style="width:20%">Tên Bệnh</th>
						<th style="width:20%">Mã Vắc Xin</th>
						<th style="width:20%">Tên Vắc Xin</th>
						<th style="width:20%">Số Mũi</th>
						
					</tr>
				</thead>
				<tbody>
				<%
				int tongsoMui =0;
				ArrayList<LichSuTiemPhong> alstp = (ArrayList<LichSuTiemPhong>)request.getAttribute("lichsutiemphong");
				for(LichSuTiemPhong ls:alstp){
					tongsoMui +=ls.getSoMui();
				%>
					<tr>
						<td><%=ls.getMaKH() %></td>
						<td><%=ls.getTenKH()%></td>
						<td><%=ls.getTenBenh() %></td>
						<td><%=ls.getMaVacXin() %></td>
						<td><%=ls.getTenVacXin() %></td>
						<td><%=ls.getSoMui() %></td>
					</tr>
					<%
					}
					%>
				   <tr>
				   <td>Tổng số mũi</td>
				   <td></td>
				   <td></td>
				   <td></td>
				   <td></td>
				   <td><%=tongsoMui %></td>
				   </tr>
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