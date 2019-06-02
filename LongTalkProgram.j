.class public LongTalkProgram
.super java/lang/Object

    .method public static main([Ljava/lang/String;)V
    .limit stack 99
    .limit locals 99
    
    ldc 5
    istore 1
    ldc 0
    istore 2
    beginloop1:
    iload 2
    iload 1
    if_icmpge endloop1
    iinc 2 1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Indexed loop:"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 2
    invokevirtual java/io/PrintStream/println(I)V
    goto beginloop1
    endloop1:
    ldc 0
    istore 3
    beginloop2:
    iload 3
    ldc 2
    if_icmplt lgctrue2
    ldc 0
    goto lgcend2
    lgctrue2:
    ldc 1
    lgcend2:
    ldc 1
    if_icmpne endloop2
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Loop while:"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 3
    invokevirtual java/io/PrintStream/println(I)V
    iload 3
    ldc 1
    iadd
    istore 3
    goto beginloop2
    endloop2:
    return
.end method
