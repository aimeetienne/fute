package fute;

import java.util.ArrayList;

public class FichierMetier {
	private String nomDuMetier="";

	private String coderome;
	private String citp;
	private String insee;
	private String edDefinition = "<h2><b>1. INTITULES SYNONYMES OU APPARENTES</b></h2><h2><b>2. DEFINITION</b></h2><h2><b>3. FORMATION - QUALIFICATION</b></h2><h2 ><b>4. PRESENTATION DE L'ACTIVITE PRINCIPALE </b></h2><h3 style=\"margin-left: 20px;\"><b>4.1. LIEUX D'ACTIVITE</b></h3><ul  style=\"margin-left: 20px;\"><li>Type d'établissement : </li> <li>Environnement physique de travail :</li></ul><h3 style=\"margin-left: 20px;\"><b>4.2. DESCRIPTION DE L'ACTIVITE</b></h3><h3   style=\"margin-left: 20px;\"><b>4.3. MACHINES ET OUTILS UTILISES</b></h3><h3   style=\"margin-left: 20px;\"><b>4.4. PRODUITS ET MATERIAUX</b></h3><h3   style=\"margin-left: 20px;\"><b>4.5. PUBLIC ET RELATIONS SOCIALES</b></h3><h3   style=\"margin-left: 20px;\"><b>4.6. EXIGENCES PARTICULIERES</b></h3><h3   style=\"margin-left: 20px;\"><b>4.7. TRAVAILLEURS HANDICAPES</b></h3><h2><b>5. ACTIVITES POUVANT ETRE ASSOCIEES</b></h2><h2><b>6. DANGERS</b></h2><h3  style=\"margin-left: 20px;\"><b>6.1. ACCIDENTS DU TRAVAIL</b></br><h3  style=\"margin-left: 20px;\"><b>6.2. AMBIANCES ET CONTRAINTES PHYSIQUES</b></h3><h3  style=\"margin-left: 20px;\"><b>6.3. AGENTS CHIIMIQUES</b></h3><h3  style=\"margin-left: 20px;\"><b>6.4. AGENTS BIOLOGIQUES</b></h3><h3  style=\"margin-left: 20px;\"><b>6.5. CONTRAINTES ORGANISATIONNELLES ET RELATIONNELLES</b></h3><h2><b>7. RISQUES POUR LA SANTE</b></h2><h3  style=\"margin-left: 20px;\"><b>7.1. MALADIES PROFESSIONNELLES</b></h3><h3  style=\"margin-left: 20px;\"><b>7.2. AUTRES RISQUES</b></h3><h2><b>8. SURVEILLANCE MEDICALE</b></h2><h3  style=\"margin-left: 20px;\"><b>8.1. VISITE MEDICALE</b></h3><h3  style=\"margin-left: 20px;\"><b>8.2. EXAMENS COMPLEMENTAIRES</b></h3>  <h3  style=\"margin-left: 20px;\"><b>8.3. VACCINATIONS</b></h3><h3  style=\"margin-left: 20px;\"><b>8.4. SUIVI POST PROFESSIONNEL</b></h3><h3  style=\"margin-left: 20px;\"><b>8.5. DOSSIER MEDICAL</b></h3><h2><b>9. NUISANCES POUR L'ENVIRONNEMENT EXTERIEUR</b></h2><h2><b>10. ACTIONS PREVENTIVES</b></h2><h3  style=\"margin-left: 20px;\"><b>10.1. INDICATEURS D'AMBIANCE ET METROLOGIE</b></h3><h3  style=\"margin-left: 20px;\"><b>10.2. PREVENTION COLLECTIVE</b></h3><h3  style=\"margin-left: 20px;\"><b>10.3. PREVENTION INDIVIDUELLE</b></h3><h3  style=\"margin-left: 20px;\"><b>10.4. FORMATION - INFORMATION - SENSIBILISATION</b></h3><h2><b>11. REGLEMENTATION</b></h2><h3  style=\"margin-left: 20px;\"><b>11.1. TEXTES LEGISLATIFS ET REGLEMENTAIRES</b></h3><h3  style=\"margin-left: 20px;\"><b>11.2. RECOMMANDATIONS</b></h3><h3  style=\"margin-left: 20px;\"><b>11.3. NORMES</b></h3><h3  style=\"margin-left: 20px;\"><b>11.4. CONVENTIONS COLLECTIVES</b></h3><h2 ><b>12. BIBLIOGRAPHIE</b></h2><h2 ><b>13. ADRESSES UTILES</b></h2> ";
	private ArrayList <String> niveaux = new ArrayList<String>();

	private String commentaireNiveauF;


	//private String edActivite="<h2 ><b>4. PRESENTATION DE L'ACTIVITE PRINCIPALE </b></h2><h3 style=\"margin-left: 20px;\"><b>4.1. LIEUX D'ACTIVITE</b></h3><ul  style=\"margin-left: 20px;\"><li>Type d'établissement : </li>    <li>Environnement physique de travail :</li> </ul></br><h3 style=\"margin-left: 20px;\"><b>4.2. DESCRIPTION DE L'ACTIVITE</b></h3><h3   style=\"margin-left: 20px;\"><b>4.3. MACHINES ET OUTILS UTILISES</b></h3><h3   style=\"margin-left: 20px;\"><b>4.4. PRODUITS ET MATERIAUX</b></h3><h3   style=\"margin-left: 20px;\"><b>4.5. PUBLIC ET RELATIONS SOCIALES</b></h3><h3   style=\"margin-left: 20px;\"><b>4.6. EXIGENCES PARTICULIERES</b></h3><h3   style=\"margin-left: 20px;\"><b>4.7. TRAVAILLEURS HANDICAPES</b></h3><h2><b>5. ACTIVITES POUVANT ETRE ASSOCIEES<b></h2><h2><b>6. DANGERS</b></h2></br><h3  style=\"margin-left: 20px;\"><b>6.1. ACCIDENTS DU TRAVAIL</b></br><h3  style=\"margin-left: 20px;\"><b></h3> 6.2. AMBIANCES ET CONTRAINTES PHYSIQUES</b></h3><h3  style=\"margin-left: 20px;\"><b></h3>6.3. AGENTS CHIIMIQUES</b></h3><h3  style=\"margin-left: 20px;\"><b></h3>6.4. AGENTS BIOLOGIQUES</b></h3><h3  style=\"margin-left: 20px;\"><b>6.5. CONTRAINTES ORGANISATIONNELLES ET RELATIONNELLES</b></h3><h2><b>7. RISQUES POUR LA SANTE</b></h2><h3  style=\"margin-left: 20px;\"><b>7.1. MALADIES PROFESSIONNELLES</b></h3><h3  style=\"margin-left: 20px;\"><b>7.2. AUTRES RISQUES</b></h3><h2><b>8. SURVEILLANCE MEDICALE</b></h2><h3  style=\"margin-left: 20px;\"><b>8.1. VISITE MEDICALE</b></h3><h3  style=\"margin-left: 20px;\"><b>8.2. EXAMENS COMPLEMENTAIRES</b></h3>  <h3  style=\"margin-left: 20px;\"><b>8.3. VACCINATIONS</b></h3><h3  style=\"margin-left: 20px;\"><b>8.4. SUIVI POST PROFESSIONNEL</b></h3><h3  style=\"margin-left: 20px;\"><b>8.5. DOSSIER MEDICAL</b></h3><h2><b>9. NUISANCES POUR L'ENVIRONNEMENT EXTERIEUR</b></h2><h2><b>10. ACTIONS PREVENTIVES</b></h2><h3  style=\"margin-left: 20px;\"><b>10.1. INDICATEURS D'AMBIANCE ET METROLOGIE</b></h3><h3  style=\"margin-left: 20px;\"><b>10.2. PREVENTION COLLECTIVE</b></h3><h3  style=\"margin-left: 20px;\"><b>10.3. PREVENTION INDIVIDUELLE</b></h3><h3  style=\"margin-left: 20px;\"><b>10.4. FORMATION - INFORMATION - SENSIBILISATION</b></h3><h2><b>11. REGLEMENTATION</b></h2><h3  style=\"margin-left: 20px;\"><b>11.1. TEXTES LEGISLATIFS ET REGLEMENTAIRES</b></h3><h3  style=\"margin-left: 20px;\"><b>11.2. RECOMMANDATIONS</b></h3><h3  style=\"margin-left: 20px;\"><b>11.3. NORMES</b></h3><h3  style=\"margin-left: 20px;\"><b>11.4. CONVENTIONS COLLECTIVES</b></h3><h2 ><b>12. BIBLIOGRAPHIE</b></h2><h2 ><b>13. ADRESSES UTILES</b></h2> ";
	//private String ed43_47=" <h3   style=\"margin-left: 20px;\"><b>4.3. MACHINES ET OUTILS UTILISES</b></h3><h3   style=\"margin-left: 20px;\"><b>4.4. PRODUITS ET MATERIAUX</b></h3><h3   style=\"margin-left: 20px;\"><b>4.5. PUBLIC ET RELATIONS SOCIALES</b></h3><h3   style=\"margin-left: 20px;\"><b>4.6. EXIGENCES PARTICULIERES</b></h3><h3   style=\"margin-left: 20px;\"><b>4.7. TRAVAILLEURS HANDICAPES</b></h3> ";
	//private String edDanger=" <h2><b>6. DANGERS</b></h2></br><h3  style=\"margin-left: 20px;\"><b>6.1. ACCIDENTS DU TRAVAIL</b></h3> ";
	//private String contraintesOrga=" <h3  style=\"margin-left: 20px;\"><b>6.5. CONTRAINTES ORGANISATIONNELLES ET RELATIONNELLES</b></h3> ";

	//private String medical8="<h2><b>8. SURVEILLANCE MEDICALE</b></h2><h3  style=\"margin-left: 20px;\"><b>8.1. VISITE MEDICALE</b></h3>";
	//private String ed84_101=" <h3  style=\"margin-left: 20px;\"><b>8.4. SUIVI POST PROFESSIONNEL</b></h3><h3  style=\"margin-left: 20px;\"><b>8.5. DOSSIER MEDICAL</b></h3><h2><b>9. NUISANCES POUR L'ENVIRONNEMENT EXTERIEUR</b></h2><h2><b>10. ACTIONS PREVENTIVES</b></h2><h3  style=\"margin-left: 20px;\"><b>10.1. INDICATEURS D'AMBIANCE ET METROLOGIE</b></h3> ";
	//private String ed104_114=" <h3  style=\"margin-left: 20px;\"><b>10.4. FORMATION - INFORMATION - SENSIBILISATION</b></h3><h2><b>11. REGLEMENTATION</b></h2><h3  style=\"margin-left: 20px;\"><b>11.1. TEXTES LEGISLATIFS ET REGLEMENTAIRES</b></h3><h3  style=\"margin-left: 20px;\"><b>11.2. RECOMMANDATIONS</b></h3><h3  style=\"margin-left: 20px;\"><b>11.3. NORMES</b></h3><h3  style=\"margin-left: 20px;\"><b>11.4. CONVENTIONS COLLECTIVES</b></h3> ";

	private  int numeroFiche = 0;

	private ArrayList<String> thesoVisu1 = new ArrayList<String>();


	public int getNumeroFiche() {
		return numeroFiche;
	}


	public void setNumeroFiche(int numeroFiche) {
		this.numeroFiche = numeroFiche;
	}


	public FichierMetier(){

	}


	public String getNomDuMetier() {
		return nomDuMetier;
	}


	public void setNomDuMetier(String nomDuMetier) {
		this.nomDuMetier = nomDuMetier;
	}


	public String getCoderome() {
		return coderome;
	}


	public void setCoderome(String coderome) {
		this.coderome = coderome;
	}


	public String getCitp() {
		return citp;
	}


	public void setCitp(String citp) {
		this.citp = citp;
	}


	public String getInsee() {
		return insee;
	}


	public void setInsee(String insee) {
		this.insee = insee;
	}


	public String getEdDefinition() {
		return edDefinition;
	}


	public void setEdDefinition(String edDefinition) {
		this.edDefinition = edDefinition;
	}


	public ArrayList<String> getNiveaux() {
		return niveaux;
	}


	public void setNiveaux(ArrayList<String> niveaux) {
		this.niveaux = niveaux;
	}


	public String getCommentaireNiveauF() {
		return commentaireNiveauF;
	}


	public void setCommentaireNiveauF(String commentaireNiveauF) {
		this.commentaireNiveauF = commentaireNiveauF;
	}

	/*
public String getEdActivite() {
	return edActivite;
}


public void setEdActivite(String edActivite) {
	this.edActivite = edActivite;
}


public String getEd43_47() {
	return ed43_47;
}


public void setEd43_47(String ed43_47) {
	this.ed43_47 = ed43_47;
}


public String getEdDanger() {
	return edDanger;
}


public void setEdDanger(String edDanger) {
	this.edDanger = edDanger;
}


public String getContraintesOrga() {
	return contraintesOrga;
}


public void setContraintesOrga(String contraintesOrga) {
	this.contraintesOrga = contraintesOrga;
}


public String getMedical8() {
	return medical8;
}


public void setMedical8(String medical8) {
	this.medical8 = medical8;
}


public String getEd84_101() {
	return ed84_101;
}


public void setEd84_101(String ed84_101) {
	this.ed84_101 = ed84_101;
}


public String getEd104_114() {
	return ed104_114;
}


public void setEd104_114(String ed104_114) {
	this.ed104_114 = ed104_114;
}

	 */
	public ArrayList<String> getThesoVisu1() {
		return thesoVisu1;
	}


	public void setThesoVisu1(ArrayList<String> thesoVisu1) {
		this.thesoVisu1 = thesoVisu1;
	}





}
