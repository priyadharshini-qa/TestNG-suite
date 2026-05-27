# TestNG Suite — Selenium Automation Framework

A Java-based test automation framework built with **Selenium WebDriver** and **TestNG**, demonstrating core TestNG concepts including annotations, test attributes, grouping, method dependencies, and parallel cross-browser execution.

---

## Tech Stack

| Tool | Version |
|---|---|
| Java | 11+ |
| Selenium WebDriver | 4.14.0 |
| TestNG | 7.8.0 |
| Maven | 3.8+ |
| Commons IO | 2.15.0 |

---

## Project Structure

```
TestNG-suite/
├── src/
│   └── test/
│       └── java/
│           └── pc/
│               ├── ch01/basics/            # TestNG annotation demos
│               ├── ch02/testAttributes/    # Grouping & dependency demos
│               └── ch03/ParallelExecution/ # Parallel cross-browser tests
├── TestNG_Annotation1.xml                  # Suite: annotation basics
├── TestNG_Annotation2.xml                  # Suite: annotation advanced
├── TestNG_Attributes1.xml                  # Suite: grouping & dependencies
├── TestNG_Attributes2.xml                  # Suite: attributes advanced
├── TestNG_parallelByTest.xml               # Suite: parallel by test (Chrome + Edge)
└── pom.xml
```

---

## Concepts Covered

**Chapter 1 — Annotations**
- `@Test`, `@BeforeMethod`, `@AfterMethod`, `@BeforeClass`, `@AfterClass`, `@BeforeSuite`, `@AfterSuite`
- Demonstrates the full TestNG lifecycle execution order

**Chapter 2 — Test Attributes**
- Grouping tests with `@Test(groups = {...})`
- Running and excluding groups via the TestNG XML suite
- `dependsOnMethods` and `dependsOnGroups` for ordered execution

**Chapter 3 — Parallel Execution**
- Running tests in parallel across **Chrome** and **Edge** simultaneously
- Thread-safe WebDriver instantiation per test thread
- Browser and URL passed as `<parameter>` values from the XML suite

---

## How to Run

### Prerequisites
- Java 11 or higher installed
- Maven installed
- Chrome and Edge browsers installed (for parallel suite)

### Run a specific suite via Maven

```bash
# Annotations suite
mvn test -DsuiteXmlFile=TestNG_Annotation1.xml

# Parallel cross-browser suite
mvn test -DsuiteXmlFile=TestNG_parallelByTest.xml
```

### Run directly from your IDE
Right-click any TestNG XML file → **Run As → TestNG Suite**

---

## TestNG XML Suites

| File | Purpose |
|---|---|
| `TestNG_Annotation1.xml` | Runs annotation demo classes |
| `TestNG_Annotation2.xml` | Runs extended annotation demos |
| `TestNG_Attributes1.xml` | Runs grouping and dependency tests |
| `TestNG_Attributes2.xml` | Runs advanced attribute demos |
| `TestNG_parallelByTest.xml` | Runs parallel tests on Chrome and Edge |

---

## Parallel Execution Setup

The `TestNG_parallelByTest.xml` suite runs the same test classes simultaneously on two browsers using `parallel="tests"` and `thread-count="2"`:

```xml
<suite name="ParallelSuite" parallel="tests" thread-count="2">
  <test name="TestwithChrome">
    <parameter name="browser" value="chrome" />
    <parameter name="url" value="https://www.google.co.uk/" />
    ...
  </test>
  <test name="TestwithEdge">
    <parameter name="browser" value="edge" />
    ...
  </test>
</suite>
```

Each `<test>` block runs in its own thread, with the browser resolved at runtime via `@Parameters("browser")`.

---

## Author

**Priyadharshini** — QA Automation Engineer  
[GitHub Profile](https://github.com/priyadharshini-qa)

## 🤝 Support & Community

If you found this project helpful or learnt something from it,
💬 **Share it** — share with fellow QA engineers or automation learners who might benefit
