<%@page import="bean.KhachHang"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>

<div class="grid_12">
	<!-- Example table -->
	<div class="module">
		<h2><span>Danh sách KH</span></h2>
		<div class="module-table-body">
			<form action="">
			<table id="myTable" class="tablesorter">
				<thead>
					<tr>
						<th style="width:4%; text-align: center;">Mã Khách Hàng</th>
						<th>Tên Khách Hàng</th>
						<th style="width:20%">Số Điện Thoai</th>
						<th style="width:20%">Địa Chỉ</th>
						<th style="width:20%">Ngày Sinh</th>
						<th style="width:20%">Giới Tính</th>
						
					</tr>
				</thead>
				<tbody>
				<%
				ArrayList<KhachHang> alkh = (ArrayList<KhachHang>)request.getAttribute("alkh");
				for(KhachHang kh:alkh){
				%>
					<tr>
						<td><a href=""><%=kh.getMaKH() %></a></td>
						<td><a href="<%=request.getContextPath()%>/LichSuTiemPhong?khId=<%=kh.getMaKH()%>"><%=kh.getHoTenKH() %></a></td>
						<td><%=kh.getSoDienThoaiKH() %></td>
						<td><%=kh.getDiaChiKH() %></td>
						<td><%=kh.getNgaySinhKH() %></td>
						<td><%=kh.getGioiTinhKH() %></td>
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