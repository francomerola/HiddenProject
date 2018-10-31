/**
 * 
 */
package it.test.prova;

/**
 * @author franco.merola
 *
 */
public class Prova {

	private String campoUno;
	private String campoDue;
	
	public Prova() {
		super();
		this.campoUno = "";
		this.campoDue = "";
	}
	public String getCampoUno() {
		return campoUno;
	}
	public void setCampoUno(String campoUno) {
		this.campoUno = campoUno;
	}
	public String getCampoDue() {
		return campoDue;
	}
	public void setCampoDue(String campoDue) {
		this.campoDue = campoDue;
	}
	
	public String getConcat() {
		String result=null;
		if(!this.campoUno.isEmpty() && !this.campoDue.isEmpty())
			result = this.campoUno.concat(this.campoDue);
		return result;
	}
}
