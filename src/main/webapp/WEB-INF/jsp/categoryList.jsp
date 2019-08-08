<%--
  Created by IntelliJ IDEA.
  User: xzw
  Date: 2019/8/6
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <table>
        <thead>
            <th>类别ID</th>
            <th>类别名称</th>
            <th>父类</th>
            <th>类别状态</th>
            <th>创建时间</th>
            <th>修改时间</th>
            <th>操作</th>
        </thead>
    <c:forEach items="${category_list}" var="category">
        <tr>
            <th>${category.id}</th>
            <th>${category.name}</th>
            <th>${category.parentId}</th>
            <th>${category.status}</th>
            <th>${category.createTime}</th>
            <th>${category.updateTime}</th>
            <td><a href="update/${category.id}" >修改/</a>
                <a href="delete/${category.id}" >删除</a>
            </td>
        </tr>


    </c:forEach>
    </table>
</head>
<body>
<button onclick="category_add()">添加新的分类</button>
<script>
    function category_add() {
        location.href="http://localhost:8080/user/category/add";
    }

</script>


</body>
</html>
