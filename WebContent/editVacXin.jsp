<%@page import="bean.VacXin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>
<!-- Form elements -->    
<div class="grid_12">

	<div class="module">
	<%
		VacXin vx = (VacXin)request.getAttribute("suaVacXin");
	
	%>
		 <h2><span>Sửa Vắc Xin</span></h2>
			
		 <div class="module-body">
			<form action="<%=request.getContextPath() %>/editVacXin?VxID=<%=vx.getMaVacxin() %>" method="post"> <!-- id 3 -->
				<p>
					<label>Tên Vắc Xin</label>
					<input type="text" name="tenVacXin" value="<%=vx.getTenVacxin() %>" class="input-medium" />
				</p>
				<p>
					<label>Số mũi</label>
					<input type="text" name="soMui" value="<%=vx.getSomuiVacXin() %>" class="input-medium" />
				</p>
				<p>
					<label>Mô tả</label>
					<input type="text"  name="moTa" value="<%=vx.getMotaVacXin() %>" class="input-medium" />
				</p>
				<p>
					<label>Giá Vắc Xin</label>
					<input type="text" name="giaVacXin" value="<%=vx.getGiaVacxin() %>" class="input-medium" />
				</p>
				<p>
					<label>Tên Hàng</label>
					<input type="text" name="tenHang" value="<%=vx.getTenHang() %>" class="input-medium" />
				</p>
				<fieldset>
					<input class="submit-green" name="sua" type="submit" value="Sửa" /> 
					<input class="submit-gray" name="reset" type="reset" value="Nhập Lại" />
				</fieldset>
			</form>
		 </div> <!-- End .module-body -->

	</div>  <!-- End .module -->
	<div style="clear:both;"></div>
</div> <!-- End .grid_12 -->
<%@include file="inc/footer.jsp" %> 