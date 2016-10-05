<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	
	
	<jsp:body>
	
	<h1>welcome <c:out value="${user.username}"></c:out>, </h1>
	<p>This is sample project Spring MVC Spring security and  mybaties for mysql connectivity</p>
	<p><b>note :</b> import sql file from src.main.resource:/META-INF/sql on your Database
	</p>
	<p>This is an open source project</p>
	
	</jsp:body>
</t:dashboard>
</html>