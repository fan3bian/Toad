package interfaces;

import java.io.IOException;
import java.io.InputStream;

public interface InputStreamResource {
    InputStream getInputStream() throws IOException;

}
