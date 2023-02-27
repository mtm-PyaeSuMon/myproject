package com.cgm.crud.common.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.web.multipart.MultipartFile;

/**
 * <h2> Base64ToMultipartFile Class</h2>
 * <p>
 * Process for Displaying Base64ToMultipartFile
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public class Base64ToMultipartFile implements MultipartFile{
	/**
	 * <h2> fileContent</h2>
	 * <p>
	 * fileContent
	 * </p>
	 */
	private final byte[] fileContent;
    /**
     * <h2> extension</h2>
     * <p>
     * extension
     * </p>
     */
    private final String extension;
    /**
     * <h2> contentType</h2>
     * <p>
     * contentType
     * </p>
     */
    private final String contentType;
    /**
     * <h2> timeMilli</h2>
     * <p>
     * timeMilli
     * </p>
     */
    private long timeMilli;

    /**
     * <h2> Constructor for Base64ToMultipartFile </h2>
     * <p>
     * Constructor for Base64ToMultipartFile
     * </p>
     * @param base64
     * @param dataUri
     */
    public Base64ToMultipartFile(String base64, String dataUri) {
        this.fileContent = Base64.getDecoder().decode(base64.getBytes(StandardCharsets.UTF_8));
        this.extension = dataUri.split(";")[0].split("/")[1];
        this.contentType = dataUri.split(";")[0].split(":")[1];
        this.timeMilli =System.currentTimeMillis();
    }

    /**
     * <h2> Constructor for Base64ToMultipartFile </h2>
     * <p>
     * Constructor for Base64ToMultipartFile
     * </p>
     * @param base64
     * @param extension
     * @param contentType
     */
    public Base64ToMultipartFile(String base64, String extension, String contentType) {
        this.fileContent = Base64.getDecoder().decode(base64.getBytes(StandardCharsets.UTF_8));
        this.extension = extension;
        this.contentType = contentType;
    }

    /**
     * <h2> getName </h2>
     * <p>
     * 
     * </p>
     * 
     * @return
     */
    @Override
    public String getName() {
        return "param_" + timeMilli;
    }

    /**
     * <h2> getOriginalFilename </h2>
     * <p>
     * 
     * </p>
     * 
     * @return
     */
    @Override
    public String getOriginalFilename() {
        return "file_" + timeMilli + "." + extension;
    }

    /**
     * <h2> getContentType </h2>
     * <p>
     * 
     * </p>
     * 
     * @return
     */
    @Override
    public String getContentType() {
        return contentType;
    }

    /**
     * <h2> isEmpty </h2>
     * <p>
     * 
     * </p>
     * 
     * @return
     */
    @Override
    public boolean isEmpty() {
        return fileContent == null || fileContent.length == 0;
    }

    /**
     * <h2> getSize </h2>
     * <p>
     * 
     * </p>
     * 
     * @return
     */
    @Override
    public long getSize() {
        return fileContent.length;
    }

    /**
     * <h2> getBytes </h2>
     * <p>
     * 
     * </p>
     * 
     * @return
     * @throws IOException
     */
    @Override
    public byte[] getBytes() throws IOException {
        return fileContent;
    }

    /**
     * <h2> getInputStream </h2>
     * <p>
     * 
     * </p>
     * 
     * @return
     * @throws IOException
     */
    @Override
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(fileContent);
    }

    /**
     * <h2> transferTo </h2>
     * <p>
     * 
     * </p>
     * 
     * @param file
     * @throws IOException
     * @throws IllegalStateException
     */
    @Override
    public void transferTo(File file) throws IOException, IllegalStateException {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(fileContent);
        }
    }

}
