.class public LongTalkProgram
.super java/lang/Object

    .method public static main([Ljava/lang/String;)V
    .limit stack 99
    .limit locals 99
    
    ldc 0
    istore 1
    iload 1
    ldc 1
    if_icmpeq ifthen0
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "This code does not make sense anymore"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto ifend0
    ifthen0:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "The variable contained some FALSE. Wait, what?"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    ifend0:
    return
.end method
