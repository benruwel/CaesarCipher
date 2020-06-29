




<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://icons8.com/icon/83325/roman-soldier"></a>
<img src="https://img.icons8.com/ios/300/000000/roman-soldier.png" width="150" height="150"/>  

  <h3 align="center">Caesar Cipher</h3>

  <p align="center">
    Command line program that implements the Caesar Cipher encryption technique.
</p>
<p align="center" >Ben Ruwel</p>



<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [BDD](#bdd)
    * [Encryption](#encryption)
    * [Decryption](#decryption)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)
* [Acknowledgements](#acknowledgements)



<!-- ABOUT THE PROJECT -->
## About The Project

This is a commmand line program that implements the Caesar Cipher encryption tecgnique. This type of encryption is one of the simplest and most widely known encryption techniques. 

It is a type of substitution cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet. For example, with a left shift of 3, D would be replaced by A, E would become B, and so on. The method is named after Julius Caesar, who used it in his private correspondence

### Built With
This is program is wholely written in Java and built with
* [Oracle Java 11.8](https://www.oracle.com/java/)
* [Gradle 6.5](https://gradle.org/)
* [JUnit4](https://junit.org/junit5/)



<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple example steps.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.
* gradle
```sh
$ brew update
$ brew install gradle
```

### Installation

1. Clone the repo
```sh
$ git clone https://github.com/benruwel/CaesarCipher.git
```

2. Wait gradle to install all the dependencies automatically



<!-- USAGE EXAMPLES -->
## Usage

To build this project:

1. Open your preferred terminal 

2. In your project's root directory compile the project with
```sh
$ gradle compileJava
```
3. Then in the `build/classes/main/java` directory run this:
```sh
$ java App
```

## BDD
For both encryption and decryption:
1. Created a string of alphabets in the English language which I used it as a reference point 
2. Created an algorithm that looks for the index of the characters of the input string in relation to the alphabet

Using the indices from the above output, I used this algorithm to shift the characters.
### Encryption

For encryption of a letter _`x`_ by a shift  _`n`_  is described by:
```math
En(x) = (x + n) mod 26
```
The results are:
```results
Plain:    ABCDEFGHIJKLMNOPQRSTUVWXYZ
Cipher:   XYZABCDEFGHIJKLMNOPQRSTUVW
```


### Decryption

For decryption of a letter _`x`_ by a shift  _`n`_  is described by:
```math
En(x) = (x - n) mod 26
```
The results are:
```
Ciphered text: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
Plain text:  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
```

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

My email  - ruwelmwangi@gmail.com

Project Link:  [https://github.com/benruwel/CaesarCipher.git](https://github.com/benruwel/CaesarCipher.git)



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [IntelliJ](https://www.jetbrains.com/idea/)
* [Icons8](https://icons8.com/icons)
