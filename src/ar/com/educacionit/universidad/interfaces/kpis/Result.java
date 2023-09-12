package ar.com.educacionit.universidad.interfaces.kpis;

public class Result {
	private String text;
	private float value;
	
	public Result(String text, float value) {
		this.text = text;
		this.value = value;
	}

	public void setText(String text) {
		if(text == null || "".equals(text.trim())) {
			this.text = "N/A";
		}else {
			this.text = text.trim();
		}
	}

	public void setValue(float value) {
		if(value < 0) {
			this.value = 0;
		}else {
			this.value = value;
		}
	}

	public String getText() {
		return text;
	}

	public float getValue() {
		return value;
	}
	
	
}
