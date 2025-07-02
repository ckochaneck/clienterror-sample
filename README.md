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
Create an App Deployment in the em using DemoClass.bbj as Program File.

When opening up your Deployment, e.g. localhost:8888/webapp/sample, you will see the following error:

![image](https://github.com/user-attachments/assets/4ec4c5a4-e75c-4567-ab8a-1b30c6fe0d98)

Which seems to relate to another error that was encountered:
![image](https://github.com/user-attachments/assets/0042e099-75c9-4c15-8c8d-45897eaaf6e8)

If additional context is needed, feel free to contact me.
