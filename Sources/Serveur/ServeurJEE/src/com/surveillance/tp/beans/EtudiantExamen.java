package com.surveillance.tp.beans;

/**
 * Contient les données stockées dans le header d'un log d'étudiant pour un examen précis
 */

public class EtudiantExamen {
	private String nomEt;
	private String prenEt;
	private String nbAlertes;
	private String nbAlertesCritiques;
	private String nbAlertesClavier;
	private String nbAlertesNet;
	private String nbAlertesFichier;
	private String nbAlertesUSB;
	private int id;
	
	public String getNomEt() {
		return nomEt;
	}
	public void setNomEt(String nomEt) {
		this.nomEt = nomEt;
	}
	public String getPrenEt() {
		return prenEt;
	}
	public void setPrenEt(String prenEt) {
		this.prenEt = prenEt;
	}
	public String getNbAlertes() {
		return nbAlertes;
	}
	public void setNbAlertes(String nbAlertes) {
		this.nbAlertes = nbAlertes;
	}
	public String getNbAlertesCritiques() {
		return nbAlertesCritiques;
	}
	public void setNbAlertesCritiques(String nbAlertesCritiques) {
		this.nbAlertesCritiques = nbAlertesCritiques;
	}
	public String getNbAlertesClavier() {
		return nbAlertesClavier;
	}
	public void setNbAlertesClavier(String nbAlertesClavier) {
		this.nbAlertesClavier = nbAlertesClavier;
	}
	public String getNbAlertesNet() {
		return nbAlertesNet;
	}
	public void setNbAlertesNet(String nbAlertesNet) {
		this.nbAlertesNet = nbAlertesNet;
	}
	public String getNbAlertesFichier() {
		return nbAlertesFichier;
	}
	public void setNbAlertesFichier(String nbAlertesFichier) {
		this.nbAlertesFichier = nbAlertesFichier;
	}
	public String getNbAlertesUSB() {
		return nbAlertesUSB;
	}
	public void setNbAlertesUSB(String nbAlertesUSB) {
		this.nbAlertesUSB = nbAlertesUSB;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
