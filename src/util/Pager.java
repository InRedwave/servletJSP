package util;
import lombok.Data;

@Data
public class Pager {
	private int totalRows; // 전체 행수
	private int totalPageNo; // 전체 페이지 수
	private int totalGroupNo; // 전체 그룹 수
	private int startPageNo; // 그룹의 시작 페이지 번호
	private int endPageNo; // 그룹의 끝 페이지 번호
	private int pageNo; // 현재 페이지 번호
	private int pagesPerGroup; // 그룹당 페이지 수
	private int groupNo; // 현재 그룹 번호
	private int rowsPerPage; // 페이지당 행 수
	private int startRowNo; // 페이지의 시작 행 번호(1, ..., n)
	private int startRowIndex; // 페이지의 시작 행 인덱스(0, ..., n-1) for mysql
	private int endRowNo; // 페이지의 마지막 행 번호
	private int endRowIndex; // 페이지의 마지막 행 인덱스

	public Pager() {
	}

	public Pager(int rowsPerPage, int pagesPerGroup, int totalRows, int pageNo) {
		// rowsPerPage 한 페이지에 나올 행수
		// pagesPerGroup : 5개씩 (1, 2, 3, 4 5)
		// totalRows -> DAO에서 return 해줘야함.
		// PageNo 보고 싶은 페이지 수(클라이언트가 입력)
		this.rowsPerPage = rowsPerPage;
		this.pagesPerGroup = pagesPerGroup;
		this.totalRows = totalRows;
		this.pageNo = pageNo;

		totalPageNo = totalRows / rowsPerPage;
		if (totalRows % rowsPerPage != 0)
			totalPageNo++;

		totalGroupNo = totalPageNo / pagesPerGroup;
		if (totalPageNo % pagesPerGroup != 0)
			totalGroupNo++;

		groupNo = (pageNo - 1) / pagesPerGroup + 1;

		startPageNo = (groupNo - 1) * pagesPerGroup + 1;

		endPageNo = startPageNo + pagesPerGroup - 1;
		if (groupNo == totalGroupNo)
			endPageNo = totalPageNo;

		startRowNo = (pageNo - 1) * rowsPerPage + 1;
		startRowIndex = startRowNo - 1;
		endRowNo = pageNo * rowsPerPage;
		endRowIndex = endRowNo - 1;
	}

	public void calPage() {
		totalPageNo = totalRows / rowsPerPage;
		if (totalRows % rowsPerPage != 0)
			totalPageNo++;

		totalGroupNo = totalPageNo / pagesPerGroup;
		if (totalPageNo % pagesPerGroup != 0)
			totalGroupNo++;

		groupNo = (pageNo - 1) / pagesPerGroup + 1;

		startPageNo = (groupNo - 1) * pagesPerGroup + 1;

		endPageNo = startPageNo + pagesPerGroup - 1;
		if (groupNo == totalGroupNo)
			endPageNo = totalPageNo;

		startRowNo = (pageNo - 1) * rowsPerPage + 1;
		startRowIndex = startRowNo - 1;
		endRowNo = pageNo * rowsPerPage;
		endRowIndex = endRowNo - 1;
	}
		
}
