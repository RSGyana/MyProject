package in.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.model.ShipmentType;
@Repository
public class ShipmentTypedaoImpl implements IShipmentTypedao {
@Autowired
private HibernateTemplate ht;

	
	public Integer saveShipmentType(ShipmentType ob) {
		
		return (Integer)ht.save(ob);
	}

}
