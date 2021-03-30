# Usage
CobiGen has two different generation modes depending on the input selected for generation. The first one is the simple mode, which will be started if the input contains only one input artifact, e.g. for Java an input artifact currently is a Java file. The second one is the batch mode, which will be started if the input contains multiple input artifacts, e.g. for Java this means a list of files. In general this means also that the batch mode might be started when selecting complex models as inputs, which contain multiple input artifacts. The latter scenario has only been covered in the research group,yet.

## 1. Simple Mode
    Selecting the menu entry Generate​ the generation wizard will be opened.The left side of the wizard shows all available increments, which can be selected to be generated. Increments are a container like concept encompassing multiple files to be generated, which should result in a semantically closed generation output. On the right side of the wizard all files are shown, which might be effected by the generation - dependent on the increment selection of files on the left side. The type of modification of each file will be encoded into following color scheme if the files are selected for generation:

    - green: files, which are currently non-existent in the file system. These files will be created during generation

    - yellow: files, which are currently existent in the file system and which are configured to be merged with generated contents.

    - red: files, which are currently existent in the file system. These files will be overwritten if manually selected.

    - no color: files, which are currently existent in the file system. Additionally files, which were unselected and thus will be ignored during generation.

Selecting an increment on the left side will initialize the selection of all shown files to be generated on the right side, whereas green and yellow categorized files will be selected initially. A manual modification of the pre-selection can be performed by switching to the customization tree using the Customize button on the right lower corner.

Using the Finish button, the generation will be performed. Finally, CobiGen runs the eclipse internal organize imports and format source code for all generated sources and modified sources. Thus it is possible, that especially organize imports opens a dialog if some types could not be determined automatically. This dialog can be easily closed by pressing on Continue. If the generation is finished, the Success! dialog will pop up.

## 2. Batch mode
If there are multiple input elements selected, e.g., Java files, CobiGen will be started in batch mode. For the generation wizard dialog this means, that the generation preview will be constrained to the first selected input element. It does not preview the generation for each element of the selection or of a complex input. The selection of the files to be generated will be generated for each input element analogously afterwards.

Thus the color encoding differs also a little bit:

    - yellow: files, which are configured to be merged.

    - red: files, which are not configured with any merge strategy and thus will be created if the file does not exist or overwritten if the file already exists

    - no color: files, which will be ignored during generation

Initially all possible files to be generated will be selected.