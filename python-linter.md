Python Linter (Style Guides and Code Quality)
===============================================================================

-------------------------------------------------------------------------------
# Overview

The Python Enhancement Proposal's (PEP's)] define some **best practices** for writing Python programs. 

> The following two PEP's define guide lines for writing and documenting python code. 
> It's worth taking a look at them and following the recommendations. 


## Style Guide for Python Code (PEP 8)

PEP 8 is the official style guide for python. It is important to know the style-guide if you want to be a part of the python-community.

The most important PEP8 coding conventions are:
- Spaces are the preferred indentation method.
- Use 4 spaces per indentation level.
- Limit all lines to a maximum of 79 characters.
- Separate top-level function and class definitions with two blank lines.
- Method definitions inside a class are surrounded by a single blank line.
- Imports should be grouped in the following order:
  - Standard library imports.
  - Related third party imports.
  - Local application/library specific imports.
  - A blank line between each group of imports.

For the full details see [Style Guide for Python Code (PEP 8)](https://www.python.org/dev/peps/pep-0008).


## Docstring Conventions (PEP 257)

PEP 257 is the official style guide for comments and documentation of python programs. It defines semantics and conventions associated with Python docstrings. 

For the full details see [Docstring Conventions (PEP 257)](https://www.python.org/dev/peps/pep-0257).


## Considerations
The following considerations, stated in the introduction section of PEP 8 are also important to keep in mind.

> One of Guido's key insights is that code is read much more often than it is written. The guidelines provided here are intended to improve the readability of code and make it consistent across the wide spectrum of Python code. As PEP 20 says, "Readability counts".


 A style guide is about consistency. Consistency with this style guide is important. Consistency within a project is more important. Consistency within one module or function is the most important.

However, know when to be inconsistent -- sometimes style guide recommendations just aren't applicable. When in doubt, use your best judgment. Look at other examples and decide what looks best. And don't hesitate to ask! 

In particular: do not break backwards compatibility just to comply with this PEP!

Some other good reasons to ignore a particular guideline:
- When applying the guideline would make the code less readable, even for someone who is used to reading code that follows this PEP.
- To be consistent with surrounding code that also breaks it (maybe for historic reasons) -- although this is also an opportunity to clean up someone else's mess (in true XP style).
- Because the code in question predates the introduction of the guideline and there is no other reason to be modifying that code.
- When the code needs to remain compatible with older versions of Python that don't support the feature recommended by the style guide.

Source: [A foolish consistency is the hobgoblin of little minds (PEP 8)](https://www.python.org/dev/peps/pep-0008/#a-foolish-consistency-is-the-hobgoblin-of-little-minds) 

-------------------------------------------------------------------------------
# Tools

## Overview

There are many different linters and formaters for Python. 

A good overview you can find on the [Essential Python Tools Overview](https://books.agiliq.com/projects/essential-python-tools/en/latest/linters.html) site or the the following table from the [VS Code Linting](https://code.visualstudio.com/docs/python/linting) documentation:

![VS Code Linters](img/styleguide-vscode-linters.png)


## Pylint
Pylint is a Python static code analysis tool which looks for programming errors, helps enforcing a coding standard, sniffs for code smells and offers simple refactoring suggestions. It is one of the most commonly used tool for linting in Python.

Installation:
```
pip install pylint
```

Help:
```
pylint                                            # show help
pylint --long-help                                # show detailed help
```

Usage: 
```
pylint {source_file_or_directory}                 # scan file or directory
```

### The most important in a nutshell
This section shows the most important information about the configuration and usage of Pylint. For further details see the Pylint [Repository](https://pypi.org/project/pylint/), [Homepage](https://github.com/PyCQA/pylint) and [User Manual](http://pylint.pycqa.org/en/.latest/).


#### Configuration
The following environment variables are used: 
- PYLINTHOME : Path to the directory where persistent data for the run will be stored.  
  If not found, it defaults to ~/.pylint.d/ or .pylint.d (in the current working directory)     
- PYLINTRC : Path to the configuration file. For the possible file locations
  see the [User Guide](http://pylint.pycqa.org/en/latest/user_guide/run.html).

Note: To create a custom configuration file, tailored to your needs. You can generate one using pylint's command --generate-rcfile.

#### Output status code
Pylint will return one of the following status codes:
- 0 if everything went fine
- 1 if a fatal message was issued
- 2 if an error message was issued
- 4 if a warning message was issued
- 8 if a refactor message was issued
- 16 if a convention message was issued
- 32 on usage error

> The status 1 to 16 will be bit-ORed so you can know which different categories has been issued by analysing pylint output status code.

#### Message types
The output messages distinguishes the following message types:
- [I]nformational messages that Pylint emits (do not contribute to your analysis score)
- [R]efactor for a "good practice" metric violation
- [C]onvention for coding standard violation
- [W]arning for stylistic problems, or minor programming issues
- [E]rror for important programming issues (i.e. most probably bug)
- [F]atal for errors which prevented further processing

Disable message type:
```
pylint --disable=C   {source_file_or_directory}   # disable convention
pylint --disable=C,R {source_file_or_directory}   # disable convention and refactor
```

Show details for a message:
```
pylint --help-msg={message-id}                    # show details of a message
pylint --help-msg=W0613                           # show details of message W0613
```

#### Message control
Pylint has an advanced message control for its checks, offering the ability to enable / disable a message either from the command line or from the configuration file, as well as from the code itself. Details see [Pylint message control](http://pylint.pycqa.org/en/latest/user_guide/message-control.html).

#### Naming Styles
By default, Pylint will enforce PEP8-suggested names. However, you can select also other
predefined naming styles (like snake_case, camelCase, PascalCase, etc.). Details see 
[Pylint configuration naming styles](http://pylint.pycqa.org/en/latest/user_guide/options.html).


#### Reports
Following the analysis message, Pylint can display a set of reports, each one focusing on a particular aspect of the project, such as number of messages by categories, modules dependencies. 

These features can be enabled through:
```
pylint --reports=y {source_file_or_directory}     # enable reports
pylint -rn         {source_file_or_directory}     # enable reports shorthand version
```

#### Score
Finally, Pylint displays a global evaluation score for the code, rated out of a maximum score of 10.0. This output can be suppressed through the `--score=n` option, or its shorthand version `-sn`.

The evaluation formula can be overridden with the `--evaluation=<python_expression>` option.


## Pycodestyle (PEP 8)
Pycodestyle (formerly pep8) is the official linter tool to check the python code against the style conventions of PEP 8 python.

For further details see the Pycodestyle [Repository](https://pypi.org/project/pycodestyle) and [Documentation](https://pycodestyle.pycqa.org/en/latest/).

Installation:
```
pip install pycodestyle
```

Usage: 
```
pycodestyle  {source_file_or_directory}
```


## Pyflakes
Pyflakes is a simple program which checks Python source files for errors. It analyzes programs and detects various errors. It works by parsing the source file, not importing it, so it is safe to use on modules with side effects. This approach also much faster.

For further details see the Pyflakes [Repository](https://pypi.org/project/pyflakes/) and [Homepage](https://github.com/PyCQA/pyflakes).

Installation:
```
pip install pyflakes
```

Usage: 
```
pyflakes {source_file_or_directory}
```


## Flake 8
Flake8 is a wrapper around these tools:
- PyFlakes
- pycodestyle
- Ned Batchelder’s McCabe script (circular complexity checker)

Flake8 runs all the tools by launching the single flake8 command. It displays the warnings in a per-file, merged output. If you like Pyflakes but also want stylistic checks, flake8 is a good choice.

Installation:
```
pip install flake8
python<version> -m pip install flake8
```

Help: 
```
flake8 -h
flake8 --help
```

Usage: 
```
flake8 {source_file_or_directory}
flake8 {source_file_or_directory} --statistics
flake8 path/to/your_code/main.py                 #check particular file
flake8 path/to/your_project/                     #check the entire project repo
```

> Note: If you have installed Flake8 on a particular version of Python (or on several versions), it may be best to instead run: **python<version> -m flake8**


### The most important in a nutshell
This section shows the most important information about the configuration and usage of Flask8. For further details see the Flake8 [Repository](https://pypi.org/project/flake8/), [Homepage](https://gitlab.com/pycqa/flake8), [Documentation](https://flake8.pycqa.org/en/latest/) or [FAQ](https://flake8.pycqa.org/en/latest/faq.html).

#### Configuration
Flake8 supports storing its configuration in the following places:
- User locations for global configurations
  - The user configuration file is expected to be stored in the user’s home directory: 
    `~/.config/flake8` for Linux and other unix like systems, `~/.flake8` for Windows
- Project location for project specific configurations
  - In the project in one of `setup.cfg`, `tox.ini` or `.flake8` file.

**Priority:**
The configuration settings have the following priortiy order:
1. command line have highest priority
2. then those in the project configuration file
3. then those in your user directory 
4. and finally there are the defaults 

However, there are additional command line options which can alter this.

**Sample:**
The following snippet shows configuration file sample and it's equivalent command line call:

Configuration file:
```
[flake8]
ignore = D203
exclude = .git,__pycache__,docs/source/conf.py,old,build,dist
max-complexity = 10
```

Command line:
```
flake8 --ignore D203 \
       --exclude .git,__pycache__,docs/source/conf.py,old,build,dist \
       --max-complexity 10
```

#### Output status code
By default Flake8 will exit with a non-zero integer if there are errors.

With the `exit-zero` option you can force Flake8 to use the exit status code 0 even if there are errors:
```
flake8 --exit-zero {source_file_or_directory}
```

#### Message types
Flake8 installs pycodestyle, pyflakes, and mccabe by default and generates its own message codes for pyflakes. See [Error / Violation Codes](https://flake8.pycqa.org/en/latest/user/error-codes.html) for the full list.

The output messages distinguishes the following violation classes:
- [E] class violations are “errors” reported by pycodestyle
- [F] class violations are reported by pyflakes
- [W] class violations are “warnings” reported by pycodestyle
- [C9] class violations are reported when the user specifies flake8 --max-complexity
- [N8] Naming Conventions plugin pep8-naming

It is possible to `select` or `ignore` certain violations reported by Flake 8 and the installed plugins. 

Run flake for a specific type of error:
```
flake8 — select W54 path/to/your_project/
```

To ignore warnings you can do:
```
flake8 — ignore W54 path/to/your_project/
```

> Note: It’s also possible to combine usage of flake8 `--select` and `--ignore`.

#### Message control
You can control the Flask 8 behaviour in different ways. You can skip a whole file from the analysis as well as ignore specific errors. 

Files that contain this line are skipped:
```
# flake8: noqa
```

Skip specific error:
```
# noqa: E234
```

Skip specific errors:
```
# noqa: <error 1>, <error 2>, <error 3>
```

#### Reports
With the `statistics` option you can enable a report with the number of occurrences of each error/warning:
```
flake8 --statistics {source_file_or_directory}
```

With the `benchmarks` option flake will aggregates the total number of: tokens, physical lines, logical lines, files and the number of elapsed seconds:
Show report with statistics:
```
flake8 --benchmark {source_file_or_directory}
```

## MyPy
Mypy is an optional static type checker for Python that aims to combine the benefits of dynamic (or "duck") typing and static typing. Mypy combines the expressive power and convenience of Python with a powerful type system and compile-time type checking. 

For further details see the Mypy [Homepage](http://mypy-lang.org/index.html).


## Summary
The two most popular python linters are Pylint and Flake8. Both check adherence to PEP8 but vary a bit in what other rules they check. In general Pylint tends to be a bit more stringent and give more false positives but both are good options for linting python code.

-------------------------------------------------------------------------------
# IDE Integration

A short description for the integration of Pylint and Flake8 into VS Code and IntelliJ/PyCharm is delivered here. However, the linters can also be integrated into many other IDE's of your choice. Further details see for example in the [Pylint IDE Integration](http://pylint.pycqa.org/en/latest/user_guide/ide-integration.html) guide.


## VS Code
Both Pylint and Flake8 can be configured in VS Code using the VS Code python extension. To enable a specific linter, please follow the chapters below. 

For further details see [VS Code Python Linters](https://code.visualstudio.com/docs/python/linting).


### Select linter
To select a specific linter, please follow the steps below:
1. Open the Command Palette (Ctrl+Shift+P) 
2. Search for the command `Python: Select Linter` 
3. Select the desired linter like `flake8` or `pylint`


### Enable/Disable linting
1. Open the Command Palette (Ctrl+Shift+P) 
2. Search for the command `Python: Enable Linting` 
3. Select `on` or `off`


### Run linting
To perform linting:
- Linting runs automatically when you save a file.
- Open the Command Palette (Ctrl+Shift+P), then enter and select the command `Python: Run Linting`.

Issues are shown in the Problems panel and as underlines in the code editor. Hovering over an underlined issue displays the details:
![VS Code Linters](img/styleguide-vscode-problems.png)


## IntelliJ and PyCharm

The Python Plugin already delivers a large number of inspection options, including
PEP 8. In addition, both Pylint and Flake8 can be configured in IntelliJ or PyCharm by the corresponding [Pylint Plugin](https://plugins.jetbrains.com/plugin/11084-pylint) and [Flake8 Plugin](https://plugins.jetbrains.com/plugin/11563-flake8-support).

To enable a specific plugin, please follow the chapters below. For further details see also [PyCharm Code inspections.](https://www.jetbrains.com/help/pycharm/code-inspection.html).


### Python Plugin

#### Enable Inspections
![Enable Python inspections](img/styleguide-intellij-python.png)


### Pylint Plugin

#### Install pylint
![Install pylint](img/styleguide-intellij-pylint.png)

#### Enable pylint
![Enable pylint](img/styleguide-intellij-pylint-enable.png)

#### Run pylint
![Run pylint](img/styleguide-intellij-pylint-run.png)


### Flake8 Plugin

#### Install flake8
![Install pylint](img/styleguide-intellij-flake8.png)

#### Run flake8
![Run pylint](img/styleguide-intellij-flake8-run.png)

-------------------------------------------------------------------------------
# CI/CD Integration

The following description shows how to integrate Pylint and Flake 8 into a **GitLab Pipeline**. MyPy will not be enforced and is therefor not part of this description. 


## Integration Steps

You need to accomplish the following steps for a successfull integration:

1. First your project oder builder image must contain the `pylint` and `flake8` libraries.

2. Your Pipeline Script needs a `validation` or `code analyses` stage, where you will run the linters. In the give stage you can then invoke the linters.

3. Depending on your needs, you can configure the linters which message types (levels) that shall be validated against. You can for example disable the convention messages of pylint with the option `--disable=C`.

4. You can configure if GitLab shall continue in the case of linter messages or not. 
You can for example set the `allow_failure: true` option within the GitLab pipeline file, to continue the pipeline jobs in case of linter messages like errors or warnings.


## Code snippets
The following snippets show just a possible way to integrate the linters into your GitLab pipeline. There are for sure many other ways too.


#### environment.yml
```
name: python-qs
dependencies:
  - python=3.9
  - conda==4.9.2
  - pip=20.2.4
  - pip:
      - setuptools==51.0
      - numpy==1.19.4
      - flake8
      - pylint
```


#### .gitlab-cy.yml:
```
image: diemobiliar.azurecr.io/pyt-library-wsbuilder-image:48

before_script:
  - python --version
  - conda env create -f environment.yml --name python-qs
  - source activate python-qs
  - conda list

stages:
  - Static Analysis

flake8:
  stage: Static Analysis
  script:
    - flake8 --max-line-length=100 --statistics python_qs/*.py

pylint:
  stage: Static Analysis
  allow_failure: true
  script:
    - pylint --disable=C,R --reports=y python_qs
```

Notes:
- The python code of this sample project is within the python_qs directory
- The pipeline uses a builder image with a preinstalled python distribution. Depending of the installed distributen, the initialization (within the before_script section) may vary.
- The pylint analyses will skip the mesages types C and R and show a detailed report at then end


-------------------------------------------------------------------------------
# References

## Guides

- Python Developer's Guide
  https://devguide.python.org/

- Index of Python Enhancement Proposals (PEPs)
  https://www.python.org/dev/peps/ 

- Style Guide for Python Code (PEP 8)
  https://www.python.org/dev/peps/pep-0008

- Docstring Conventions (PEP 257)
  https://www.python.org/dev/peps/pep-0257/

- Future import  
  https://stackoverflow.com/questions/7075082/what-is-future-in-python-used-for-and-how-when-to-use-it-and-how-it-works 


## Tools

- Linting Python in Visual Studio Code
  https://code.visualstudio.com/docs/python/linting

- Linters and Formatters    
  https://books.agiliq.com/projects/essential-python-tools/en/latest/linters.html

- OWASP
  https://owasp.org/www-community/Source_Code_Analysis_Tools 

- Flake8
  https://flake8.pycqa.org/en/latest/user/index.html 


## Articles

- Python Code Reviews
  https://microsoft.github.io/code-with-engineering-playbook/code-reviews/recipes/Python.html

- Reviewer Guidance
  https://microsoft.github.io/code-with-engineering-playbook/code-reviews/process-guidance/reviewer-guidance.html 

- Security Tools
  https://github.com/rmkanda/tools 

- Pylint vs Flake8
  https://www.slant.co/versus/12630/12632/~pylint_vs_flake8

- Style guides and linter tools
  https://siderlabs.com/blog/about-style-guide-of-python-and-linter-tool-pep8-pyflakes-flake8-haking-pyling-7fdbe163079d

-------------------------------------------------------------------------------
_The end._

