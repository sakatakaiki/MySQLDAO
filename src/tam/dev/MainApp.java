package tam.dev;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import tam.dev.data.impl.CategoryImpl;
import tam.dev.data.dao.CategoryDao;
import tam.dev.data.model.Category;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryDao categoryDao = new CategoryImpl();
		//Insert category
//		Category cat = new Category("Ao canh","Mo ta 3");
//		categoryDao.insert(cat);
		//Find category
//        Category findCat = categoryDao.find(1);
//		Category findCat = categoryDao.find(2);
//		System.out.println("Category found: " + findCat.getName());
		//Update category
//		findCat.setName("Ao lua");
//		categoryDao.update(findCat);
		//Delete category
//		categoryDao.delete(4);
		//Find all categories
		List<Category> allCats = categoryDao.findAll();
		for (Category category : allCats) {
            System.out.println("Id: "+category.getId()+"; Ten: "+ category.getName()+"; Mo ta: "+ category.getDescription());
        }
		
	}
	
	
	
}
