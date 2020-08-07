package com.todo.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.todo.boot.entity.Address;
import com.todo.boot.entity.City;
import com.todo.boot.entity.RegistrationModel;
import com.todo.boot.repository.IAddressRepository;
import com.todo.boot.repository.ICityRepository;
import com.todo.boot.repository.IRegistrationRepository;
import com.todo.boot.request.RegisterRequest;

/** UserDataServiceImpl
 * @author UDAY JAVA
 * UserDataServiceImpl implentation for registation of new user
 */
@Repository
public class UserDataServiceImpl implements IUserDataService {
	@Autowired
	private IRegistrationRepository Regirepositry;

	@Autowired
	private ICityRepository cityRepository;
	@Autowired
	private IAddressRepository addressReposity;

	public int saveUser(RegisterRequest register) {
		RegistrationModel registerModel = new RegistrationModel();
		registerModel.setName(register.getName());
		registerModel.setNumber(register.getNumber());
		registerModel.setEmail(register.getEmail());
		registerModel.setGender(register.getGender());
		registerModel.setStatus(register.isStatus());
		RegistrationModel model = Regirepositry.save(registerModel);
		if (null != model) {
			City city = cityRepository.findCityById(register.getCity().getId());

			Address addr = new Address();
			addr.setCity(city);
			addr.setAddress(register.getAddress().getAddress());
			addr.setDepartmentId(register.getDepartment());
			addr.setEmployee(model);
			Address addrs = addressReposity.save(addr);

			if (null != addrs) {
				return 1;
			}
		}
    return 0;
	}

	/* (non-Javadoc)
	 * @see com.todo.boot.service.IUserDataService#listOfAllUsers()
	 */
	public List listOfAllUsers() {
		List list = Regirepositry.findAll();
		if (!list.isEmpty()) {
			return list;
		}
		return null;

	}

	@Override
	public boolean checkUserExistance(RegistrationModel register) {
		// TODO Auto-generated method stub
		return false;
	}

}
