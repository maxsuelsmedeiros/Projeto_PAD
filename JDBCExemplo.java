import java.sql.Connection;
import java.sql.DriverManager;
 
class JDBCExemplo {
 
    private static final String url = "jdbc:mysql://192.168.25.37/3306/Projeto_PAD";
 
    private static final String user = "root";
 
    private static final String password = "novasenha";
 
    public static void main(String args[]) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Success");
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}