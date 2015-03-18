Java EE 7 - Gradle 2+ - Wildfly
==============

Gradle Wildfly EE 7 Quickstarter
--------------

*Faces JSF 2.2*
- Contracts
- Templates
- Library Resources handling
- PrimeFaces 5.+ support
- Bootstrap 3+ basic layout

*JPA 2.1*
- hibernate
- eclipselink


**Gradle Java EE 7 - Wildfly - Quickstart Project**

*You need wildfly 8.2+ or 9.+ to use Java EE 7 Features out of the box*

default wildfly: 9.0.0.Alpha1

- Java EE 7 Web Project
- Wildfly 8.+ or Wildfly 9.+
- Gradle 2.+ now on 2.2.1
- PowerShell Deployment

Gradle - basic commands
--------------
gradle wrapper (once to setup your wrapper)

*startup your gradle.properties configured local wildfly server*

Now you can use:

gradlew tasks

gradlew war -i

gradlew clean test -i
gradlew clean test war -i

gradlew clean build -i
gradlew clean war -i

gradlew dependencies

*the first use you should start a download of gradle-version-bin.zip*

Please install your favorite IDE (Eclipse, IntelliJ, Netbeans) 
and import this project as Gradle Project.
**You have to use the build.gradle to import in IDE.**
You will find a Gradle View in your IDE to see all tasks.

*Powershell: .\gradlew tasks*

** TBD / TODO **

*should be all work without a local appserver on buildserver or host - by CLI*

- Gradle Test should use a port-offset=10000
- Gradle deployment tasks - see ./gradle/plugin.wildfly.gradle
- Gradle server command tasks (restart, reload, start, stop)
- Gradle CI build (Jenkins) to test

	some code examples inside to test

CI - Jenkins
--------------

This project is configured for Jenkins and its Plugins to show

* PMD
* Checkstyle
* Jacoco
* FindBugs
* Codenarc
* jDepend
* JUnit 4

Links - Documentation used
--------------
- http://www.adam-bien.com/
- https://docs.jboss.org/author/display/WFLY9/Documentation
- https://developer.jboss.org/wiki/CheatsheetTestingWithGradleArquillianAndWildFly
- https://developer.jboss.org/wiki/HowToUseEclipseLinkWithAS7
- https://github.com/arquillian/continuous-enterprise-development/
- https://docs.jboss.org/author/display/WFLY9/JPA+Reference+Guide#JPAReferenceGuide-UsingEclipseLink
- http://middlewaremagic.com/jboss/?p=350
- http://www.primefaces.org/showcase/
- http://mvnrepository.com/
- http://groovy-lang.org/documentation.html
- http://gradle.org/docs/current/userguide/userguide.html
- http://git-scm.com/docs/
- http://google-styleguide.googlecode.com/svn/trunk/javaguide.html
- https://developer.jboss.org/wiki/ConfiguringMultipleJBossInstancesOnOneMachine
- https://www.jfrog.com/confluence/display/RTF/Working+with+Gradle

License
--------------
**GNU GPLv3 Copyright**
*by Klaus Landsdorf - Lohne (Olb) - Germany*

