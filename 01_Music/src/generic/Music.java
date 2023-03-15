package generic;

/**
 *
 * @author arifa
 */
public class Music {
    String path, fileName, filseSize, extention;
    
    public Music(String p, String fn, String fs, String e){
        this.path = p;
        this.fileName = fn;
        this.filseSize = fs;
        this.extention = e;
    }
    
    public String getPath() {
        return path;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilseSize() {
        return filseSize;
    }

    public String getExtention() {
        return extention;
    }
    
}
