<%@ taglib prefix="c" uri="jakarta.tags.core" %>


<%-- JSTL cho Java EE (javax), dùng với Tomcat 9 trở xuống --%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>

<html>
<body>
<h2> <% out.print("Hello World 12345!"); %></h2>
<c:out value="${'This is test c:out tag .........................'}" />
</body>
</html>
