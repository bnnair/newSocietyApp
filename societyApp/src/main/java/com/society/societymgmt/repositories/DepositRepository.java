/**
 * 
 */
package com.society.societymgmt.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.society.societymgmt.model.Deposit;

/**
 * @author BIJUNAIR
 *
 */
@Repository
public interface DepositRepository extends PagingAndSortingRepository<Deposit, Integer> {

	List<Deposit> findByBuildingAndFlatNo(String building, String flatNo);
	
	
}
