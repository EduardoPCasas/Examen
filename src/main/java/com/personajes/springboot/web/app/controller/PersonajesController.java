package com.personajes.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.personajes.springboot.web.app.model.PersonajeHP;
import com.personajes.springboot.web.app.model.Varita;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Controller
@RequestMapping("/personajes")
public class PersonajesController {

	@GetMapping("/getPersonajes")
	public String index(Model model) {
		String url = "https://hp-api.onrender.com/api/characters";
		String personajes = "";
		Client client = ClientBuilder.newClient();
		List<PersonajeHP> lista = new ArrayList<>();
		
		Response response = client.target(url)
							.request(MediaType.APPLICATION_JSON)
							.get(Response.class);

		personajes = personajes + response.readEntity(String.class);

		JsonArray gsonArr = (JsonArray) JsonParser.parseString(personajes);

		for(JsonElement obj : gsonArr) {
			JsonObject gsonObj = obj.getAsJsonObject();
			PersonajeHP personaje = new PersonajeHP();
			Varita var = new Varita();
			List<String> listNames = new ArrayList<>();
			List<String> listActors = new ArrayList<>();
			
			if(!gsonObj.get("id").isJsonNull()) {
				personaje.setId(gsonObj.get("id").getAsString());
			}
			if(!gsonObj.get("name").isJsonNull()) {
				personaje.setName(gsonObj.get("name").getAsString());
			}
			if(!gsonObj.get("actor").isJsonNull()) {
				personaje.setActor(gsonObj.get("actor").getAsString());
			}
			//Agregamos el objeto varita
			JsonObject gsonObjW = gsonObj.get("wand").getAsJsonObject();
			if(!gsonObjW.get("wood").isJsonNull()) {
				var.setWood(gsonObjW.get("wood").getAsString());
			}
			if(!gsonObjW.get("core").isJsonNull()) {
				var.setCore(gsonObjW.get("core").getAsString());
			}
			if(!gsonObjW.get("length").isJsonNull()) {
				var.setLength(gsonObjW.get("length").getAsString());
			}
			//
			if(gsonObj.get("alternate_names") != null) {
				JsonArray arrNames = gsonObj.get("alternate_names").getAsJsonArray();
				for(int i = 0; i < arrNames.size(); i++) {
					listNames.add(arrNames.get(i).getAsString());
				}
			}
			if(!gsonObj.get("species").isJsonNull()) {
				personaje.setSpecies(gsonObj.get("species").getAsString());
			}
			
			if(!gsonObj.get("gender").isJsonNull()) {
				personaje.setGender(gsonObj.get("gender").getAsString());
			}
			
			if(!gsonObj.get("house").isJsonNull()) {
				personaje.setHouse(gsonObj.get("house").getAsString());
			}
			
			if(!gsonObj.get("dateOfBirth").isJsonNull()) {
				personaje.setDateOfBirth(gsonObj.get("dateOfBirth").getAsString());
			}
			
			if(!gsonObj.get("yearOfBirth").isJsonNull()) {
				personaje.setYearOfBitrh(gsonObj.get("yearOfBirth").getAsInt());
			}
			
			if(!gsonObj.get("wizard").isJsonNull()) {
				personaje.setWizard(gsonObj.get("wizard").getAsBoolean());
			}
			
			if(!gsonObj.get("ancestry").isJsonNull()) {
				personaje.setAncestry(gsonObj.get("ancestry").getAsString());
			}
			
			if(!gsonObj.get("eyeColour").isJsonNull()) {
				personaje.setEyeColour(gsonObj.get("eyeColour").getAsString());
			}
			
			if(!gsonObj.get("hairColour").isJsonNull()) {
				personaje.setHairColour(gsonObj.get("hairColour").getAsString());
			}
			
			if(!gsonObj.get("patronus").isJsonNull()) {
				personaje.setPatronus(gsonObj.get("patronus").getAsString());
			}
			
			if(!gsonObj.get("hogwartsStudent").isJsonNull()) {
				personaje.setHogwartsStudent(gsonObj.get("hogwartsStudent").getAsString());
			}
			
			if(!gsonObj.get("hogwartsStaff").isJsonNull()) {
				personaje.setHogwartsStaff(gsonObj.get("hogwartsStaff").getAsString());
			}
			
			if(!gsonObj.get("actor").isJsonNull()) {
				personaje.setActor(gsonObj.get("actor").getAsString());
			}
			
			if(gsonObj.get("alternate_actors") != null) {
				JsonArray arrActors = gsonObj.get("alternate_actors").getAsJsonArray();
				for(int i = 0; i < arrActors.size(); i++) {
					listActors.add(arrActors.get(i).getAsString());
				}
			}
			
			if(!gsonObj.get("alive").isJsonNull()) {
				personaje.setAlive(gsonObj.get("alive").getAsBoolean());
			}
			
			if(!gsonObj.get("image").isJsonNull()) {
				personaje.setImage(gsonObj.get("image").getAsString());
			}
			
			personaje.setAlternativeNames(listNames);
			personaje.setAlternate_actors(listActors);
			personaje.setWand(var);
			lista.add(personaje);
		}
		
		model.addAttribute("personajes", lista);

		return "index";
	}
	
}
