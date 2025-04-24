
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

Collaborative software development commonly involves parallel contributions across branches in version control systems. Merging these branches can lead to complex conflicts—especially in the context of domain-specific models (DSMs), which follow graph structures rather than plain text.

**DSMCompare** is a dedicated tool designed for model differencing and conflict resolution in graphical domain-specific languages. It provides a comprehensive pipeline for computing and visualizing differences, leveraging both fine-grained and domain-specific semantics to aid resolution.

We enhance DSMCompare with advanced conflict resolution capabilities that minimize developer effort during model integration. This includes:
- Automated semantic conflict detection and merging based on predefined rules
- Visual conflict representation using the DSL's concrete syntax
- Domain-specific editors for intuitive conflict inspection
- Support for trivial merges and partial manual resolutions
- Undo/redo functionality for flexible conflict management

DSMCompare is built on a three-way model comparison engine that can identify semantic conflicts, apply domain-specific rules, and generate merged models. The resulting resolution-aware models are rendered with graphical syntax familiar to DSL users.

Our evaluation across multiple open-source DSL projects confirms that DSMCompare achieves high-resolution accuracy and significantly reduces user effort. It offers a reusable dataset of version histories annotated with conflict resolutions, providing a benchmark for future research.

Planned features include:
- AI-based learning of user conflict resolution behavior
- Integration into web-based version control systems tailored for DSLs
- Post-merge consistency verification


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

Here is a list of things you need to install.
* Eclipse (version 2020-09), Modeling 
  ```sh   
   In the Help/Install new software menu make sure that the following features with the versions specified in the (Built with section) installed
      . EMF
      . Henshin
      . EMF-Compare
      . Sirius 
      . Xtend
  ```
* Install Python (for the ordering algorithm)


### Installation and paths

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
    Results will be stored in the DSLs folder. For the Pac-Man case for example the result will be stored in the ".../dsls/pacman/dsdiffafterruningatest" path

3. **Ordering**

    3.1 To transform the DSRules to its equivalent in the Henshin:  Run the following method  
    ```sh
    dsmDiffRulesToHenshinTextRulesRun() 
    ```

    The result will be stored in a file with ".hensin_text" extension. You need to transform it to Henshin by right-clicking on it and selecting the transform command. For example, for the Pac-Man case study, the result will be stored in the ".../dsls/pacman/dsdiffrulesinhenshin/" path

    3.2 to calculate the conflicts among the DSRules: Run the following method. 
    ```sh
     dsmcConflictManagement()
    ```

    The results will be shown in the console and need to be copied and formatted to the python code that calculates the ordering.

    3.3. Calculate the ordering using the python code located in the following path:

    ```js
    SourceCode/VertexSortingPython/VertexSorting/vertex_sort.py
    ```

    3.4 Copy the conflict matrix retrieved from step 3.2 to the "adjacency_matrix" field. In the Pac-Man case study, the matrix is called "pacman.set_adjacency_matrix". Then run the code. The results (the ordering) will be shown in the console.

4. **Lifting**

    4.1 [Specify the rule units](https://wiki.eclipse.org/Henshin/Textual_Editor#Specifying_Units) representing the orders generated inside the ".henshin_text" file that is created in step 3.1. You also need to use the results generated in step 3.4 showing the preferred order of execution of the rules. The result will be stored in the path specified by the user. The pre-executed example results are stored in the "dsdiffrulesinhenshin" folder for each case study.

    4.2 Graphical concrete syntax project is stored in the following path
    ```sh
    SourceCode\runtime-Sirius
    ```
    4.3 Inside the Eclipse, select "com.Zadahmad.DSEMFCompare.editor" project and select RUN
    4.4 Select menu command "File/Open Projects from file system" and select "runtime-Sirius" project. There you can find examples from different case studies

5. **Conflict Detection, Resolution, and Merge**

    5.1 To detect semantic conflicts between fine-grained and semantic rules: 
    ```sh
    findSemanticSemanticFineConflicts()
    ```

    5.2 To apply semantic conflict resolution rules (e.g., undo or resolve interactively): 
    ```sh
    postRuleApplicationAuthorSet()
    ```

    5.3 To merge models based on resolved differences and generate the final result:
    ```sh
    setSemanticFineChangeStatusAfterTransformation()
    ```
    Then generate the final model or export to repository-ready format using internal serializer tools.

    Optional: Generate graphical preview of resolution via Sirius after transformation.

6. **Reports**

    6.1 To generate summary reports for fine-grained diffs and conflicts:
    ```sh
    produceReportFineDiffs()
    ```

    6.2 To generate statistics of model elements:
    ```sh
    produceReportElements()
    ```

    6.3 To report the number and kinds of semantic differences, conflicts, and conflict resolutions:
    ```sh
    produceReportSemanticDiffs()
    ```


## Supplements

_For supplementary data, please refer to the [supplements.md](supplements.md)_



<!-- USAGE EXAMPLES -->
## Usage

DSMCompare provides a comprehensive suite of experimental and operational test methods that demonstrate and validate its comparison, conflict resolution, and visualization capabilities. Each method below corresponds to specific stages or components in the workflow:

- `step1()` — Runs a full three-way fine-grained model comparison using EMF-Compare and transforms it to a domain-specific diff model.
- `step2()` — Applies semantic rules (from Henshin) on the diff model to identify semantic patterns and create a lifted representation.
- `step3()` — Detects conflicts between semantic and fine-grained differences.
- `step4()` — Post-processes diff models to attach string-based and authorship attributes required for advanced resolution logic.
- `step5()` — Finalizes semantic and fine conflict tagging for comprehensive conflict resolution.
- `step0004_test()` / `step0004_test2()` — Converts KDM (Knowledge Discovery Metamodel) models into abstract refactoring models.
- `step0007_Test()` — Applies post-rule author tagging after transformation (legacy support).
- `step0008_Test()` — Identifies all semantic-fine and semantic-semantic conflicts in a transformed diff model.
- `step0009()` — Assembles a benchmark dataset by collecting model versions and diff files across multiple repositories.
- `step00611()` — Converts user-defined domain-specific rules into executable Henshin transformation rules.
- `step005_2()` — Specifically focuses on converting selected rules into Henshin format for controlled experimentation.
- `produceReportFineDiffs()` — Extracts statistics on the number of fine-grained diffs and conflicts across the dataset.
- `produceReportSemanticDiffs()` — Aggregates and groups semantic diff elements by type to analyze rule coverage.
- `produceReportElements()` — Tallies element counts in diff models for validation and sanity checks.
- `helperRemoveDuplicatesFromCsv()` — Cleans duplicate entries in scenario CSV files used to track experiment metadata.
- `findSemanticSemanticFineConflicts()` — Performs full conflict analysis between semantic and fine-grained rules using Henshin CPA.
- `find_Potential_Semantic_AttributeChangeConflicts()` — Detects attribute-specific conflict types using rule-level analysis.
- `find_Potential_SemanticSemantic_SemanticFineConflicts()` — Uses MultiCDA for large-scale conflict detection and matrix generation.
- `orderRulesUsingMultiCDA()` — Orders rules based on their conflict dependency graph using a topological vertex sorting heuristic.
- `calculateandWriteRuleAttributes()` — Analyzes rules to count filters and elements for heuristics-based prioritization.
- `generate2WayDsDiffMM()` / `generate3WayDsDiffMM()` — Creates serializable meta-models for 2-way and 3-way differencing.
- `generate2WayDsRuleMM()` / `generate3WayDsCRRulesMM()` — Produces DSL rule models required to author or simulate semantic transformations.
- `dsDiffModelToDsDiffRuleTransform()` — Converts diff models into rule representations for downstream rule generation.
- `removeFilteredAssociations()` — Cleans up filtered (irrelevant) associations from diff objects to simplify reasoning.
- `mMAutoGenerateFineDiffRulesHenshinText()` — Auto-generates a full Henshin ruleset based on a domain-specific metamodel.
- `mMFineDiffRulesCorrectChangeRules()` — Refines generated rules by adjusting diff_kind and filter markers.
- `runHenshinTransformation()` / `runHenshinTransformation2()` — Runs selected Henshin transformations with input/output file specification.
- `callHenshinTofindSemanticDiffs()` / `findSemanticDiffs()` — Applies all semantic transformation units to a model and saves the result.
- `outputComparisonResult()` — Serializes and prints EMF-Compare result objects in JSON.



<!-- ROADMAP -->
## Roadmap

<!-- See the [open issues](https://github.com/geodes-sms/DSMCompare/issues) for a list of proposed features (and known issues).-->

## Publications

<ul>
  <li>
    From two-way to three-way: domain-specific model differencing and conflict detection 
    (<a href="https://www.jot.fm/issues/issue_2023_01/article5.pdf">https://www.jot.fm/issues/issue_2023_01/article5.pdf</a>)
  </li>
  <li>
    DSMCompare: domain-specific model differencing for graphical domain-specific languages 
    (<a href="https://idp.springer.com/authorize/casa?redirect_uri=https://link.springer.com/article/10.1007/s10270-021-00971-1">https://link.springer.com/article/10.1007/s10270-021-00971-1</a>)
  </li>
  <li>
    Domain-specific model differencing in visual concrete syntax 
    (<a href="https://dl.acm.org/doi/10.1145/3357766.3359537">https://dl.acm.org/doi/10.1145/3357766.3359537</a>)
  </li>
  <li>
    Domain-specific model differencing for graphical domain-specific languages 
    (<a href="https://dl.acm.org/doi/abs/10.1145/3550356.3552368">https://dl.acm.org/doi/abs/10.1145/3550356.3552368</a>)
  </li>
</ul>




<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

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
