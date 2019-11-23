package com.wildcodeschool.wildandwizard;

import com.wildcodeschool.wildandwizard.entity.School;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class WildAndWizardApplication {




	public static void main(String[] args) {
		SpringApplication.run(WildAndWizardApplication.class, args);
	}

}
