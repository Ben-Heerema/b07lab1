public class Polynomial{
	//fields
	private double [] coeff; //this will list all coefficients, i.e. [6, -2, 0, 5] = 6-2x+5x^3
	

	//methods

		//constructors
	public Polynomial(){
		coeff = new double [1];
		coeff[0] = 0;
	}
	
	public Polynomial(double [] coeff){
		
		this.coeff = new double [coeff.length];

		for(int i=0; i<coeff.length;i++){
			this.coeff[i] = coeff[i];
		}
	
	}
	
	//methods continued.
	public Polynomial add(Polynomial p2){
		
		Polynomial p3;
		
		if(this.coeff.length > p2.coeff.length) {
			p3 = new Polynomial(this.coeff);
			for(int i=0; i<p2.coeff.length; i++){
				p3.coeff[i] = p3.coeff[i] + p2.coeff[i];
			}
			
		}else{
			p3 = new Polynomial(p2.coeff);	
			for(int i=0; i<this.coeff.length; i++){
				p3.coeff[i] = p3.coeff[i] + this.coeff[i];
			}
		}
		
		return p3;
	}

	public double evaluate(double x) {
		
		double total = 0.0;
		
		//goes through each term and sums them starting at the constant and going to the highest power.
		for(int i = 0; i<this.coeff.length; i++) {
			
			total = total + (coeff[i] * Math.pow(x, i));
			
		}
		
		return total;
	}

	public boolean hasRoot(double x) {
		
		if(evaluate(x) == 0) { // does java round weird? should I be concerned about this?
			return true;
		}
		return false;
		
	}

}