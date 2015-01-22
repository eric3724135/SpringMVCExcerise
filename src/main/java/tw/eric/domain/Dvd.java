package tw.eric.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dvd")
public class Dvd {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;

	private Integer year;

	private Integer duration;
	
	/** cascade=CascadeType.ALL 表示聯級操作，設定為無論儲存、合併、 更新或移除，一併對被參考物件作出對應動作。 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="director_id")
	private Director director;

	public Dvd(String title, Integer year, Integer duration, Director director) {
		super();
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.director = director;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

}
