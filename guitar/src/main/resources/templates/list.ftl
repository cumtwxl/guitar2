<html>
<head>
    <title>
        guitar
    </title>
</head>
<body>
<form action="/add" method="post">
    <table>
        <thead>
        <th>名称</th>
        <th>价格</th>
        <th>颜色</th>
        <th>大小</th>
        <th>操作</th>
        </thead>
        <tbody>
        <tr>
            <td><input type="text" name="name"></td>
            <td><input type="text" name="price"></td>
            <td><input type="text" name="color"></td>
            <td><input type="text" name="size"></td>
            <td><input type="submit" value="添加"></td>
        </tr>
        </tbody>
    </table>
</form>

<form action="/findByName">
    根据名称查询：<input type="text" name="name"> <input type="submit" value="查询">
</form>

<table>
    <thead>
    <th>名称</th>
    <th>价格</th>
    <th>颜色</th>
    <th>大小</th>
    <th>操作</th>
    </thead>
    <tbody>
        <#list list as guitar>
        <tr>
            <td>${guitar.name}</td>
            <td>${guitar.price}</td>
            <td>${guitar.color}</td>
            <td>${guitar.size}</td>
            <td><a href="/delete/${guitar.id}">删除</a></td>
        </tr>
        </#list>
    </tbody>
</table>
</body>

</html>