package com.luck.picture.lib.config;

/**
 * @author：luck
 * @date：2021/11/23 6:53 下午
 * @describe：SelectMimeType
 */
public class SelectMimeType {

    /**
     * GET image or video only
     * <p>
     * excluding Audio
     * </p>
     */
    public static int ofAll() {
        return TYPE_ALL;
    }

    /**
     * GET image only
     */
    public static int ofImage() {
        return TYPE_IMAGE;
    }

    /**
     * GET video only
     */
    public static int ofVideo() {
        return TYPE_VIDEO;
    }

    public static int ofAV() {
        return TYPE_AV;
    }

    /**
     * GET audio only
     * <p>
     * # No longer maintain audio related functions,
     * but can continue to use but there will be phone compatibility issues
     * <p>
     * 不再维护音频相关功能，但可以继续使用但会有机型兼容性问题
     */
    public static int ofAudio() {
        return TYPE_AUDIO;
    }


    public final static int TYPE_ALL = 0;
    public final static int TYPE_IMAGE = 1;
    public final static int TYPE_VIDEO = 2;
    public final static int TYPE_AUDIO = 3;

    public static final int TYPE_AV = 4;

    /**
     * System all image or video album
     */
    public final static String SYSTEM_ALL = SelectMimeType.SYSTEM_IMAGE + "," + SelectMimeType.SYSTEM_VIDEO;

    /**
     * System image album
     */
    public final static String SYSTEM_IMAGE = "image/*";
    /**
     * System video album
     */
    public final static String SYSTEM_VIDEO = "video/*";
    /**
     * System audio album
     */
    public final static String SYSTEM_AUDIO = "audio/*";

    public static final String SYSTEM_AV = SelectMimeType.SYSTEM_AUDIO + "," + SelectMimeType.SYSTEM_VIDEO;
}
