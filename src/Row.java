
public class Row {
	
	private int rowNumber; 
	private int rowClass;
	private int seatCount;

	public Row (int rowClass, int seatCount, int rowNumber)
	{
		this.rowNumber = rowNumber;
		this.rowClass = rowClass;
		this.seatCount = seatCount;
	}
	
	public void setRowClass(int rowClass)
	{
		this.rowClass = rowClass;
	}
	
	public int getRowClass()
	{
		return this.rowClass;
	}
	
	public int getRowNumber()
	{
		return rowNumber;
	}
}
