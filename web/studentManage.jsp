<%--
  Created by IntelliJ IDEA.
  User: 林柳柳
  Date: 2017/12/17
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>学生管理</title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="generator" content="" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
    <link href="${pageContext.request.contextPath}/css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
    <link href="${pageContext.request.contextPath}/css/print.css" rel="stylesheet" type="text/css"  media="print" />
    <script src="${pageContext.request.contextPath}/js/jquery-1.10.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/side.js" type="text/javascript"></script>

    <!--[if lt IE 9]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
    <![endif]-->
</head>

<body>


<!-- MainForm -->
<div id="MainForm">
    <div class="form_boxA">
        <h2>学生信息列表</h2>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th>序号</th>
                <th>学生姓名</th>
                <th>性别</th>
                <th>专业</th>
                <th>电话</th>
                <th>学院名</th>
                <th>操作</th>
            </tr>
           <c:forEach items="${requestScope.studentList}" var="x">
            <tr>
                <td>${x.id}</td>
                <td>${x.studentname}</td>
                <td>${x.sex}</td>
                <td>${x.major}</td>
                <td>${x.phone}</td>
                <td>${x.college.collegename}</td>
                <td><a href="${pageContext.request.contextPath}/student_toUpdate.action?id=${x.id}">修改</a> | <a href="${pageContext.request.contextPath}/student_deleteOne.action?id=${x.id}" onclick="javascript:return confirm('确认删除？')">删除</a></td>
            </tr>
            </c:forEach>
            <tr>
                <td colspan="7"><a href="${pageContext.request.contextPath}/addStudent.jsp">添加学生</a></td>
            </tr>
        </table>
        <p class="msg"><a>首页</a><a>上一页</a><a>下一页</a><a>末页</a></p>
    </div>
</div>
<!-- /MainForm -->

</body>
</html>
