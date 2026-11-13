# Number System App

Its is my first Java program a console app that converts numbers between **Binary**, **Octal**, **Decimal** and **Hexa-Decimal**.

---

## What it does

1. Shows a menu to pick a number system:
   - Binary
   - Octal
   - Decimal
   - Hexa-Decimal
2. Asks you to enter a value in that number system.
3. Checks that the value is valid (for instance no `2` in binary, no `8` in octal etc).
4. Asks which number system you want to convert it to.
5. Shows the result.
6. Asks if you want to go again.

---

## Conversions supported

| From          | To                              |
|---------------|---------------------------------|
| Binary        | Octal, Decimal, Hexa-Decimal    |
| Octal         | Binary, Decimal, Hexa-Decimal   |
| Decimal       | Binary, Octal, Hexa-Decimal     |
| Hexa-Decimal  | Binary, Octal, Decimal          |

There is also a **"to all number systems"** option for every case.

---

## How to run

You need Java installed (JDK 17 or later versions preffered)

```bash
javac numbersystema.java
java numbersystema
```

## How it works

- Each number system has its own case inside a switch.
- The input is checked character by character with a loop.
- Each conversion is a separate method, for example:

```bash
binaryToDecimal(String binary)

octalToHexadecimal(String octal)

decimalToBinary(String decimal)

hexadecimalToOctal(String hexadecimal)
```

The whole menu repeats using do while loops.

---

## Notes:
- There are things that I want to fix but I dont have much time nowdays.
- I Know it seems to be simple but that's the beauty man!!