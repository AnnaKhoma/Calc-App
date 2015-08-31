@echo off
rem delete current directory
rmdir /q /s apache-tomcat-8.0.24\webapps\calculator
rmdir /q /s WEB-INF\classes
rem create current directory
mkdir WEB-INF\classes
@echo on
javac -cp %CLASSPATH%;.\resources\lib\servlet-api.jar;.\resources\lib\simple-calc-app.jar src\com\example\servlet\*.java -d WEB-INF\classes
@echo off
rmdir /q /s calculator
rem create current directory
mkdir calculator
rem copy all .jsp files in calculator
copy *.jsp .\calculator
rem copy all folder and all files from WEB-INF in calculator
xcopy WEB-INF .\calculator\WEB-INF /S /E /I
xcopy calculator .\apache-tomcat-8.0.24\webapps\calculator /S /E /I  		
  		