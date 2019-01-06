// This is a generated source file for Chilkat version 9.5.0.73
#ifndef _C_CkStringTableWH
#define _C_CkStringTableWH
#include "chilkatDefs.h"

#include "Chilkat_C.h"


CK_VISIBLE_PUBLIC HCkStringTableW CkStringTableW_Create(void);
CK_VISIBLE_PUBLIC void CkStringTableW_Dispose(HCkStringTableW handle);
CK_VISIBLE_PUBLIC int CkStringTableW_getCount(HCkStringTableW cHandle);
CK_VISIBLE_PUBLIC void CkStringTableW_getDebugLogFilePath(HCkStringTableW cHandle, HCkString retval);
CK_VISIBLE_PUBLIC void  CkStringTableW_putDebugLogFilePath(HCkStringTableW cHandle, const wchar_t *newVal);
CK_VISIBLE_PUBLIC const wchar_t *CkStringTableW_getDebugLogFilePath(HCkStringTableW cHandle);
CK_VISIBLE_PUBLIC void CkStringTableW_getLastErrorHtml(HCkStringTableW cHandle, HCkString retval);
CK_VISIBLE_PUBLIC const wchar_t *CkStringTableW_getLastErrorHtml(HCkStringTableW cHandle);
CK_VISIBLE_PUBLIC void CkStringTableW_getLastErrorText(HCkStringTableW cHandle, HCkString retval);
CK_VISIBLE_PUBLIC const wchar_t *CkStringTableW_getLastErrorText(HCkStringTableW cHandle);
CK_VISIBLE_PUBLIC void CkStringTableW_getLastErrorXml(HCkStringTableW cHandle, HCkString retval);
CK_VISIBLE_PUBLIC const wchar_t *CkStringTableW_getLastErrorXml(HCkStringTableW cHandle);
CK_VISIBLE_PUBLIC BOOL CkStringTableW_getLastMethodSuccess(HCkStringTableW cHandle);
CK_VISIBLE_PUBLIC void  CkStringTableW_putLastMethodSuccess(HCkStringTableW cHandle, BOOL newVal);
CK_VISIBLE_PUBLIC BOOL CkStringTableW_getVerboseLogging(HCkStringTableW cHandle);
CK_VISIBLE_PUBLIC void  CkStringTableW_putVerboseLogging(HCkStringTableW cHandle, BOOL newVal);
CK_VISIBLE_PUBLIC void CkStringTableW_getVersion(HCkStringTableW cHandle, HCkString retval);
CK_VISIBLE_PUBLIC const wchar_t *CkStringTableW_getVersion(HCkStringTableW cHandle);
CK_VISIBLE_PUBLIC BOOL CkStringTableW_Append(HCkStringTableW cHandle, const wchar_t *value);
CK_VISIBLE_PUBLIC BOOL CkStringTableW_AppendFromFile(HCkStringTableW cHandle, int maxLineLen, const wchar_t *charset, const wchar_t *path);
CK_VISIBLE_PUBLIC BOOL CkStringTableW_AppendFromSb(HCkStringTableW cHandle, HCkStringBuilderW sb);
CK_VISIBLE_PUBLIC void CkStringTableW_Clear(HCkStringTableW cHandle);
CK_VISIBLE_PUBLIC int CkStringTableW_IntAt(HCkStringTableW cHandle, int index);
CK_VISIBLE_PUBLIC BOOL CkStringTableW_SaveLastError(HCkStringTableW cHandle, const wchar_t *path);
CK_VISIBLE_PUBLIC BOOL CkStringTableW_SaveToFile(HCkStringTableW cHandle, const wchar_t *charset, BOOL bCrlf, const wchar_t *path);
CK_VISIBLE_PUBLIC BOOL CkStringTableW_SplitAndAppend(HCkStringTableW cHandle, const wchar_t *inStr, const wchar_t *delimiterChar, BOOL exceptDoubleQuoted, BOOL exceptEscaped);
CK_VISIBLE_PUBLIC BOOL CkStringTableW_StringAt(HCkStringTableW cHandle, int index, HCkString outStr);
CK_VISIBLE_PUBLIC const wchar_t *CkStringTableW_stringAt(HCkStringTableW cHandle, int index);
#endif
