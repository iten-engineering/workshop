Python Installation
===============================================================================

[TOC]


-------------------------------------------------------------------------------
# Python

Main features: 
- Interpreted language (no compiler) 
- Interactive mode via command line
- Object-oriented and/or functional programming 
- Types 
  - dynamic but strong typing (no variable declaration) 
  - all variables are actually object references: x = 2 
  - predefined complex types: tuple, list, set and dict 
- Statements 
  - control flow: if…elif…else, for and while 
  - grouping via whitespace indentation (no braces, no delimiter) 
- Many libraries (see https://docs.python.org)
- Hello World
  - start: python 
  - hello world: `print("hello world")` 
  - end: quit() 
- Verify current python version: `python --version`  

-------------------------------------------------------------------------------
# Package Manager

## Anaconda

- Anaconda 
  - Offers a free Python distribution that includes the most important packages and tools for data science tasks 
  - Details see: https://www.anaconda.com

- Company with a typical open source-based business model: additional tools, support, consulting, training and cloud hosting 

- Anaconda Navigator
  - Manages Anaconda installation and included tools 
  - Installed together with Anaconde
  - Details see https://docs.anaconda.com/anaconda/navigator


## Conda

### Intro
Package manager for Python (and other) packages (libraries):
- Packages are retrieved from a repository 
- Default and configurable repository 
- Supports multiple environments 
  - specific set of packages with specific versions 
  - configuration saved in environment.yaml 
  - can be shared between machines / developers 
  

Command                              | Description
------------------------------------ | ---------------------------------------- 
conda --version                      | Show version
conda info --envs                    | Show environments
conda create -n myenv phython=3.6.2  | Create environment with given phyton version
conda env remove -n myenv            | Remove environment
conda activate myenv                 | Activate the myenv environment
conda list                           | Show packages of active environment
conda install [pachagename]          | Install Package 
conda update [pachagename]           | Update Package 

> ! Execute command within the Anaconda Shell.

### Environment Yaml

Install a python environment with an `environment.yml` file:

1. Open Anaconda Shell

2. Go to your project folder:
   ..\workspace\myproject

3. Open `environment.yml` and set project name:
   ```
   name: myproject
   dependencies:
     - python=3.9
     - conda==4.9.2
     - pip=20.2.4
     - pip:
         - setuptools==51.0
         - numpy==1.19.4
         - pylint
         - streamlit
   ```

4. Install new Python environment:
   ```
   conda info --envs
   conda env create -f .\environment.yml
   conda env update -f .\environment.yml
   conda activate python-streamlit
   conda list
   ```

5. Analyse with Linter (optional)
   ```
   pylint [folder to scan]
   ```


### References
- Conda
  https://conda.io

- User Guide
  https://conda.io/docs/user-guide/getting-started.html


## PIP

Package manager for Python packages (libraries). Packages are retrieved from a repository (Python package index): 

Command                              | Description
------------------------------------ | ---------------------------------------- 
pip --version                        | Show version
pip list                             | List all installed packages
pip install [packagename]            | Install package
pip install [packagename] == 2.1     | Install package with specific version
pip install –r [requirements.txt]    | Install packages from requirements file
pip install --upgrade [packagename]  | Updata package

References:
- PIP
  https://pypi.org/project/pip

- User Guide
  https://pip.pypa.io/en/stable/user_guide

- PIP Reference:
  https://pip.pypa.io/en/stable/reference/pip_list/

- Python package index
  https://pypi.org 
  

-------------------------------------------------------------------------------
_The end._

