package krishna.dao;

import krishna.bo.CustomerBO;

public interface ICustomerDAO {

	public int save(CustomerBO bo) throws Exception;
}
