// This is a generated source file for Chilkat version 9.5.0.73
#ifndef _C_CkLogWH
#define _C_CkLogWH
#include "chilkatDefs.h"

#include "Chilkat_C.h"


CK_VISIBLE_PUBLIC HCkLogW CkLogW_Create(void);
CK_VISIBLE_PUBLIC void CkLogW_Dispose(HCkLogW handle);
CK_VISIBLE_PUBLIC void CkLogW_getDebugLogFilePath(HCkLogW cHandle, HCkString retval);
CK_VISIBLE_PUBLIC void  CkLogW_putDebugLogFilePath(HCkLogW cHandle, const wchar_t *newVal);
CK_VISIBLE_PUBLIC const wchar_t *CkLogW_getDebugLogFilePath(HCkLogW cHandle);
CK_VISIBLE_PUBLIC void CkLogW_getLastErrorHtml(HCkLogW cHandle, HCkString retval);
CK_VISIBLE_PUBLIC const wchar_t *CkLogW_getLastErrorHtml(HCkLogW cHandle);
CK_VISIBLE_PUBLIC void CkLogW_getLastErrorText(HCkLogW cHandle, HCkString retval);
CK_VISIBLE_PUBLIC const wchar_t *CkLogW_getLastErrorText(HCkLogW cHandle);
CK_VISIBLE_PUBLIC void CkLogW_getLastErrorXml(HCkLogW cHandle, HCkString retval);
CK_VISIBLE_PUBLIC const wchar_t *CkLogW_getLastErrorXml(HCkLogW cHandle);
CK_VISIBLE_PUBLIC BOOL CkLogW_getLastMethodSuccess(HCkLogW cHandle);
CK_VISIBLE_PUBLIC void  CkLogW_putLastMethodSuccess(HCkLogW cHandle, BOOL newVal);
CK_VISIBLE_PUBLIC BOOL CkLogW_getVerboseLogging(HCkLogW cHandle);
CK_VISIBLE_PUBLIC void  CkLogW_putVerboseLogging(HCkLogW cHandle, BOOL newVal);
CK_VISIBLE_PUBLIC void CkLogW_getVersion(HCkLogW cHandle, HCkString retval);
CK_VISIBLE_PUBLIC const wchar_t *CkLogW_getVersion(HCkLogW cHandle);
CK_VISIBLE_PUBLIC void CkLogW_Clear(HCkLogW cHandle, const wchar_t *initialTag);
CK_VISIBLE_PUBLIC void CkLogW_EnterContext(HCkLogW cHandle, const wchar_t *tag);
CK_VISIBLE_PUBLIC void CkLogW_LeaveContext(HCkLogW cHandle);
CK_VISIBLE_PUBLIC void CkLogW_LogData(HCkLogW cHandle, const wchar_t *tag, const wchar_t *message);
CK_VISIBLE_PUBLIC void CkLogW_LogDataBase64(HCkLogW cHandle, const wchar_t *tag, HCkByteData data);
CK_VISIBLE_PUBLIC void CkLogW_LogDataHex(HCkLogW cHandle, const wchar_t *tag, HCkByteData data);
CK_VISIBLE_PUBLIC void CkLogW_LogDataMax(HCkLogW cHandle, const wchar_t *tag, const wchar_t *message, int maxNumChars);
CK_VISIBLE_PUBLIC void CkLogW_LogDateTime(HCkLogW cHandle, const wchar_t *tag, BOOL gmt);
CK_VISIBLE_PUBLIC void CkLogW_LogError(HCkLogW cHandle, const wchar_t *message);
CK_VISIBLE_PUBLIC void CkLogW_LogInfo(HCkLogW cHandle, const wchar_t *message);
CK_VISIBLE_PUBLIC void CkLogW_LogInt(HCkLogW cHandle, const wchar_t *tag, int value);
CK_VISIBLE_PUBLIC void CkLogW_LogInt64(HCkLogW cHandle, const wchar_t *tag, __int64 value);
CK_VISIBLE_PUBLIC void CkLogW_LogTimestamp(HCkLogW cHandle, const wchar_t *tag);
CK_VISIBLE_PUBLIC BOOL CkLogW_SaveLastError(HCkLogW cHandle, const wchar_t *path);
#endif
