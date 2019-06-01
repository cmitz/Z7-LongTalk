.class public LongTalkProgram
.super java/lang/Object

    .method public static main([Ljava/lang/String;)V
    .limit stack 99
    .limit locals 99
    
    ldc "Not a sentence"
    astore 1
    ldc 0
    ldc 1
    if_icmpeq then1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "This code does not make sense anymore"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto end1
    then1:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "This code does not make sense anymore"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    end1:
    return
.end method
