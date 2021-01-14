set projectLocation=D:\ZEE5\Zee5newpwaWorkspace\Sample
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testngHW.xml
pause