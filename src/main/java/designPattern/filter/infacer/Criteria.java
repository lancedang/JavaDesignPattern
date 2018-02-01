package designPattern.filter.infacer;

import java.util.List;

import designPattern.filter.entity.Person;

public interface Criteria {
	//public <K> K[] meetCriteria(K[] kes);
	public List<Person> meetCriteria(List<Person> persons); 
}
