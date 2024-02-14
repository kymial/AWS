

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySQLConnector {

	public static void main(String[] args) {
			// JDBC와 MySQL Connector를 이용하여 MySQL 연결
			// JDBC : Java Database Connectivity 
			// Java에서 데이터베이스와 연결 할 수 있도록 도움을 주는 Java API
			// Java에서 SQL 쿼리나 결과를 사용할 수 있도록 하는 방법을 제공
			
			
			try {
				
				
				// 1. 드라이버 로드
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				// 2. 데이터 베이스 연결
				final String URL = "jdbc:mysql://127.0.0.1:3306/real_estate";
				final String USER_NAME = "root";
				final String USER_PASSWORD = "root";
				
				Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
				
				
				// 3. SQL 구문 작성
				
				// 3-1. SQL INSERT 구문
//				String sql = "INSERT INTO email_authentication VALUES (?, ?)";

//				PreparedStatement preparedStatement = connection.prepareStatement(sql);
//				preparedStatement.setString(1, "galaxy@email.com");
//				preparedStatement.setString(2, "QWER");
				
				
//				String sql = "INSERT INTO user(user_id, password, email) VALUES (?, ?, ?)";

//				PreparedStatement preparedStatement = connection.prepareStatement(sql); //  이걸로 SQL에서 구문이 작성이 됨
//				preparedStatement.setString(1, "galaxy");
//				preparedStatement.setString(2, "1q2w3e4r");
//				preparedStatement.setString(3, "galaxy@email.com");
					
				
				// 3-2. SQL SELECT 구문
				String sql = "SELECT * FROM user";
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				while (resultSet.next()) {
					String id = resultSet.getString(1);
					String password = resultSet.getString(2);
					String email = resultSet.getString(3);
					
					System.out.println(id + " " + password + " " + email);
				}
					
				
//				// 4. 구문실행
//				int result = preparedStatement.executeUpdate(); // 이걸로 SQL에서 구문이 실행이 됨
//				// 구문이 실행되었을 경우 실패하면 0 성공하면 1이라는 결과가 나옴
//				if (result == 1) System.out.println("삽입 성공");
//				if (result == 0) System.out.println("삽입 실패");
				
			} 
			
			catch (Exception exception) {
				
				exception.printStackTrace();
				
			}
			


	}

}
