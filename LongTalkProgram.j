.class public LongTalkProgram
.super java/lang/Object

    .method public static main([Ljava/lang/String;)V
    .limit stack 99
    .limit locals 99
    
    ldc 15
    istore 1
    ldc "Hello World"
    astore 2
    ldc 1
    istore 3
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    invokevirtual java/io/PrintStream/println(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload 2
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 3
    invokevirtual java/io/PrintStream/println(Z)V
    return
.end method
