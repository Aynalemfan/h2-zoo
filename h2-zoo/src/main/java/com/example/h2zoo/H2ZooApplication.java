package com.example.h2zoo;

import com.example.h2zoo.model.Birds;
import com.example.h2zoo.model.Mammal;
import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.repository.BirdsRepository;
import com.example.h2zoo.repository.MammalRepository;
import com.example.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(H2ZooApplication.class, args);

		ReptileRepository reptileRepository = configurableApplicationContext.getBean(ReptileRepository.class);

		Reptile kingCobra = new Reptile("Slither","Snake", "Black & Yellow", "Carnivore");
		Reptile komodoDragon = new Reptile( "Dennis", "Lizard", "Brown", "Carnivore");

		reptileRepository.saveAll(List.of(kingCobra, komodoDragon));

		MammalRepository mammalRepository = configurableApplicationContext.getBean(MammalRepository.class);

		Mammal bloodhound = new Mammal("Alamy","Dog", "Brown", "Carnivore");
		Mammal bangalTiger = new Mammal("PantheraTigris","Tiger", "OrangeAndBlack", "Carnivore");
		Mammal asianElephant = new Mammal("ElephasMaximus","E.maximus", "Gray", "Herbivorous");

		 mammalRepository.saveAll(List.of(bloodhound, bangalTiger, asianElephant));

		BirdsRepository birdsRepository = configurableApplicationContext.getBean(BirdsRepository.class);

		Birds nuthatches = new Birds("PygmyNuthatch ","Nuthatches", "BlueGray", "Omnivores");
		Birds abyssinianLongclaw = new Birds("Aves ","M.Flavicollis", "BlackOrangeYellow", "Omnivores");
		Birds penguin = new Birds("EmperorPenguin ","A.forsteri", "BlackWhiteYellow", "Carnivore");

		birdsRepository.saveAll(List.of(nuthatches, abyssinianLongclaw, penguin));


	}

}
