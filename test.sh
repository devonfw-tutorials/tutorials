#!/bin/bash      
         playbook_list=() 
          for dir in */; do playbook_list+=("${dir::-1}"); done
          eq_name_message=""
          changed_file=["tutorial-pathway.json","cobigen-pathway.json"]
          files="$(echo $changed_file | cut -d/ -f1)"
		echo $files
        for file in $files; do    
 	    if [[ $file == *"pathway.json"* ]]
              then
		echo $file
                course_name=${file%"-pathway.json"}
		echo $course_name
                if [[" ${playbook_list[@]} " =~ " ${course_name} "]]
                  then
                    eq_name_message+="\n" + ${course_name} + " exist already. \n"
                fi
            fi
	done
echo $eq_name_message
echo ${playbook_list[@]}
