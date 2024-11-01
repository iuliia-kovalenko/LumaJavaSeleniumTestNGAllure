# OpenCartJavaSeleniumTestNGAllure

[![Java CI with Maven](https://github.com/iuliia-kovalenko/LumaJavaSeleniumTestNGAllure/actions/workflows/build.yml/badge.svg)](https://github.com/iuliia-kovalenko/LumaJavaSeleniumTestNGAllure/actions/workflows/build.yml)
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LumaJavaSeleniumTestNGAllure</title>
</head>
<body>

<p>
Project is an automated testing project for the OpenCart website using Selenium WebDriver, TestNG, and Allure for reporting. 
This project demonstrates the use of Java to implement end-to-end tests for web applications.
</p>

<h2>Features</h2>
<ul>
    <li><strong>Java</strong>: The primary programming language utilized for creating test scripts.</li>
    <li><strong>Selenium WebDriver</strong>: Automates browser actions for testing.</li>
    <li><strong>TestNG</strong>: A testing framework for Java, providing features such as annotations, grouping, and reporting.</li>
    <li><strong>Allure</strong>: Generates detailed reports to visualize test results.</li>
    <li><strong>Maven</strong>: Utilized for managing project builds and dependencies.</li>
</ul>       

<h2>Testing Framework</h2>
<ul>
    <li>The project employs <strong>TestNG</strong> with the age <strong>Object Model (POM)</strong> design pattern for better test organization and maintainability.</li>
    <li>It supports <strong>multibrowsing</strong> on <strong>Google Chrome</strong> and <strong>Mozilla Firefox</strong>, ensuring compatibility across different browsers.</li>
    <li>Tests are executed on various <strong>operating systems</strong>, including <strong>Ubuntu</strong>, <strong>macOS</strong>, and <strong>Windows</strong>.</li>
    <li><strong>DataProvider</strong> feature is utilized to run tests with multiple data sets efficiently.</li>
</ul>

<h2>Getting Started</h2>

<h3>Prerequisites</h3>
<ul>
<li>Java Development Kit (JDK): Version 8 or higher.</li>
<li>Maven: For managing project dependencies and build lifecycle.</li>
<li>Selenium WebDriver: Compatible version for your browser.</li>
<li>Testing framework.</li>
<li>For generating test reports.</li>
</ul>

<h3>Installation, run tests and serve Allure reports locally</h3>
<ol>
<li><strong>Clone the repository</strong>:
<pre>
<code>git clone https://github.com/iuliia-kovalenko/LumaJavaSeleniumTestNGAllure.git
cd LumaJavaSeleniumTestNGAllure</code></pre>
</li>
<li>
<strong>Install dependencies</strong>:
<pre><code>mvn clean install</code></pre>
</li>
<li>
<strong>Run tests</strong>:
<p>To execute the tests, run the following command:</p>
<pre><code>mvn test</code></pre>
</li>
<li>
<strong>Generate Allure reports</strong>:
<p>After running the tests, you can generate Allure reports by executing:</p>
<pre><code>mvn allure:report</code></pre>
</li>
<li>
<strong>View Allure reports</strong>:
<p>To serve the reports, run:</p>
<pre><code>mvn allure:serve</code></pre>
</li>
</ol>

<h2>Project Structure</h2>
<pre><code>
OpenCartJavaSeleniumTestNGAllure
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── opencart/
│   │                   ├── model 
│   ├── test/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── opencart/
│   │   │               ├── base/
│   │   │               ├── data/
│   │   │               ├── test/
│   │   │               ├── utils/
│   │   │               └── FrameworkTest.java 
│   │   └── resources/
├── target/
│       └── allure-results/
├── xmlSuits/
│       ├── crossBrowser.xml
│       ├── regression.xml
│       └── smoke.xml
├── pom.xml
└── README.md
</code></pre>

<li><strong>src/main/java</strong>: Contains the Page Object Model code.</li>
<li><strong>src/test/java</strong>: Contains the test cases.</li>
<li><strong>pom.xml</strong>: Maven configuration file.</li>

<h2>License</h2>
<p>This project is licensed under the MIT License. See the <a href="LICENSE">LICENSE</a> file for details.</p>

<h2>Acknowledgements</h2>
<ul>
<li><a href="https://www.selenium.dev/">Selenium WebDriver</a></li>
<li><a href="https://testng.org/">TestNG</a></li>
<li><a href="https://docs.qameta.io/allure/">Allure Framework</a></li>
</ul>

</body>
</html>