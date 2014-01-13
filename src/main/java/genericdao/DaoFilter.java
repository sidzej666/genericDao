package genericdao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DaoFilter {
	private List<String> projection;
	private List<Selection> selection;
	private Paging paging;
	private List<String> fetch;
	private List<String> sorting;
	
	public DaoFilter() {
	}
	
	public void addProjection(String columnName) {
		getProjection().add(columnName);
	}
	
	public void addProjection(String[] columnNames) {
		getProjection().addAll(Arrays.asList(columnNames));
	}
	
	public void addFetch(String fetchString) {
		getFetch().add(fetchString);
	}
	
	public void addFetch(String[] fetchStrings) {
		getFetch().addAll(Arrays.asList(fetchStrings));
	}
	
	public void addLimit(int limit) {
		getPaging().setLimit(limit);
	}
	
	public void addOffset(int offset) {
		getPaging().setOffset(offset);
	}
	
	public void addSorting(String sortingColumn) {
		
	}

	private List<String> getProjection() {
		if (projection == null) {
			projection = new ArrayList<String>();
		}
		return projection;
	}
	
	private List<String> getFetch() {
		if (fetch == null) {
			fetch = new ArrayList<String>();
		}
		return fetch;
	}
	
	private Paging getPaging() {
		if (paging == null) {
			paging = new Paging();
		}
		return paging;
	}
	
	private List<String> getSorting() {
		if (sorting == null) {
			sorting = new ArrayList<String>();
		}
		return sorting;
	}
}
