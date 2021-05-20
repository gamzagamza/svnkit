package io.gamzagamza.svnkit.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import io.gamzagamza.svnkit.vo.SvnConnectionVO;
import org.tmatesoft.svn.core.SVNException;

public interface SvnkitService {
	public String svnConnectionTest(SvnConnectionVO svnConnectionVO);
	public String svnConnection(SvnConnectionVO svnConnectionVO);
	public String svnLastRevision() throws SVNException;
	public List<String> getDeduplicationFilePath(Long startRevision, Long endRevision) throws SVNException;
	public void batDownload(Long startRevision, Long endRevision, List<String> projectList, List<String> pathList, HttpServletResponse response) throws SVNException;
}
