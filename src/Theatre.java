import java.util.*;

public class Theatre {

	private int theatreNumber;
	private String description;
	private int rowCount;
	private ArrayList<Row> rows;
	
	public Theatre (int theatreNumber, String description)
	{
		this.description = description;
		this.theatreNumber = theatreNumber;
		rows = new ArrayList<Row>();
	}
	
	public void createRows(int rowClass, int seatCount, int rowCount)
	{
		for (int i = 1; i <= rowCount; i++)
		{
			rows.add(new Row(rowClass, seatCount, i));
		}
		this.rowCount += rowCount;
	}
	
	public ArrayList<Row> getRows()
	{
		return rows;
	}
	
	public String getDescription()
	{
		return description;
	}
	
}
