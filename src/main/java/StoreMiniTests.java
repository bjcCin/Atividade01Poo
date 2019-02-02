import java.util.List;

import br.com.codenation.aceleradev.rec.loja.dao.ProductDAO;
import br.com.codenation.aceleradev.rec.loja.dao.UserDAO;
import br.com.codenation.aceleradev.rec.loja.model.Product;
import br.com.codenation.aceleradev.rec.loja.model.User;

public class StoreMiniTests {

	public static void main(String[] args) {
		User user;
		user = new UserDAO().findUser("23521765733");
		System.out.println(user.getName());
		
		List<Product> product = new ProductDAO().listProductsByCategory(0);
		
		System.out.println(product.size()+" "+product.get(0).getId());
		
		Product product2 = new ProductDAO().findProduct(11);
		System.out.println(product2.getId());
				

	}

}
