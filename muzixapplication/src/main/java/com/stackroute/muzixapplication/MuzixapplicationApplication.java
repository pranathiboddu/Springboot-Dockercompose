package com.stackroute.muzixapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MuzixapplicationApplication
{

	public static void main(String[] args) {
		SpringApplication.run(MuzixapplicationApplication.class, args);
	}
 //implemented methods
	/*MusicService musicService;
	@Autowired
	public void setMusicService(MusicService musicService) {
		this.musicService = musicService;
	}

	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources(MuzixapplicationApplication.class);}*/

/*
	//setting values to the music
	@Override
	public void run (String...args) throws Exception
		{
			try {
				musicService.saveTrack(new Music(6, "chainsmokers", "Excellent"));
				musicService.saveTrack(new Music(7, "one direction", "Excellent"));
				musicService.saveTrack(new Music(8, "vidyavox", "Excellent"));
			}
			catch (TrackAlreadyExistsException ex) {
				ex.printStackTrace();
			}
		}*/
	}





