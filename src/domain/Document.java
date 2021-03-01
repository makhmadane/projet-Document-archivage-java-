package domain;

public class Document {

	  private int id;
	    private String codeDoc;
	    private String libelle;
	    private String dateAjout;

	    private TypeDocument typeDoc;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCodeDoc() {
			return codeDoc;
		}

		public void setCodeDoc(String codeDoc) {
			this.codeDoc = codeDoc;
		}

		public String getLibelle() {
			return libelle;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}

		public String getDateAjout() {
			return dateAjout;
		}

		public void setDateAjout(String dateAjout) {
			this.dateAjout = dateAjout;
		}

		public TypeDocument getTypeDoc() {
			return typeDoc;
		}

		public void setTypeDoc(TypeDocument typeDoc) {
			this.typeDoc = typeDoc;
		}
	    
	    
}
