package br.com.santander.front.previdencia.formalizacao.webservice.handlers;



/**
 * Classe para armazenamento dos dados do usu�rio SOAP
 * 
 * @author Marco Aur�lio Principe Gon�alves
 */

public class SecuritySoapUser {

    /**
     * Declara��o das vari�veis membro
     */

    private String userName;
    private String password;
    private String userMbsName;

    /**
     * @return the userName
     */

    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */

    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
	 * @return the userMbsName
	 */
	public String getUserMbsName() {
		userMbsName = "SHKPVBX";
		return userMbsName;
	}
	
	public String toString() {
		return "[ userName: "+userName+ " - password"+  password +"]";
	}

}
