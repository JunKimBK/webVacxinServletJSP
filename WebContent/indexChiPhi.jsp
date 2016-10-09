<%@page import="bean.ChiPhi"%>
<%@page import="bean.VacXin"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>

<div class="grid_12">
	<!-- Example table -->
	<div class="module">
		<h2><span>Danh sách Chi phí tiêm vắc xin</span></h2>
		
		<div class="module-table-body">
			<form action="">
			<table id="myTable" class="tablesorter">
				<thead>
					<tr>
						<th style="width:4%; text-align: center;">Mã Khách Hàng</th>
						<th>Tên Khách Hàng</th>
						<th style="width:20%">Chi Phí </th>
				</thead>
				<tbody>
				<%
					ArrayList<ChiPhi> alChiPhi = (ArrayList<ChiPhi>)request.getAttribute("chiphitang");
					for(ChiPhi cp:alChiPhi){
				%>
					<tr>
						<td><a href=""><%=cp.getMaKH() %></a></td>
						<td><%=cp.getHoTenKH() %></td>
						<td><%=cp.getChiPhi() %></td>
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