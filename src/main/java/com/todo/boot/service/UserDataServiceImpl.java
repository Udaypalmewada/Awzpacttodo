package com.todo.boot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import com.todo.boot.TodoApplication;
import com.todo.boot.entity.Address;
import com.todo.boot.entity.City;
import com.todo.boot.entity.RegistrationModel;
import com.todo.boot.repository.IAddressRepository;
import com.todo.boot.repository.ICityRepository;
import com.todo.boot.repository.IRegistrationRepository;
import com.todo.boot.request.AddressRequest;
import com.todo.boot.request.CityRequest;
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
	private IAddressRepository  addressRepository;
	
	@Autowired
	private ICityRepository cityRepository;
	
	@Autowired
	private IAddressRepository addressReposity;
	private static final Logger LOGGER=LoggerFactory.getLogger(TodoApplication.class);

	public int saveUser(RegisterRequest register) {
		RegistrationModel registerModel = new RegistrationModel();
		registerModel.setName(register.getName());
		registerModel.setNumber(register.getNumber());
		registerModel.setEmail(register.getEmail());
		registerModel.setGender(register.getGender());
		registerModel.setStatus(register.isStatus());
		RegistrationModel model = Regirepositry.save(registerModel);
		if (null != model) {
			City city = cityRepository.findById(register.getCity().getId());

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
		LOGGER.error(" unable to register new employee{}", java.time.LocalDate.now());
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
	Page<RegistrationModel> findAll(Pageable pageRequest){
		
		return null;
		
	}
	
	
	@Override
	public boolean checkUserExistance(RegistrationModel register) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<RegisterRequest> listOfAllEmployee() {
		List<RegisterRequest>emplist=new ArrayList<>();
		List<RegistrationModel>list=Regirepositry.findAll();
		for(RegistrationModel r:list) {
			Address addrs=addressRepository.findByEmployee(r);
			RegisterRequest employee= new RegisterRequest();
			employee.setName(r.getName());
			employee.setNumber(r.getNumber());
			employee.setEmail(r.getEmail());
			employee.setGender(r.getGender());
			employee.setStatus(r.isStatus());
			City city=cityRepository.findById(addrs.getCity().getId());
			CityRequest crq=new CityRequest();
			crq.setId(city.getId());
			crq.setName(city.getCityName());
			AddressRequest adr=new AddressRequest();
			adr.setAddress(addrs.getAddress());
			employee.setAddress(adr);
			employee.setCity(crq);
			emplist.add(employee);
			
		}
		if (emplist.size()<0) {
			return null;
		}
		
		return emplist;
	}

}
