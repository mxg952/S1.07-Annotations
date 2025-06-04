# S1.07 - Annotations

Here’s the concise English version for the Annotations tasks in Markdown format:


## Level 1

### Exercise 1
Create a class hierarchy: `Treballador` (name, surname, price/hour) with `calcularSou()` method, overridden 
(`@Override`) in subclasses `TreballadorOnline` (adds internet flat rate) and `TreballadorPresencial` 
(adds static `benzina` fuel cost). Demonstrate `@Override` in `Principal.main()`.

### Exercise 2
Add deprecated methods (`@Deprecated`) in child classes. Call them from an external class while suppressing
"deprecation" warnings (`@SuppressWarnings("deprecation")`).

## Level 2

### Exercise 1
Create a custom annotation `@JsonSerializable` that marks a Java class for JSON serialization, accepting a
target directory path for the output file.

## Level 3

### Exercise 1
Modify the custom annotation to be retained at runtime (`@Retention(RetentionPolicy.RUNTIME)`). Demonstrate reading
it using Java Reflection in a test case.


## Technologies Used
* Java
* IntelliJ
* Git

## Requirements
* Java 17
* IntelliJ (optional)

## Installation

1. Clone the repository:
```
https://github.com/mxg952/S1.07-Annotations.git
```
2. Open the project with IntelliJ IDEA.

3. Run the class `nivell1.app.Main.java`.

## Execution

## Deployment

## Contributions
The project ignores `.idea/`, `.out/`, `.iml`.

1. Fork the repository
2. Create a new branch: `git checkout -b feature/NewFeature`
3. Make your changes and commit them: `git commit -m 'Add New Feature'`
4. Push the changes to your branch: `git push origin feature/NewFeature`
5. Open a pull request
