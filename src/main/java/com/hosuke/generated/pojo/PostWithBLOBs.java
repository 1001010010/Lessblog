package com.hosuke.generated.pojo;

public class PostWithBLOBs extends Post {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.fullPostText
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    private String fullposttext;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.shortTextPart
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    private String shorttextpart;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.fullPostText
     *
     * @return the value of posts.fullPostText
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public String getFullposttext() {
        return fullposttext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.fullPostText
     *
     * @param fullposttext the value for posts.fullPostText
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public void setFullposttext(String fullposttext) {
        this.fullposttext = fullposttext == null ? null : fullposttext.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.shortTextPart
     *
     * @return the value of posts.shortTextPart
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public String getShorttextpart() {
        return shorttextpart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.shortTextPart
     *
     * @param shorttextpart the value for posts.shortTextPart
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public void setShorttextpart(String shorttextpart) {
        this.shorttextpart = shorttextpart == null ? null : shorttextpart.trim();
    }
}