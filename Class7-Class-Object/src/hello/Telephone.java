package hello;

public class Telephone{
	float screen;
	float cpu;
	float memory;
	public Telephone(){
		System.out.println("�޲εĹ��췽��ִ���ˣ�");
	}
	//��ֱ���ٴζ��壬���Ʒ���������
	public Telephone(float newScreen, float newCpu, float newMemory){
		if(newScreen < 3.5f){
			screen = 3.5f;
			System.out.println("�����������Ļ�ߴ��д����Ѹ�ΪĬ��ֵ��");
		}else{
			screen = newScreen;
		}
		cpu = newCpu;
		memory = newMemory;
		System.out.println("Screen:"+screen+" Cpu:"+cpu+" Memory:"+memory);
	}
}