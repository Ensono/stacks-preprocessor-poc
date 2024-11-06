# Stacks PreProcessor PoC

### Overview
PoC using Maven profiles and the Manifold preprocessor to create a Java project containing only the dependencies we require and use Mainfold to wire dependencies correctly based on profiles chosen and generate source code in the configured output directory. 

ADR describing problem statement. 
https://github.com/Ensono/Ensono.Stacks.KnowledgeBase/blob/b050683e5aa18034dafbed3671ce657ae8c8ab0d/architecture-decision-records-adrs/adrs/adr-java-4036-java-modular-development-deployment.md#L245-L291

Manifold preprocessor
https://github.com/manifold-systems/manifold/tree/master/manifold-deps-parent/manifold-preprocessor

This project contains Maven modules representing some of the current Stacks modules and an `app` module that contains a POM configured to run the Manifold Maven plugin, The application code contains the manifold mark-up. Based on the Maven profiles set we then pass those as Java compiler arguments, these are then available for Manifold to use as symbols that are then referenced in Manifolds directives.  

In order to do this we have created a custom Maven plugin to move the Java source files into the correct `src/main/java` and `src/test/java` directory structures and then to generate a project POM file.