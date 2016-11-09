package interfaces;
class Test2 implements ITest1{

	@Override
	public void method1() {
	System.out.println("Method 1 of Test2");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2 of Test2");	
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Method 3 of Test2");
	}
	
}
public class InterfaceTest implements ITest1,ITest2 {

	public static void main(String[] args) {
		
		//InterfaceTest it= new InterfaceTest();
		//it.method3();
        //Polymorphism
		ITest1 it=new InterfaceTest();
		it.method1();
		it= new Test2();
		it.method2();
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("method 4");
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		System.out.println("method 5");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method 1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method 2");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method 3");		
	}

}
