<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE html>
<html lang="vi">
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>${pageTitle}</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/bootstrap.min.css">

</head>

<body>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-2 p-0">
            <%@ include file="/WEB-INF/views/common/sidebar.jsp" %>
        </div>

        <div class="col-md-10 p-4">
            <jsp:include page="${content}" />
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>
</body>
</html>