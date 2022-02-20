<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Save Customer</title>

    <link type="text/css" rel="stylesheet" href="/css/style.css" />
    <link type="text/css" rel="stylesheet" href="/css/add-customer-style.css" />

</head>

<body>
    <div id="wrapper">
        <div id="header">
            <h2>CMR - Customer Relationship Manager</h2>
        </div>
    </div>

    <div id="container">
        <h3>Save Customer</h3>

        <form:form action="saveCustomer" modelAttribute="customer" method="POST">
            <form:hidden path="id" />

            <table>
                <tbody>
                    <tr>
                        <td><label>First Name:</label></td>
                        <td>
                            <form:input path="firstName" />
                        </td>
                    </tr>
                    <tr>
                        <td><label>Last Name:</label></td>
                        <td>
                            <form:input path="lastName" />
                        </td>
                    </tr>
                    <tr>
                        <td><label>Email:</label></td>
                        <td>
                            <form:input path="email" />
                        </td>
                    </tr>
                    <tr>
                        <td><label></label></td>
                        <td>
                            <input type="submit" value="Save" class="save" />
                        </td>
                    </tr>
                </tbody>


            </table>

        </form:form>

        <div style="clear: both;"></div>

        <p>
            <a href="/customer/list">Back to List</a>
        </p>

    </div>
</body>

</html>