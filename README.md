# CS305
Through the analysis of advanced security concepts, students will learn how to develop secure code that complies with security testing protocols. In addition to exploring and implementing security concepts through code, students will also learn why and how to apply encryption technologies and techniques to communicate securely.
---
## Atemis Financial Practices for Secure Software
In this theoretical assessment, Artemis Financial is a consulting company that develops financial plans for its customers including savings, retirement, investments and insurance.

### Software Requirments
It was required to use the most current and effective software security practices to securely develop a public web interface which used a secure hashing algorithm to protect client data and financial information. It was a must to have a data verification step in the form of a checksum using the existing software application to add secure communication mechanisms to meet these requirments. I developed a checksum utilizing the SHA-256 algorithm as this was the most secure algorithm for this usecase - this was due to the widespread use and since it passes NIST and FISMA compliances.

### Software Vulnerabilities
On top of the secure practices, ensuring that there were no vulnerabilites was vital. I believe what I did well in this assessment was checking for existing vulnerabilities before I began my refactoring process to ensure that I did not add more vulnerabilites using the dependnecy check. Then I fixed 80% of the vulnerabilities simply by updating out-of-date dependencies. The rest of the vulnerabilities were surpressed after throughough testing to ensure they were not applicable to the application use case(s). These are important steps as vulnerabilites open the application up to attackers, and implementing secure coding practices builds a reputation with the client of the company as well as the between their clients - in other words, producing a secure application will build trust between Gobal Rain and Artemis Financial as well as Atermis Financial and their clients.

### Challenges
The most challenging part of this application was understanding the dependency check steps. Knowing how to read and assess the vulnerabilites to safely supress warnings if they did not apply to the use case was difficult to understand. It required testing and ensuring the description was not vulnerable.

Another issue that wasn't necessarily part of the assignment was creating a CA signed certificate for HTTPS instead of a simple self-signed HTTPS cert. While a self-signed cert still allowed for the HTTPS protocol, most browsers will still see the localhost as a unsecure site as it is self-signed. Learning how to create a CA signed cert, adding it to the Windows Certifications and calling that keystore allowed for a secure connection with an official certification over HTTPS.

### Layers of security
I increased layers of security by ensuring proper error handling was implemented using try-catch blocks, this ensured that attackers did not gain access to unhandled exceptions which may potentially give them the information they need on vulnerable access points. Secondly, I ensured no vulnerabilites were added from refactoring as well as fixing any existing vulernabilities by updating dependencies that were compatable with the web application. Thirdy I also implemnted a CA signed certiicate on my own machine (though the current program just follows the assignment guidelines) to ensure a secure connaction over HTTPS was recognized by the browser. This can be implemented simply by changing the ```application.properties``` file to call the localhost.ps12 instead of keystore.ps12.

To ensure the software application was functional and secure I ran the program mulitple times after making changes and updating dependencies and changing the  Java version to 21. After refactoring I ran the dependency check tool to ensure no new vulnerabilites were found compared to running it prior and fixing any vulnerabilites that I could or suppressing ones that were not applicable.

### Helpful Resources
To implement a CA signed certificate, I used [MKCert](https://dev.to/aschmelyun/using-the-magic-of-mkcert-to-enable-valid-https-on-local-dev-sites-3a3c)

### Experience
To showcase my knowledge from this assignment, I might show how I implemented a checksum and how I check for vulnerable dependencies. I would also show how I implemented a CA signed cert and the differences between a self-signed and CA cert in terms of secure protocoels over HTTPS/HTTP.


---
## Module 2
By the end of this module, you will meet these learning objectives:
* Identify software security vulnerabilities by manually reviewing source code and running code through a static tester
* Research to identify potential correlations between mitigation techniques and known exploits related to the identified security vulnerabilities
* Document the process and findings for mitigating software security vulnerabilities to meet requirements

### This module includes a written assignment and a coding assignment.
---
## Module 3
By the end of this module, you will meet this learning objective:
* Analyze how advanced security concepts are applied to develop secure code
* Reflect on the importance of software security

### This module includes the Project One and journal reflection.
---
## Module 4
By the end of this module, you will meet this learning objective:
* Identify appropriate algorithm ciphers to apply to a situation, justifying reasoning using current government regulations and software security best practices

### This module includes a written assignment.
---
## Module 5
By the end of this module, you will meet these learning objectives:
* Deploy appropriate algorithm ciphers to increase layers of security for software applications
* Generate a self-signed certificate for use in a secure communications environment

### This module includes two coding assignments.
---
## Module 6
By the end of this module, you will meet these learning objectives:
* Identify software security vulnerabilities by running code through a static tester
* Document the process and findings for mitigating software security vulnerabilities to meet requirements

### This module includes a coding assignment.
---
## Module 7
By the end of this module, you will meet these learning objectives:
* Design and implement code that complies with software security testing protocols.
* Write secure communications through the application of current encryption technologies and techniques.

### This module includes the Project Two.
---
## Module 8
By the end of this module, you will meet this learning objective:
* Reflect on the importance of software security

### This module includes a journal reflection.
