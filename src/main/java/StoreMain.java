import java.sql.SQLException;

import br.com.codenation.aceleradev.rec.loja.dao.UserDAO;
import br.com.codenation.aceleradev.rec.loja.model.User;

public class StoreMain {

	public static void main(String[] args) {
		User user;
		user = new UserDAO().findUser("23521765733");
		System.out.println(user.getName());

	}

}
