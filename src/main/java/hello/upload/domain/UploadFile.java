package hello.upload.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UploadFile {
    private final String uploadFileName; // 업로드한
    private final String storeFileName; // 서버에 저장된
}
