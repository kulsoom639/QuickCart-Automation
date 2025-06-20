# QuickCart Automation Framework

This project is a Selenium Test Automation Framework for an e-commerce application (https://www.demoblaze.com).

## 🔧 Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Extent Reports
- Git, JIRA

## 📂 Folder Structure

src/
├─ base/ # BaseTest class
├─ pages/ # Page classes (LoginPage, CartPage, etc.)
├─ tests/ # Test classes (LoginTest, InvalidLoginTest, etc.)
└─ utils/ # ExtentReportManager
Reports/ # HTML report output


## ✅ Features Automated

- Login (Valid/Invalid)
- Search Product
- Add to Cart
- Checkout Flow
- Logout

## 📄 Documents
- ✅ [Test Plan](./TestPlan_Umme_Kulsoom.pdf)
- ✅ [Test Cases](./TestCases.xlsx)
- ✅ [Extent Report](./Reports/ExtentReport.html)


## 🧪 How to Run

1. Clone this repo
2. Import in IntelliJ/Eclipse
3. Run `mvn clean test`
4. View the report at `/Reports/ExtentReport.html`

