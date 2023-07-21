package confirm.ch08;

public class DaoExample {
	public static void dbWokr(DataAcessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWokr(new OracleDao());
		dbWokr(new MySqlDao());

	}

}
