package hu.unideb.inf.universe.service;

import java.util.List;

import hu.unideb.inf.universe.exception.UniverseException;
import hu.unideb.inf.universe.model.Comet;
import hu.unideb.inf.universe.model.Galaxy;
import hu.unideb.inf.universe.model.Mineral;
import hu.unideb.inf.universe.model.Moon;
import hu.unideb.inf.universe.model.Planet;
import hu.unideb.inf.universe.model.Property;
import hu.unideb.inf.universe.model.SolarSystem;
import hu.unideb.inf.universe.model.Star;

public interface UniverseService {

	boolean validate();

	List<Galaxy> findAllGalaxies() throws UniverseException;

	List<SolarSystem> findAllSolarSystemsInGalaxy(Galaxy galaxy) throws UniverseException;

	List<Planet> findAllPlanetsInSolarSystem(SolarSystem solarSystem) throws UniverseException;

	List<Comet> findAllCometsInSolarSystem(SolarSystem solarSystem) throws UniverseException;

	List<Moon> findAllMoonsAroundPlanet(Planet planet) throws UniverseException;

	List<Mineral> findAllMineralsInComet(Comet comet) throws UniverseException;

	Planet findPlanetByName(String planetName) throws UniverseException;

	Moon findMoonByName(String moonName) throws UniverseException;

	Comet findCometByName(String cometName) throws UniverseException;

	Star findStarInSolarSystem(SolarSystem solarSystem) throws UniverseException;

	Mineral findMineralByComet(String cometName, String mineralName) throws UniverseException;

	Comet findCometBySolarSystem(String solarSystemName, String cometName) throws UniverseException;

	SolarSystem findSolarSystemByName(String solarSystemName) throws UniverseException;
	
	Galaxy findGalaxyByName(String galaxyName) throws UniverseException;
	
	Double avgOrbitalSpeedOfPlanetsThatHaveMoonsWithRadiusBetween(double lowerBound, double upperBound) throws UniverseException;
	
	List<Comet> cometsThatHaveMoreThanOneMineralOrderedByQuantitySumDesc() throws UniverseException;
	
	List<SolarSystem> findSmallPlanetsGroupedBySolarSystem(double upperBound) throws UniverseException;

	void deleteMineralOnComet(String cometName, String mineralName) throws UniverseException;

	void deleteComet(String cometName) throws UniverseException;

	void deleteMoon(String moonName) throws UniverseException;

	void deletePlanet(String planetName) throws UniverseException;

	void deleteSolarSystem(String solarSystemName) throws UniverseException;

	void deleteGalaxy(String galaxyName) throws UniverseException;

	void updatePlanetRadius(String planetName, Property newRadius) throws UniverseException;

	void updateMoonRadius(String moonName, Property newRadius) throws UniverseException;

	void updateMineralOnComet(String cometName, String mineralName, Mineral newMineral) throws UniverseException;

	void updateCometOrbitalPeriod(String cometName, Property newOrbitalPeriodProperty) throws UniverseException;
	
	void updateComet(String oldCometName, Comet newComet) throws UniverseException;
	
	void updateStarInSolarSystem(String solarSystemName, Star star) throws UniverseException;
	
	void updatePlanet(String planetName, Planet planet) throws UniverseException;

	void updateMoonForPlanet(String moonName, String planetName, Moon moon) throws UniverseException;
	
	void updateGalaxy(String galaxyName, Galaxy galaxy) throws UniverseException;
	
	void updateGalaxyName(String oldGalaxyName, String newGalaxyName) throws UniverseException;
	
	void updateSolarSystem(String oldSolarSystemName, SolarSystem newSolarSystem) throws UniverseException;
	
	void updateSolarSystemName(String oldSolarSystemName, String newSolarSystemName) throws UniverseException;

	void addMineralToComet(String cometName, String mineralName, Property quantity) throws UniverseException;

	void addCometToSolarSystem(String solarSystemName, String cometName, Property orbitalPeriod) throws UniverseException;

	void addMoonToPlanet(String planetName, String moonName, Property radius) throws UniverseException;

	void addPlanetToSolarSystem(String solarSystemName, String planetName, Property radius, Property orbitalPeriod, Property orbitalSpeed,
			Property eccentricity, Property semiMajorAxis, Property mass) throws UniverseException;

	void addSolarSystemToGalaxy(String galaxyName, String solarSystemName, String starName, String starType) throws UniverseException;

	void addGalaxyToUniverse(String galaxyName) throws UniverseException;
}
