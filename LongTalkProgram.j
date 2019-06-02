.class public LongTalkProgram
.super java/lang/Object

    .method public static main([Ljava/lang/String;)V
    .limit stack 99
    .limit locals 99
    
    ldc 0
    istore 1
    iload 1
    ldc 1
    if_icmpeq ifthen1
    ldc 42
    ldc 99
    if_icmpgt lgctrue2
    ldc 0
    goto lgcend2
    lgctrue2:
    ldc 1
    lgcend2:
    ldc 42
    ldc 42
    if_icmpeq lgctrue3
    ldc 0
    goto lgcend3
    lgctrue3:
    ldc 1
    lgcend3:
    iadd
    ldc 1
    if_icmpge lgctrue1
    ldc 0
    goto lgcend1
    lgctrue1:
    ldc 1
    lgcend1:
    ldc 1
    if_icmpne ifend1_1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "42 is truly the answer"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto ifend1
    ifend1_1:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "This code makes perfectly sense"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto ifend1
    ifthen1:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "The variable contained some FALSE. Wait, what?"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    ifend1:
    return
.end method
