<%@page import="bean.VacXin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>
<!-- Form elements -->    
<div class="grid_12">

	<div class="module">

		 <h2><span>Thêm Vắc Xin</span></h2>
			
		 <div class="module-body">
			<form action="<%=request.getContextPath() %>/addVacXin" method="post"> <!-- id 3 -->
				<p>
					<label>Tên Vắc Xin</label>
					<input type="text" name="tenVacXin" value="" class="input-medium" />
				</p>
				<p>
					<label>Số mũi</label>
					<input type="text" name="soMui" value="" class="input-medium" />
				</p>
				<p>
					<label>Mô tả</label>
					<input type="text"  name="moTa" value="" class="input-medium" />
				</p>
				<p>
					<label>Giá Vắc Xin</label>
					<input type="text" name="giaVacXin" value="" class="input-medium" />
				</p>
				<p>
					<label>Tên Hàng</label>
					<input type="text" name="tenHang" value="" class="input-medium" />
				</p>
				<fieldset>
					<input class="submit-green" name="them" type="submit" value="Thêm" /> 
					<input class="submit-gray" name="reset" type="reset" value="Nhập Lại" />
				</fieldset>
			</form>
		 </div> <!-- End .module-body -->

	</div>  <!-- End .module -->
	<div style="clear:both;"></div>
</div> <!-- End .grid_12 -->
<%@include file="inc/footer.jsp" %> 