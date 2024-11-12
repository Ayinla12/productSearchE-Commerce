# Test Cases for Automation Exercise

This document outlines the test cases for the Automation Exercise website's basic functionalities.

---

## Test Case 1: Verify Homepage Launch and Visibility

- **Test Case ID**: TC001
- **Title**: Launch Homepage and Verify Visibility
- **Description**: Verifies that the homepage of the application loads successfully.
- **Preconditions**:
  - The browser is installed on the machine.
  - The user has access to the application URL: `https://automationexercise.com/`
- **Test Steps**:
  1. Launch the browser.
  2. Navigate to `https://automationexercise.com/`.
  3. If a consent button appears, click to close it.
- **Expected Results**:
  - The homepage should load successfully, with the title "Automation Exercise".
- **Postconditions**: The browser remains open.

---

## Test Case 2: Navigate to Products Page and Verify Visibility

- **Test Case ID**: TC002
- **Title**: Navigate to Products Page and Verify Visibility
- **Description**: Verifies that the user can navigate to the "Products" page and that the page loads successfully.
- **Preconditions**:
  - TC001 must be completed successfully (homepage is loaded).
- **Test Steps**:
  1. On the homepage, locate and click the "Products" button.
- **Expected Results**:
  - The user is redirected to the "All Products" page.
  - The page title is "Automation Exercise - All Products".
- **Postconditions**: The browser remains open, and the user is on the "All Products" page.

---

## Test Case 3: Search for a Product and Verify Search Results

- **Test Case ID**: TC003
- **Title**: Search for a Product and Verify Results
- **Description**: Verifies that users can search for a specific product and view related search results.
- **Preconditions**:
  - TC002 must be completed successfully (user is on the "All Products" page).
- **Test Steps**:
  1. Locate the search input field.
  2. Enter the product name "shirts" into the search input.
  3. Click the "Search" button.
- **Expected Results**:
  - The URL updates to show search results (e.g., `https://automationexercise.com/products?search=shirts`).
  - A section labeled "SEARCHED PRODUCTS" is displayed.
  - The search results contain one or more products matching "shirts."
- **Postconditions**: The browser remains open.

---
