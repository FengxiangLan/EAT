package db;

public class MySQLDBUtil {
	private static final String HOSTNAME = "localhost";
	private static final String POST_NUM = "3306";
	public static final String DB_NAME = "laiproject";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	public static final String URL = "jdbc:mysql://" + HOSTNAME + ":" + POST_NUM + "/" + DB_NAME + "?user=" + USERNAME + "&password=" + PASSWORD + "&autoreconnect=true&serverTimezone=UTC";
}
