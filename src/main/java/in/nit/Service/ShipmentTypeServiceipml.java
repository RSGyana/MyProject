package in.nit.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IShipmentTypedao;
import in.nit.model.ShipmentType;
@Service
public class ShipmentTypeServiceipml implements IShipmentTypeService {
@Autowired
	private IShipmentTypedao dao;

    @Transactional
	public Integer saveShipmentType(ShipmentType ob) {
	
	return dao.saveShipmentType(ob);
	}

}
