# LongTalk

This language is about using more words than necessary to convey meaning.

It looks like a typed version of Ruby. Here are some concepts:

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

Respectively an integer and a normal string, like found in most high-level languages. A String is defined by quotation marks with character in them. An integer is a bunch of numbers with no space inbetween.


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

Conditionals are eagerly evaluated, so with the or statement (||), it will evaluate both sides

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

LongTalk support two kinds of loops. It can do an indexed loop from number to number that updates a given (instantiated) variable to the current index. This would be the same as the following:

``` ruby
# Declare <variableX>, <variableY> and <index>
loop while variableY - variableX < index do
	index is now index + 1
stop
```


### Comments

```ruby
# This is a comment
```

Comments are per line and indicated with a # at the start of a line.

### Whitespace

Is mostly ignored.

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
