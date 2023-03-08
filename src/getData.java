import java.sql.*;
import java.util.ArrayList;

public class getData{

    private String MySQL_username = "root";
    private String  MySQL_password = "2796719916Lgh";
    private String MySQL_driver = "com.mysql.cj.jdbc.Driver";
    private String MySQL_url = "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8&serverTimezone=UTC";
    private ArrayList<User> list = new ArrayList<User>();


    public getData(){
        try {
            Class.forName( MySQL_driver);
            Connection con = DriverManager.getConnection( MySQL_url, MySQL_username,  MySQL_password);
            String sql = "select * from user";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                list.add(new User(rs.getInt("id"), rs.getString("username"), rs.getString("password")));
            }

            rs.close();
            statement.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Boolean login(String username, String password) throws SQLException {
        Boolean n=false;
            for (User u:list){
                if (u.getUserName().equals(username)){
                    n=true;
                }
            }
            return n;
    }




}
