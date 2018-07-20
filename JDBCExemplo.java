import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



 
class JDBCExemplo {
 
    private static final String url = "jdbc:mysql://192.168.25.37/projeto_pad";
 
    private static final String user = "PAD";
 
    private static final String password = "projeto";

   private static final String driver = "com.mysql.cj.jdbc.Driver";
 
    public static void main(String args[]) {
        Connection conn = null;
         
        try {
            Class.forName(driver).newInstance();
    conn = DriverManager.getConnection("jdbc:mysql://192.168.25.37/projeto_pad" + "user=PAD&password=projeto"  );
    System.out.println("sucesso");


    // Do something with the Connection


} catch (SQLException ex) {
    // handle any errors
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
}catch (Exception ex){
    System.out.println("ERRO: " + ex.getMessage());

}
    }
}



