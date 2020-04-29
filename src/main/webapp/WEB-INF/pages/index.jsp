<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Prog.kiev.ua</title>

    </head>
    <body>
    <form role="form" class="form-horizontal" action="/add" method="post">
        <h3>New contact</h3>
        <input class="form-control form-group" type="text" name="name" placeholder="Name">
        <input class="form-control form-group" type="text" name="surname" placeholder="Surname">
        <input class="form-control form-group" type="text" name="phone" placeholder="Phone">
        <input type="submit" class="btn btn-primary" value="Add">
    </form>
    </body>
</html>