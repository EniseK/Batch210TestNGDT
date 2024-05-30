package techproed.utilities;

import org.testng.*;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Listeners implements ITestListener, IRetryAnalyzer, IAnnotationTransformer {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart ==> Tum testlerden once tek bir sefer cagirilir.");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish==> Tum testlerden sonra tek bir kere cagirilir  :  " +context.getName() );
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart==> her bir @Test ten once bir kere cagirilir  :  "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess==> sadece pass olan testlerden sonra bir kere cagirilir  :  "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure==> sadece fail olan testlerden sonra bir kere cagirilir  :  "+result.getName());
        ReusableMethods.screenShot(result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped==> sadece atlanan testlerden sonra bir kere cagirilir  :  "+result.getName());
    }

    /*
Bu methodu sadece fail olan test methodlarımızın kaç kere tekrardan çalıştırılmasını belirlemek için oluşturduk
maxRetryCount = 1; --> ek olarak çalışma sayısıdır
Bu örnekte fail olan test normal bir kere çalıştıktan sonra bir kere daha bu methodun çalışmasını sağlayacak
Buraya kaç yazarsak o kadar tekrar çalışacak
 */
    private static int retryCount = 0;
    private static final int maxRetryCount = 1;
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }

    /*
Bu method yukarida yazmis oldugumuz rety methoduna yardimci olur ve bu rety methodunun
xml dosyasi uzerinden kullanabilmemizi saglar.
ve boylece arka planda @Test notasyonuna sahip olan methodlari yapilandirip testin basarisiz
olma durumunda otomatik olarak rety methodunda belirttigimiz sayi kadar tekrar calistirabilmemizi saglar.
Eger bu methodu burada yazmazsak yeniden  calistirma icin ilgili methodlara manuel olarak yazmamiz gerekecek
 */

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

        annotation.setRetryAnalyzer(Listeners.class);
    }






}
