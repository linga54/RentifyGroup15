# Rentify: Android Rental Marketplace

Rentify is an Android app that connects people who want to rent out items (lessors) with people who want to rent them (renters). It was built for the SEG 2105 (Introduction to Software Engineering) at the University of Ottawa, Fall 2024, by our team of three.

This is my fork of the team repository: https://github.com/GabrielElgwaily/RentifyGroup15

## Features

- **Three user roles:** Admin, Lessor, Renter
- **Admin:** manage item categories and user accounts
- **Lessor:** create, update, and delete listings (name, category, fee, rental duration, description) and accept or deny rental requests
- **Renter:** browse and search items by name or category and submit rental requests
- Data is stored and synced live with Firebase Realtime Database

## Tech stack

Java, Android Studio, Firebase Realtime Database, JUnit, Git/GitHub

## Running the project

1. Clone the repo and open it in Android Studio.
2. Let Gradle sync finish (use the embedded JDK 17 or 21 as the Gradle JDK).
3. Run the `app` configuration on an emulator or device.

## Running the tests

```bash
./gradlew testDebugUnitTest
```

There are [23] unit tests covering item validation (`ItemValidatorTest`) and admin login rules (`AuthRulesTest`) that I made sure to test and create.

## My contributions

- Built the lessor listing screen and the Firebase Realtime Database connection (create, update, and delete listings)
- Designed the UML class diagrams and domain model used by the team
- Wrote the unit tests above and moved the validation logic into testable classes (`ItemValidator`, `AuthRules`)
- Fixed a crash when a listing was submitted with an empty or non-numeric fee or time field

## Team

Gabriel Elgwaily, Audrey Sampaleanu, Marieva Ingabire
