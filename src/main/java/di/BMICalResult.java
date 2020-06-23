package di;

public class BMICalResult {
	
	//멤버변수
	private double lowWeight;
	private double normal;
	private double overWeight;
	private double obesity;
	
	
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	//체질량지수를 계산하기 위한 메소드
	public String bmiCalculation(double weight, double height) {
		double h= height * 0.01;
		double result = weight/(h*h);
		
		String resultStr = "당신의 BMI지수는?" +
				(int)result;
		if(result>obesity) {
			resultStr += "<br/>비만입니다";
			
		}
		else if(result>overWeight) {
			resultStr += "<br/>과체중입니다.";
		}
		else if(result>normal) {
			resultStr += "<br/>정상 체중입니다.";
		}
		else {
			resultStr += "<br/>저체중입니다.";
		}
		
		return resultStr;
	}
	
}
