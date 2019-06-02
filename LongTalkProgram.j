.class public LongTalkProgram
.super java/lang/Object

    .method public static main([Ljava/lang/String;)V
    .limit stack 99
    .limit locals 99
    
    ldc 0
    istore 1
    beginloop1:
    iload 1
    ldc 2
    if_icmplt lgctrue1
    ldc 0
    goto lgcend1
    lgctrue1:
    ldc 1
    lgcend1:
    ldc 1
    if_icmpne endloop1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Loop while:"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    invokevirtual java/io/PrintStream/println(I)V
    iload 1
    ldc 1
    iadd
    istore 1
    goto beginloop1
    endloop1:
    return
.end method
