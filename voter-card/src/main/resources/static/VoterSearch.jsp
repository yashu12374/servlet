<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <title>Voter Card</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-light">

<<div class="container mt-5">
    <div class="d-flex justify-content-center mt-5">
        <div class=" center card shadow-lg p-4 "style="width: 650px">
            <h3 class="text-center mb-4">Voter Card Search</h3>

            <form action="search" method="get">

                <div class="mb-3">
                    <label class="form-label">Voter Name</label>
                    <input type="text" name="voterName" class="form-control w-60" placeholder="Enter voter name">
                </div>
                <div class="text-center">
                    <input type="submit" value="Search" class="btn btn-primary px-4">

                    <input type="submit" value="Clear" class="btn btn-primary px-4">
                </div>
                <c:if test="${dto != null}">
                    <p>Result : ${dto}</p>
                    <p>voterName: ${dto.voterName}</p>
                    <p><a href="edit?voterName=${dto.voterName}">Edit</a></p>
                </c:if>

                <c:if test="${not empty message}">
                    <span style="color:red;">${message}</span>
                </c:if>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="validation.js"></script>
</body>
</html>
