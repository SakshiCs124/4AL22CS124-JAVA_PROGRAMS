<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Coffee Records</title>
</head>
<body>
    <h2>Inserting Coffee Product...</h2>
    <%
        String id = request.getParameter("id");
        String name = request.getParameter("coffee_name");
        String price = request.getParameter("price");

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "your_password");
            stmt = con.createStatement();

            // Insert new record
            String insertSQL = "INSERT INTO coffee VALUES (" + id + ", '" + name + "', " + price + ")";
            stmt.executeUpdate(insertSQL);

            out.println("<p style='color:green;'>Record inserted successfully!</p>");

            // Display all records
            out.println("<h3>All Coffee Products:</h3>");
            rs = stmt.executeQuery("SELECT * FROM coffee");

            out.println("<table border='1'>");
            out.println("<tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");
            while (rs.next()) {
                out.println("<tr><td>" + rs.getInt("id") + "</td><td>" +
                            rs.getString("coffee_name") + "</td><td>" +
                            rs.getDouble("price") + "</td></tr>");
            }
            out.println("</table>");

        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        }
    %>
    <br><a href="insert.html">Add another coffee</a>
</body>
</html>
