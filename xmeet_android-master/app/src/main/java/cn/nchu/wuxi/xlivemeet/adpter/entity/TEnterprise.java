package cn.nchu.wuxi.xlivemeet.adpter.entity;

import java.io.Serializable;

public class TEnterprise implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_enterprise.enterprise_id
     *
     * @mbg.generated Tue Apr 14 18:42:36 CST 2020
     */
    private Integer enterpriseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_enterprise.enterprise_name
     *
     * @mbg.generated Tue Apr 14 18:42:36 CST 2020
     */
    private String enterpriseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_enterprise.manager_phone
     *
     * @mbg.generated Tue Apr 14 18:42:36 CST 2020
     */
    private String managerPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_enterprise
     *
     * @mbg.generated Tue Apr 14 18:42:36 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_enterprise.enterprise_id
     *
     * @return the value of t_enterprise.enterprise_id
     *
     * @mbg.generated Tue Apr 14 18:42:36 CST 2020
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_enterprise.enterprise_id
     *
     * @param enterpriseId the value for t_enterprise.enterprise_id
     *
     * @mbg.generated Tue Apr 14 18:42:36 CST 2020
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_enterprise.enterprise_name
     *
     * @return the value of t_enterprise.enterprise_name
     *
     * @mbg.generated Tue Apr 14 18:42:36 CST 2020
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_enterprise.enterprise_name
     *
     * @param enterpriseName the value for t_enterprise.enterprise_name
     *
     * @mbg.generated Tue Apr 14 18:42:36 CST 2020
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_enterprise.manager_phone
     *
     * @return the value of t_enterprise.manager_phone
     *
     * @mbg.generated Tue Apr 14 18:42:36 CST 2020
     */
    public String getManagerPhone() {
        return managerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_enterprise.manager_phone
     *
     * @param managerPhone the value for t_enterprise.manager_phone
     *
     * @mbg.generated Tue Apr 14 18:42:36 CST 2020
     */
    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    @Override
    public String toString() {
        return "TEnterprise{" +
                "enterpriseId=" + enterpriseId +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", managerPhone='" + managerPhone + '\'' +
                '}';
    }
}