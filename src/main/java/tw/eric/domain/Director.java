package tw.eric.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "director")
public class Director {

	/**
	 * Director 的 name 欄位沒有標註，那就是對應至 directors 表格的 name 欄位，如果欄位名稱不同，可以使用 @Column
	 * 標註。這邊還標註了 @GeneratedValue(strategy = GenerationType.AUTO)，表示利用資料庫本身的主鍵自動產生策略。
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	
	
	public Director(String name) {
		super();
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
