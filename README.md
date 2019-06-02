# LongTalk

This language is about using more words than necessary to convey meaning. It looks like a typed version of Ruby.
It was built using ANTLR4 and Jasmin, and runs on the JVM.

LongTalk was created by Casper Smits (s402588) in may 2019.

## Requirements

This project (folder) can be opened in IntelliJ and depends on Java 8 and requires that as an External Library, as well
as JUnit5.3.

I hear you thinking: "JUnit? Are there tests?" That's right! There are! In this `examples` folder there are 10 source
files, all those files are used in the compiler. 5 of them will generate proper code, 5 of them will fail. Those
failures are also documented in the tests.     

## Features list

The language supports:
- 3 data types
- variables
- the math operations +, -, *, /
- expressions between parenthesis: `(` and `)`
- logical operations <, <=, >, >=, ==, !=, && and ||
- branching with if, else, and else if
- while loops and an indexed for loop
- printing variables and values
- scoping variables, e.g. in if statements

The compiler sports:

- a type-checker that collects all semantic errors in your code
- immediate execution after compilation with the `--execute` argument

> **Note:** The compiler does not support outputting into another file other than `LongTalk.j` and `LongTalk.class` 

> **Note 2:** To see what the output of example 4 (branching) looks like in Jasmin bytecode,
> look at the `LongTalk.j` file.  

## Usage

Program arguments: `<source file> [--execute]` e.g. `"$ProjectFileDir$/examples/04-branching.lt" --execute`

## Concepts

### Data Types

```
int
```

and

```
string
```

and 

```
boolean
```

These are the supported Data Types: int, string and boolean, ike found in most high-level languages.
A String is defined by quotation marks with character in them. An integer is a bunch of numbers with no space inbetween.
Booleans are the literal `TRUE` and `FALSE`.


### Output

```
print "Hello world!"
```

A print statement will output whatever argument is given. Can output strings as well as integers, and takes a single argument.


### Declarations

```
remember that <variableName> is a string
remember that <variableName2> is an int
remember that <variableName3> is a boolean
``` 

It consists of `remember that`, some variable name, `is a` or `is an` (does not matter which one) and a data type.

### Assignments

```
<variableName> is now <value>
```

- You can only assign values to variableNames that have been declared already

### Expressions

- can be either Mathematical expressions like `+`, `-`, `*`, `/`, `(`  `)` or
- boolean operators like `<`, `>`, `==`, `!=` and `||`

### Conditionals
```ruby
if myVariable == "Some words"
  print "The variable contained some words."
else if 42 > 99 || 42 == 42
  print "42 is truly the answer"
else
  print "This code does not make sense anymore"
stop 
```

Conditionals are eagerly evaluated, so when at an `||` statement, it will evaluate both sides!

### Program

```ruby 
program do
  ...
stop
```

- Marks the environment of the program, is the basic structure.
- Does not need to be on multiple lines.
- Source file can not contain multiple programs.

### Loops

```ruby
# Declare <variableX>, <variableY> and <index>
indexed loop from <variableX> to <variableY> as <index> do
  print identifier
stop
```

LongTalk support two kinds of loops. It can do an indexed loop from number to number that updates a given
(instantiated) variable to the current index. This would be the same as the following:

``` ruby
# Declare <variableX>, <variableY> and <index>
loop while variableY - variableX < index do
  index is now index + 1
stop
```

### Comments

```ruby
program do
  # This is a comment
  ...
stop
```

Comments are per line and indicated with a `#` at the start of a line.

### Whitespace

Is mostly ignored, just like it is in Java, C++ and other common languages

### Summary

| Concept | Code |
|:--------|:-----|
| Data types | `int`, `string` and `boolean` |
| Declarations | `remember that <variableName> is a string` |
| Assignments | `<variableName> is now <value>` | 
| Expressions | `+`, `-`, `*`, `/`, `(`  `)` |
| Print | `print "Hello world!"` |
| Conditionals | `if <variable> || <boolean expression> <statements> stop` |
| Program | `program do ... stop` |
| Comments | `# This is a comment` |
| Whitespace | ignored |


## Examples

### Simple program

```ruby
program do
  print 14 + 4 / 6
stop
```

### Variables

```ruby
program do
  remember that myVariable is an int
  myVariable is now 15
  
  remember that myWords is a string
  myWords is now "Hello World"
  
  print myVariable
  print myWords
stop
```

### Logic

```ruby
program do
  remember that someVar is an int
  someVar is now 10
  
  if !(someVar == 1 || someVar < 9 || someVar > 10)
    print "The variable meant something."
  stop
stop
```

### More examples

More examples can be found in the `examples` folder.

## Implementation struggles

While implementing, I had some struggles with the following things.

When declaring a variable, a Symbol is created inside a Scope while type checking to prevent out of scope errors.
However, since I also needed to keep track of local variable slots in the code generator, there is a Scope tree in the
code generator as well. This feels like it could be more simplified, but that might take another tree walker and that
does not solve the symplicity issues. It might have been done with replacing the DataType type with Symbol in the
Checker, but that would have a high impact on other things as well.

I had to adjust the grammar a few times. Where the tree was working very nicely with recursive tactics, it was
sometimes unworkable in the checker and code generator. I also discovered the ANTLR syntax `+=` quite late, so I would
actually visit child nodes in if-statements based on index instead of label name. The grammar is a little convoluted and
should be more clean in my opinion. It is readable, but not as readable and clean as I intended. 

Early on, LongTalk actually supported if-statements with the extra `do` keyword, like `if TRUE do ... stop`. However,
it was not clean and gave me some tree parse errors. However, if I had the extra time, I would support passing regular 
`do ... stop` blocks to an if statement, and also support those blocks without any context to allow for more detailed
scoping. 

Last but not least, not everything is as verbose as I intended LongTalk to be. My creativity let me down, perhaps
because of time pressure. Also, writing the examples before the checker and generator made me realise I wanted something
workable for myself.






