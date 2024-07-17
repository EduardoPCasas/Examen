package com.personajes.springboot.web.app.model;

import java.util.List;

public class PersonajeHP {

	private String id = "";

	private String name = "";

	private List<String> alternativeNames;

	private String species = "";

	private String gender = "";

	private String dateOfBirth = "";

	private Integer yearOfBitrh = 0;

	private boolean wizard = false;

	private String ancestry = "";

	private String eyeColour = "";

	private String hairColour = "";

	private Varita wand;

	private String patronus = "";

	private String hogwartsStudent = "";

	private String hogwartsStaff = "";

	private String actor = "";

	private List<String> alternate_actors;

	private boolean alive = false;

	private String image = "";
	
	private String house = "";

	public PersonajeHP(String id, String name, List<String> alternativeNames, String species, String gender,
			String dateOfBirth, Integer yearOfBitrh, boolean wizard, String ancestry, String eyeColour,
			String hairColour, Varita wand, String patronus, String hogwartsStudent, String hogwartsStaff,
			String actor, List<String> alternate_actors, boolean alive, String image) {
		super();
		this.id = id;
		this.name = name;
		this.alternativeNames = alternativeNames;
		this.species = species;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.yearOfBitrh = yearOfBitrh;
		this.wizard = wizard;
		this.ancestry = ancestry;
		this.eyeColour = eyeColour;
		this.hairColour = hairColour;
		this.wand = wand;
		this.patronus = patronus;
		this.hogwartsStudent = hogwartsStudent;
		this.hogwartsStaff = hogwartsStaff;
		this.actor = actor;
		this.alternate_actors = alternate_actors;
		this.alive = alive;
		this.image = image;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public PersonajeHP() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAlternativeNames() {
		return alternativeNames;
	}

	public void setAlternativeNames(List<String> alternativeNames) {
		this.alternativeNames = alternativeNames;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getYearOfBitrh() {
		return yearOfBitrh;
	}

	public void setYearOfBitrh(Integer yearOfBitrh) {
		this.yearOfBitrh = yearOfBitrh;
	}

	public boolean isWizard() {
		return wizard;
	}

	public void setWizard(boolean wizard) {
		this.wizard = wizard;
	}

	public String getAncestry() {
		return ancestry;
	}

	public void setAncestry(String ancestry) {
		this.ancestry = ancestry;
	}

	public String getEyeColour() {
		return eyeColour;
	}

	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}

	public String getHairColour() {
		return hairColour;
	}

	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}

	public Varita getWand() {
		return wand;
	}

	public void setWand(Varita wand) {
		this.wand = wand;
	}

	public String getPatronus() {
		return patronus;
	}

	public void setPatronus(String patronus) {
		this.patronus = patronus;
	}

	public String getHogwartsStudent() {
		return hogwartsStudent;
	}

	public void setHogwartsStudent(String hogwartsStudent) {
		this.hogwartsStudent = hogwartsStudent;
	}

	public String getHogwartsStaff() {
		return hogwartsStaff;
	}

	public void setHogwartsStaff(String hogwartsStaff) {
		this.hogwartsStaff = hogwartsStaff;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public List<String> getAlternate_actors() {
		return alternate_actors;
	}

	public void setAlternate_actors(List<String> alternate_actors) {
		this.alternate_actors = alternate_actors;
	}

	public boolean getAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "PersonajeHP [id=" + id + ", name=" + name + ", alternativeNames=" + alternativeNames + ", species="
				+ species + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", yearOfBitrh=" + yearOfBitrh
				+ ", wizard=" + wizard + ", ancestry=" + ancestry + ", eyeColour=" + eyeColour + ", hairColour="
				+ hairColour + ", wand=" + wand + ", patronus=" + patronus + ", hogwartsStudent=" + hogwartsStudent
				+ ", hogwartsStaff=" + hogwartsStaff + ", actor=" + actor + ", alternate_actors=" + alternate_actors
				+ ", alive=" + alive + ", image=" + image + "]";
	}

}
