.class public Lcom/estrongs/fs/impl/e/g;
.super Ljava/io/FilterInputStream;


# instance fields
.field private final a:Lb/b/d;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Lb/b/d;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object p2, p0, Lcom/estrongs/fs/impl/e/g;->a:Lb/b/d;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    invoke-super {p0}, Ljava/io/FilterInputStream;->close()V

    iget-object v0, p0, Lcom/estrongs/fs/impl/e/g;->a:Lb/b/d;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/estrongs/fs/impl/e/g;->a:Lb/b/d;

    invoke-interface {v0}, Lb/b/d;->e()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
