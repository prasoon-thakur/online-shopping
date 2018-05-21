<div class="container mainBodyHeight">

	<div class="row">

		<!-- Sidebar -->
		<div class="col-lg-3">
			<%@include file="./layout/sidebar.jsp"%>
		</div>

		<!-- display products -->
		<div class="col-lg-9">
			
			<div class="col-sm-12">
			
			<!-- Added breadcrumb component -->
			  <c:if test="${userClickAllProducts == true}">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
					<li class="breadcrumb-item active">All Products</li>
				</ol>
			</c:if>	
			
			<c:if test="${userClickCategoryProducts == true}">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
					<li class=" breadcrumb-item active">Category</li>
					<li class="breadcrumb-item active">${category.name}</li>
				</ol>
			</c:if>
			
			</div>
			
		</div>

	</div>

</div>