Step 1.
Install BBj 25.02 (Build Timestamp: 07/26/2025 12:40)

Step 2.
Build the demo-package using mvn clean install

Step 3.
Create a classpath using the demo-package-1.0.jar and bbj_internal

Step 4.
Create an App Deployment.
Program File: DemoClass.bbj.
Config: Default config.bbx.
Classpath: Add the demo-package-1.0.jar to a custom classpath or bbj_default and use the related classpath (custom or bbj_default).