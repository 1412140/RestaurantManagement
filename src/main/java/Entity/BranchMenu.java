package Entity;
// Generated Dec 14, 2017 4:30:01 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * BranchMenu generated by hbm2java
 */
public class BranchMenu  implements java.io.Serializable {


     private Integer id;
     private int branchId;
     private int menuId;
     private Date createdAt;
     private int delFlag;

    public BranchMenu() {
    }

    public BranchMenu(int branchId, int menuId, Date createdAt, int delFlag) {
       this.branchId = branchId;
       this.menuId = menuId;
       this.createdAt = createdAt;
       this.delFlag = delFlag;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getBranchId() {
        return this.branchId;
    }
    
    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
    public int getMenuId() {
        return this.menuId;
    }
    
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public int getDelFlag() {
        return this.delFlag;
    }
    
    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }




}


