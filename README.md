
<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/geodes-sms/DSMCompare">
    <img src="images/logo.svg" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">DSMCompare</h3>

  <p align="center">
    Domain-Speciffc Model Differencing for Graphical Domain-Speciffic Languages
    <br />
    <a href="https://github.com/geodes-sms/DSMCompare"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <!--<a href="https://github.com/geodes-sms/DSMCompare">View Demo</a>-->
    ·
    <a href="https://github.com/geodes-sms/DSMCompare/issues">Report Bug</a>
    ·
    <a href="https://github.com/geodes-sms/DSMCompare/issues">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
        <li><a href="#implementation">Implementation</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#supplements">Supplements</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#publications">Publications</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

<!-- [![Product Name Screen Shot][product-screenshot]] (https://github.com/geodes-sms/DSMCompare)-->

During the development of a software project, different developers collaborate on creating and changing models. These models evolve and need to be versioned. Over the past several years, progress has been made in offering dedicated support for model versioning that improves on what is being supported by text-based version control systems. However, there is still a need to understand model differences in terms of the semantics of the modeling language, and to visualize the changes using its concrete syntax. To address these issues, we propose a comprehensive approach -called DSMCompare- that considers both the abstract and the concrete syntax of a domain-specific language (DSL) when expressing model differences, and which supports defining domain-specific semantics for specific difference patterns. The approach is based on the automatic extension of the DSL to enable the representation of changes and on the automatic adaptation of its graphical concrete syntax to visualize the differences. In addition, we allow for the definition of semantic differencing rules to capture recurrent domain-specific difference patterns. Since these rules can be conflicting with each other, we introduce algorithms for conflict resolution and rule scheduling. To demonstrate the applicability and effectiveness of our approach, we report on evaluations based on synthetic models and on version histories of models developed by third parties.


### Built With

* [Eclipse Modeling Framework (version 2020-09)](https://www.eclipse.org/downloads/)
* [EMF-Compare model comparison tool (version 3.3.9)](https://www.eclipse.org/emf/compare/)
* [Henshin (version 1.7)](https://www.eclipse.org/henshin/install.php)
* [Sirius editor (version 6.3.0)](https://www.eclipse.org/sirius/)


### Implementation 

DSMCompare consists of three main modules.
The **Comparison** module takes as input two model versions and produces the corresponding fine granular Diff model. This module relies on the EMF-Compare model comparison tool. The **Ordering** module computes the priority order of the Semantic Differencing Rules (SDRule) to be applied. It first transforms the SDRules into Henshin rules. Then, it invokes Henshin's MultiCDA tool to retrieve the potential conflicts among the rules. The ordering module takes the conflicts and the SDRules to produce the scheduling units of the Henshin transformation. Finally, the **Lifting** module applies this transformation on the Diff model to obtain the semantically lifted Diff model. The difference model is then fed to generated Sirius editor (version 6.3.0) to present the semantic Diff model in concrete syntax.


<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple example steps.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.
* Eclipse
  ```sh
   Install Eclipse (version 2020-09), Modeling 
   In the Help/Install new software menu make sure that the following features with the versions specified in the (Built with section) installed
      . EMF
      . Henshin
      . EMF-Compare
      . Sirius 
      . Xtend
  ```
* Install Python (for the ordering algorithm)


### Installation and pathes

1. Clone the repo (Codes are in the SourceCode folder)
   ```sh
   git clone https://github.com/geodes-sms/DSMCompare.git
   ```
2. **Comparison**

    Path for the DSLs (dsls folder)
      ```js
      SourceCode/DSMCompare/com.Zadahmad.DSEMFCompare.editor/dsls 
      ```
    Path for the Driver files (defined as JUnits)
      ```js
      SourceCode/DSMCompare/com.Zadahmad.DSEMFCompare.editor/src/com/zadahmad/dsemfcompare/editor/client
      ```

    2.1 Open the driver files like "CaseStudyDsmcPacman.java" in the Pac-Man case 

    2.2 To calculate the fine-granular diffs: Run the following method. 
    ```sh
    emfCompareResultToFineGranularDsmdiff() 
    ```
    Results will be stored in the dsls folder. For the pacman case for example the result will be stored in the ".../dsls/pacman/dsdiffafterruningatest" path

3. **Ordering**
    3.1 To transform the DSRules to its equivalent in the Henshin:  Run the following method  
    ```sh
    dsmDiffRulesToHenshinTextRulesRun() 
    ```

    The result will be stored in a file with ".hensin_text" extension. We need to tranform it to Henshin by right-click on it and select the transform command. For the pacman case for example the result will be stored in the ".../dsls/pacman/dsdiffrulesinhenshin/" path


    3.2 to calculate the conflicts among the DSRules: Run the following method . 
    ```sh
     dsmcConflictManagement()
    ```

    The results will be shown in the console and need to be copied and formatted to the python code that calculates the ordering.

    3.3. Calculate the ordering using the python code located in the following path:

    ```js
    SourceCode/VertexSortingPython/VertexSorting/vertex_sort.py
    ```
    3.4 copy the conflict matrix retrieved from the step 3.2 to the "adjacency_matrix" field. In the Pac-Man case it is "pacman.set_adjacency_matrix". Then run the code. Results will be shown in the console and provides you the ordering.

4. **Lifting** 

4.1 [Specify the rule units](https://wiki.eclipse.org/Henshin/Textual_Editor#Specifying_Units) representing the orders generated inside the ".henshin_text" file that is created in the step 3.1. You also need to use the results generated in the step 3.4 showing the prefered order of execution of the rules. The result will be stored in the specified path by the user. The pre-executed example results are stored in the "dsdiffrulesinhenshin" folder for each case.
4.2 



## Supplements

_For supplementary data, please refer to the [supplements.md](supplements.md)_



<!-- USAGE EXAMPLES -->
## Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples, and demos work well in this space. You may also link to more resources.

<!-- _For more examples, please refer to the [Documentation](https://example.com)_ -->



<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/geodes-sms/DSMCompare/issues) for a list of proposed features (and known issues).

## Publications

  <ul>        
    <li>
      <a href="https://dl.acm.org/doi/10.1145/3357766.3359537">Zadahmad, Manouchehr, Eugene Syriani, Omar Alam, Esther Guerra, and Juan de Lara. "Domain-specific model differencing in visual concrete syntax." In Proceedings of the 12th ACM SIGPLAN International Conference on Software Language Engineering, pp. 100-112. 2019.</a>
    </li>
  </ul>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what makes the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the GNU LESSER GENERAL PUBLIC LICENSE. See [LICENSE](https://github.com/geodes-sms/DSMCompare/blob/main/LICENSE) for more information.



<!-- CONTACT -->
## Contact

Manouchehr-Zadahmad - [LinkedIn](https://www.linkedin.com/in/manouchehr-zadahmad/) - zadahmad@gmail.com

Project Link: [https://github.com/geodes-sms/DSMCompare](https://github.com/geodes-sms/DSMCompare)



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Img Shields](https://shields.io)
