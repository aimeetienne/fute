package fute;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Command;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;


public class FicheMetiersMVVM {


	private FichierMetier ficheMetier ;
	private Thesaurus thesaurus;
 
	
	private String s= "pompier";
	private String r= "plombier";
	private String q="traiteur";
	
	
	public FichierMetier getFicheMetier() {
		return ficheMetier;
	}




	public void setFicheMetier(FichierMetier ficheMetier) {
		this.ficheMetier = ficheMetier;
		
	}

	







	public Thesaurus getThesaurus() {
		return thesaurus;
	}




	public void setThesaurus(Thesaurus thesaurus) {
		this.thesaurus = thesaurus;
	}




	public FicheMetiersMVVM(){
		
		System.out.println("dddddddddd");
		 
		thesaurus = new Thesaurus();
		  thesaurus.getTheso1().add(s);  thesaurus.getTheso1().add(r);  thesaurus.getTheso1().add(q);
		  thesaurus.getTheso2().add(s);  thesaurus.getTheso2().add(r);  thesaurus.getTheso2().add(q);
		  thesaurus.getTheso3().add(s);  thesaurus.getTheso3().add(r);  thesaurus.getTheso3().add(q);
		  thesaurus.getTheso4().add(s);  thesaurus.getTheso4().add(r);  thesaurus.getTheso4().add(q);
		  thesaurus.getTheso5().add(s);  thesaurus.getTheso5().add(r);  thesaurus.getTheso5().add(q);
		  thesaurus.getTheso6().add(s);  thesaurus.getTheso6().add(r);  thesaurus.getTheso6().add(q);
		  thesaurus.getTheso7().add(s);  thesaurus.getTheso7().add(r);  thesaurus.getTheso7().add(q);
		  thesaurus.getTheso8().add(s);  thesaurus.getTheso8().add(r);  thesaurus.getTheso8().add(q);
		
		
		
		
		
		
		
		List<FichierMetier> ficheMetiers=null;
		 ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "test16");
         try {
            
          ficheMetiers = db.query(FichierMetier.class);
          int compteur = 0; 
          if(ficheMetiers != null){
        	  compteur = ficheMetiers.size()-1;
          }
          ficheMetier=   ficheMetiers.get(compteur);
          
         } catch(Exception e){
        	 System.out.println(e);
         } finally {
             db.close();
         }
         if(ficheMetier==null){
       	  	this.ficheMetier = new FichierMetier() ;
       	 
       //	  int i = ficheMetiers==null ? 1:ficheMetiers.size()+1; 
      // 	  	this.ficheMetier.setNumeroFiche(i);
         }
         
	}
	
 
@Command
public void  sauvegarder() {
	
	 ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "test16");
     try {
   // 	 System.out.println(ficheMetier.getEdDefinition());
         db.store(ficheMetier);
     } catch(Exception e){
    	 System.out.println(e);      
        
     } finally {
         db.close();
         
	System.out.println("ici");
		
		
	}
	
	
	
}	
}
