set projectLocation=C:\Users\bsnku\eclipse-workspace\FrameWorkProject_1
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\NewFile.xml pause
