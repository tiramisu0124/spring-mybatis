<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>员工列表示例</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>工资</td>
            <td>入职时间</td>
        </tr>
        <c:forEach items="${emps}" var="emp">
            <tr>
                <td>${emp.empno}</td>
                <td>${emp.ename}</td>
                <td>${emp.sal}</td>
                <td><fmt:formatDate value="${emp.hiredate}" pattern="yyyy-MM-dd"/></td>

            </tr>
        </c:forEach>
    </table>
</body>
</html>