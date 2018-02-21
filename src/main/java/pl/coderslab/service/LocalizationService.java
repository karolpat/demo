package pl.coderslab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.coderslab.entity.Localization;
import pl.coderslab.repo.LocalizationRepo;

/**
 * @author karolpat
 *
 */
@Service
public class LocalizationService {

	@Autowired
	private LocalizationRepo localizationRepo;
	
	/** Method to create new localization when new room is created.
	 * @param localization - binded entity from thymeleaf form.
	 * @return saved location.
	 */
	public Localization newLocalization(Localization localization) {
		Localization tmp = localization;
		localizationRepo.save(tmp);
		return tmp;
	}
	
	/** Method to get all cities that are present in database.
	 * @return List of cities.
	 */
	public List<String> findAllCities(){
		return localizationRepo.findAllCities();
	}
}
