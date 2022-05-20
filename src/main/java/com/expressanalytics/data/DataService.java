package com.expressanalytics.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
	
	@Autowired
	private DataRepository dataRepository;
	
	public List<Data> getAllData(){
		List<Data> data = new ArrayList<>();
		dataRepository.findAll().forEach(data::add);
		return data;
	}
	public Optional<Data> getData(String id) {
		return dataRepository.findById(id);
	}
	public void addData(Data data) {
		dataRepository.save(data);
	}
	public void updateData(String id, Data data) {
		dataRepository.save(data);
	}
	public void deleteData(String id) {
		dataRepository.deleteById(id);
	}
	
}
