package datastructure;
import java.sql.*;

public class UseMap {

	//public static void main(String[] args) throws SQLException {
		public void data()throws SQLException, SQLException {
			String userName = "postgres";
			String password = "3141";
			String url = "jdbc:postgresql://localhost:5432/blue";
			String query = "SELECT actor_id, first_name, last_name FROM public.actor limit 20;";
			Connection connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(query);
			resultSet.next();
			System.out.println(resultSet.getString("first_name"));
		}
}
		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * You can use any other retrieval process
		 * Use any databases[ Postgresql] to store data and retrieve data.
		 */

