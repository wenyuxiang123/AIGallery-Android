// Class: final Lcom.google.ai.edge.gallery.common.AudioClip
// Access: public
class AudioClip extends Ljava/lang/Object {

    // Fields:
    private final byte[] audioData;
    private final int sampleRate;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/common/AudioClip;->$stable:I
        return ;
    }
    public void constructor <init>(byte[], byte, int) {
        String v0 = "audioData";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/common/AudioClip;->audioData:[B
        // iput p2, p0, Lcom/google/ai/edge/gallery/common/AudioClip;->sampleRate:I
        return ;
    }
    public byte[] final getAudioData() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/AudioClip;->audioData:[B
        return v0;
    }
    public int final getSampleRate() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/common/AudioClip;->sampleRate:I
        return v0;
    }
}