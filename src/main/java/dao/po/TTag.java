package dao.po;

public class TTag {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.id
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.creator
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    private String tag;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    public TTag(String id, String creator, String tag) {
        this.id = id;
        this.creator = creator;
        this.tag = tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    public TTag() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tag.id
     *
     * @return the value of t_tag.id
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tag.id
     *
     * @param id the value for t_tag.id
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tag.creator
     *
     * @return the value of t_tag.creator
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tag.creator
     *
     * @param creator the value for t_tag.creator
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tag.tag
     *
     * @return the value of t_tag.tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tag.tag
     *
     * @param tag the value for t_tag.tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }
}