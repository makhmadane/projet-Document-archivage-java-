package repository;

import domain.Classe;
import domain.Eleve;

public class EleveRepository {
	 public Eleve[] getAllEleve6emeA(){
	        Classe classe = new Classe(1,"6emeA");
	        return new Eleve[]{
	                new Eleve(1,"NDIAYE","Babacar","07/10/1995",classe),
	                new Eleve(2,"FALL","Abdoul","17/12/1996",classe),
	                new Eleve(3,"SY","Amina","11/10/1993",classe),
	        };
	    }
}
