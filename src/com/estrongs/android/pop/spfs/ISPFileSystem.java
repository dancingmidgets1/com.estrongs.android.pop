package com.estrongs.android.pop.spfs;

import com.estrongs.android.pop.netfs.INetRefreshCallback;
import com.estrongs.android.util.TypedMap;
import com.gmail.yuyang226.flickr.a;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

public abstract interface ISPFileSystem
{
  public static final String PARAMETER_ALBUMS_SELECTED = "albums_selected";
  public static final String PARAMETER_ALBUM_NEW = "albums_new";
  public static final String PARAMETER_DESCRIPTION = "description";
  public static final String PARAMETER_SETS = "sets";
  public static final String PARAMETER_SETS_DELETE = "sets_delete";
  public static final String PARAMETER_TAGS = "tags";
  public static final String PARAMETER_TITLE = "title";
  public static final String PRIVACY_IS_FAMILY = "is_family";
  public static final String PRIVACY_IS_FRIEND = "is_friend";
  public static final String PRIVACY_IS_PUBLIC = "is_public";
  public static final int REG_ERROR = 100;
  public static final int REG_NAME_EXISTED = 2;
  public static final int REG_SUCCESS = 0;
  public static final int REG_WRONG_VERF_CODE = 1;
  
  public abstract boolean addServer(String paramString1, String paramString2);
  
  public abstract boolean copyFile(String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract boolean createFile(String paramString1, String paramString2, String paramString3, boolean paramBoolean);
  
  public abstract void delServer(String paramString1, String paramString2);
  
  public abstract boolean deleteFile(String paramString1, String paramString2, String paramString3);
  
  public abstract boolean exists(String paramString1, String paramString2, String paramString3);
  
  public abstract List<a> getAccessTokenParameters(String paramString1, String paramString2, String paramString3);
  
  public abstract URL getAccessTokenUrl();
  
  public abstract SPFileInfo getFileInfo(String paramString1, String paramString2, String paramString3);
  
  public abstract InputStream getFileInputStream(String paramString1, String paramString2, String paramString3, long paramLong);
  
  public abstract long getFileLength(String paramString1, String paramString2, String paramString3);
  
  public abstract OutputStream getFileOutputStream(String paramString1, String paramString2, String paramString3, long paramLong, TypedMap paramTypedMap);
  
  public abstract String getLastErrorString(String paramString);
  
  public abstract String getOAuthLoginUrl(String paramString);
  
  public abstract String getOAuthVersion();
  
  public abstract String getPhotoExtension(String paramString1, String paramString2, String paramString3);
  
  public abstract boolean getRegisterPrepareInfo(Object[] paramArrayOfObject);
  
  public abstract URL getRequestTokenUrl();
  
  public abstract InputStream getThumbnail(String paramString1, String paramString2, String paramString3);
  
  public abstract String getUserLoginName(String paramString);
  
  public abstract boolean isDir(String paramString1, String paramString2, String paramString3);
  
  public abstract Map<String, SPFileInfo> listFiles(String paramString1, String paramString2, String paramString3, boolean paramBoolean, INetRefreshCallback paramINetRefreshCallback, TypedMap paramTypedMap);
  
  public abstract boolean mkDirs(String paramString1, String paramString2, String paramString3);
  
  public abstract boolean moveFile(String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract int register(String paramString1, String paramString2, Object[] paramArrayOfObject);
  
  public abstract boolean renameFile(String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract void saveUserAndToken(String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract void setConfigDir(String paramString1, String paramString2);
  
  public abstract void setPrivateContent(String paramString1, String paramString2, Object paramObject);
}

/* Location:
 * Qualified Name:     com.estrongs.android.pop.spfs.ISPFileSystem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */