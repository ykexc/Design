package type.lazy;

/**
 * 线程安全，但效率太低
 */
public class S3 {

    public static S3 s3;

    public synchronized static S3 getInstance() {
        if (s3 == null) s3 = new S3();
        return s3;
    }

}
