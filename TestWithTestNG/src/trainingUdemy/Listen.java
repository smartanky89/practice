package trainingUdemy;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listen implements ITestListener {
	
	@Override		
    public void onFinish(ITestContext Result) {					
        System.out.println(Result.getName());				
        		
    }		

    @Override		
    public void onStart(ITestContext Result) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult Result) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult Result) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestStart(ITestResult Result) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult Result) {					
    	 System.out.println(Result.getName());			
        		
    }		

}
