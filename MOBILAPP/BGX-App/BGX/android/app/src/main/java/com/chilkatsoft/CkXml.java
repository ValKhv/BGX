/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkXml {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkXml(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkXml obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkXml(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkXml() {
    this(chilkatJNI.new_CkXml(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkXml_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkXml_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkXml_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean get_Cdata() {
    return chilkatJNI.CkXml_get_Cdata(swigCPtr, this);
  }

  public void put_Cdata(boolean newVal) {
    chilkatJNI.CkXml_put_Cdata(swigCPtr, this, newVal);
  }

  public void get_Content(CkString str) {
    chilkatJNI.CkXml_get_Content(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String content() {
    return chilkatJNI.CkXml_content(swigCPtr, this);
  }

  public void put_Content(String newVal) {
    chilkatJNI.CkXml_put_Content(swigCPtr, this, newVal);
  }

  public int get_ContentInt() {
    return chilkatJNI.CkXml_get_ContentInt(swigCPtr, this);
  }

  public void put_ContentInt(int newVal) {
    chilkatJNI.CkXml_put_ContentInt(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkXml_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkXml_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkXml_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_DocType(CkString str) {
    chilkatJNI.CkXml_get_DocType(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String docType() {
    return chilkatJNI.CkXml_docType(swigCPtr, this);
  }

  public void put_DocType(String newVal) {
    chilkatJNI.CkXml_put_DocType(swigCPtr, this, newVal);
  }

  public boolean get_EmitBom() {
    return chilkatJNI.CkXml_get_EmitBom(swigCPtr, this);
  }

  public void put_EmitBom(boolean newVal) {
    chilkatJNI.CkXml_put_EmitBom(swigCPtr, this, newVal);
  }

  public boolean get_EmitCompact() {
    return chilkatJNI.CkXml_get_EmitCompact(swigCPtr, this);
  }

  public void put_EmitCompact(boolean newVal) {
    chilkatJNI.CkXml_put_EmitCompact(swigCPtr, this, newVal);
  }

  public boolean get_EmitXmlDecl() {
    return chilkatJNI.CkXml_get_EmitXmlDecl(swigCPtr, this);
  }

  public void put_EmitXmlDecl(boolean newVal) {
    chilkatJNI.CkXml_put_EmitXmlDecl(swigCPtr, this, newVal);
  }

  public void get_Encoding(CkString str) {
    chilkatJNI.CkXml_get_Encoding(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String encoding() {
    return chilkatJNI.CkXml_encoding(swigCPtr, this);
  }

  public void put_Encoding(String newVal) {
    chilkatJNI.CkXml_put_Encoding(swigCPtr, this, newVal);
  }

  public int get_I() {
    return chilkatJNI.CkXml_get_I(swigCPtr, this);
  }

  public void put_I(int newVal) {
    chilkatJNI.CkXml_put_I(swigCPtr, this, newVal);
  }

  public int get_J() {
    return chilkatJNI.CkXml_get_J(swigCPtr, this);
  }

  public void put_J(int newVal) {
    chilkatJNI.CkXml_put_J(swigCPtr, this, newVal);
  }

  public int get_K() {
    return chilkatJNI.CkXml_get_K(swigCPtr, this);
  }

  public void put_K(int newVal) {
    chilkatJNI.CkXml_put_K(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkXml_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkXml_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkXml_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkXml_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkXml_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkXml_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkXml_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkXml_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public int get_NumAttributes() {
    return chilkatJNI.CkXml_get_NumAttributes(swigCPtr, this);
  }

  public int get_NumChildren() {
    return chilkatJNI.CkXml_get_NumChildren(swigCPtr, this);
  }

  public boolean get_SortCaseInsensitive() {
    return chilkatJNI.CkXml_get_SortCaseInsensitive(swigCPtr, this);
  }

  public void put_SortCaseInsensitive(boolean newVal) {
    chilkatJNI.CkXml_put_SortCaseInsensitive(swigCPtr, this, newVal);
  }

  public boolean get_Standalone() {
    return chilkatJNI.CkXml_get_Standalone(swigCPtr, this);
  }

  public void put_Standalone(boolean newVal) {
    chilkatJNI.CkXml_put_Standalone(swigCPtr, this, newVal);
  }

  public void get_Tag(CkString str) {
    chilkatJNI.CkXml_get_Tag(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String tag() {
    return chilkatJNI.CkXml_tag(swigCPtr, this);
  }

  public void put_Tag(String newVal) {
    chilkatJNI.CkXml_put_Tag(swigCPtr, this, newVal);
  }

  public int get_TreeId() {
    return chilkatJNI.CkXml_get_TreeId(swigCPtr, this);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkXml_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkXml_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkXml_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkXml_version(swigCPtr, this);
  }

  public boolean AccumulateTagContent(String tag, String skipTags, CkString outStr) {
    return chilkatJNI.CkXml_AccumulateTagContent(swigCPtr, this, tag, skipTags, CkString.getCPtr(outStr), outStr);
  }

  public String accumulateTagContent(String tag, String skipTags) {
    return chilkatJNI.CkXml_accumulateTagContent(swigCPtr, this, tag, skipTags);
  }

  public boolean AddAttribute(String name, String value) {
    return chilkatJNI.CkXml_AddAttribute(swigCPtr, this, name, value);
  }

  public boolean AddAttributeInt(String name, int value) {
    return chilkatJNI.CkXml_AddAttributeInt(swigCPtr, this, name, value);
  }

  public boolean AddChildTree(CkXml tree) {
    return chilkatJNI.CkXml_AddChildTree(swigCPtr, this, CkXml.getCPtr(tree), tree);
  }

  public void AddOrUpdateAttribute(String name, String value) {
    chilkatJNI.CkXml_AddOrUpdateAttribute(swigCPtr, this, name, value);
  }

  public void AddOrUpdateAttributeI(String name, int value) {
    chilkatJNI.CkXml_AddOrUpdateAttributeI(swigCPtr, this, name, value);
  }

  public void AddStyleSheet(String styleSheet) {
    chilkatJNI.CkXml_AddStyleSheet(swigCPtr, this, styleSheet);
  }

  public void AddToAttribute(String name, int amount) {
    chilkatJNI.CkXml_AddToAttribute(swigCPtr, this, name, amount);
  }

  public void AddToChildContent(String tag, int amount) {
    chilkatJNI.CkXml_AddToChildContent(swigCPtr, this, tag, amount);
  }

  public void AddToContent(int amount) {
    chilkatJNI.CkXml_AddToContent(swigCPtr, this, amount);
  }

  public boolean AppendToContent(String str) {
    return chilkatJNI.CkXml_AppendToContent(swigCPtr, this, str);
  }

  public boolean BEncodeContent(String charset, CkByteData inData) {
    return chilkatJNI.CkXml_BEncodeContent(swigCPtr, this, charset, CkByteData.getCPtr(inData), inData);
  }

  public boolean ChildContentMatches(String tagPath, String pattern, boolean caseSensitive) {
    return chilkatJNI.CkXml_ChildContentMatches(swigCPtr, this, tagPath, pattern, caseSensitive);
  }

  public boolean ChilkatPath(String pathCmd, CkString outStr) {
    return chilkatJNI.CkXml_ChilkatPath(swigCPtr, this, pathCmd, CkString.getCPtr(outStr), outStr);
  }

  public String chilkatPath(String pathCmd) {
    return chilkatJNI.CkXml_chilkatPath(swigCPtr, this, pathCmd);
  }

  public void Clear() {
    chilkatJNI.CkXml_Clear(swigCPtr, this);
  }

  public boolean ContentMatches(String pattern, boolean caseSensitive) {
    return chilkatJNI.CkXml_ContentMatches(swigCPtr, this, pattern, caseSensitive);
  }

  public void Copy(CkXml node) {
    chilkatJNI.CkXml_Copy(swigCPtr, this, CkXml.getCPtr(node), node);
  }

  public void CopyRef(CkXml copyFromNode) {
    chilkatJNI.CkXml_CopyRef(swigCPtr, this, CkXml.getCPtr(copyFromNode), copyFromNode);
  }

  public boolean DecodeContent(CkByteData outData) {
    return chilkatJNI.CkXml_DecodeContent(swigCPtr, this, CkByteData.getCPtr(outData), outData);
  }

  public boolean DecodeEntities(String str, CkString outStr) {
    return chilkatJNI.CkXml_DecodeEntities(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String decodeEntities(String str) {
    return chilkatJNI.CkXml_decodeEntities(swigCPtr, this, str);
  }

  public boolean DecryptContent(String password) {
    return chilkatJNI.CkXml_DecryptContent(swigCPtr, this, password);
  }

  public boolean EncryptContent(String password) {
    return chilkatJNI.CkXml_EncryptContent(swigCPtr, this, password);
  }

  public CkXml ExtractChildByIndex(int index) {
    long cPtr = chilkatJNI.CkXml_ExtractChildByIndex(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public CkXml ExtractChildByName(String tagPath, String attrName, String attrValue) {
    long cPtr = chilkatJNI.CkXml_ExtractChildByName(swigCPtr, this, tagPath, attrName, attrValue);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public CkXml FindChild(String tagPath) {
    long cPtr = chilkatJNI.CkXml_FindChild(swigCPtr, this, tagPath);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean FindChild2(String tagPath) {
    return chilkatJNI.CkXml_FindChild2(swigCPtr, this, tagPath);
  }

  public CkXml FindNextRecord(String tagPath, String contentPattern) {
    long cPtr = chilkatJNI.CkXml_FindNextRecord(swigCPtr, this, tagPath, contentPattern);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public CkXml FindOrAddNewChild(String tagPath) {
    long cPtr = chilkatJNI.CkXml_FindOrAddNewChild(swigCPtr, this, tagPath);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public CkXml FirstChild() {
    long cPtr = chilkatJNI.CkXml_FirstChild(swigCPtr, this);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean FirstChild2() {
    return chilkatJNI.CkXml_FirstChild2(swigCPtr, this);
  }

  public boolean GetAttributeName(int index, CkString outStr) {
    return chilkatJNI.CkXml_GetAttributeName(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getAttributeName(int index) {
    return chilkatJNI.CkXml_getAttributeName(swigCPtr, this, index);
  }

  public String attributeName(int index) {
    return chilkatJNI.CkXml_attributeName(swigCPtr, this, index);
  }

  public boolean GetAttributeValue(int index, CkString outStr) {
    return chilkatJNI.CkXml_GetAttributeValue(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getAttributeValue(int index) {
    return chilkatJNI.CkXml_getAttributeValue(swigCPtr, this, index);
  }

  public String attributeValue(int index) {
    return chilkatJNI.CkXml_attributeValue(swigCPtr, this, index);
  }

  public int GetAttributeValueInt(int index) {
    return chilkatJNI.CkXml_GetAttributeValueInt(swigCPtr, this, index);
  }

  public boolean GetAttrValue(String name, CkString outStr) {
    return chilkatJNI.CkXml_GetAttrValue(swigCPtr, this, name, CkString.getCPtr(outStr), outStr);
  }

  public String getAttrValue(String name) {
    return chilkatJNI.CkXml_getAttrValue(swigCPtr, this, name);
  }

  public String attrValue(String name) {
    return chilkatJNI.CkXml_attrValue(swigCPtr, this, name);
  }

  public int GetAttrValueInt(String name) {
    return chilkatJNI.CkXml_GetAttrValueInt(swigCPtr, this, name);
  }

  public boolean GetBinaryContent(boolean unzipFlag, boolean decryptFlag, String password, CkByteData outData) {
    return chilkatJNI.CkXml_GetBinaryContent(swigCPtr, this, unzipFlag, decryptFlag, password, CkByteData.getCPtr(outData), outData);
  }

  public CkXml GetChild(int index) {
    long cPtr = chilkatJNI.CkXml_GetChild(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean GetChild2(int index) {
    return chilkatJNI.CkXml_GetChild2(swigCPtr, this, index);
  }

  public boolean GetChildBoolValue(String tagPath) {
    return chilkatJNI.CkXml_GetChildBoolValue(swigCPtr, this, tagPath);
  }

  public boolean GetChildContent(String tagPath, CkString outStr) {
    return chilkatJNI.CkXml_GetChildContent(swigCPtr, this, tagPath, CkString.getCPtr(outStr), outStr);
  }

  public String getChildContent(String tagPath) {
    return chilkatJNI.CkXml_getChildContent(swigCPtr, this, tagPath);
  }

  public String childContent(String tagPath) {
    return chilkatJNI.CkXml_childContent(swigCPtr, this, tagPath);
  }

  public boolean GetChildContentByIndex(int index, CkString outStr) {
    return chilkatJNI.CkXml_GetChildContentByIndex(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getChildContentByIndex(int index) {
    return chilkatJNI.CkXml_getChildContentByIndex(swigCPtr, this, index);
  }

  public String childContentByIndex(int index) {
    return chilkatJNI.CkXml_childContentByIndex(swigCPtr, this, index);
  }

  public CkXml GetChildExact(String tag, String content) {
    long cPtr = chilkatJNI.CkXml_GetChildExact(swigCPtr, this, tag, content);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public int GetChildIntValue(String tagPath) {
    return chilkatJNI.CkXml_GetChildIntValue(swigCPtr, this, tagPath);
  }

  public boolean GetChildTag(int index, CkString outStr) {
    return chilkatJNI.CkXml_GetChildTag(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getChildTag(int index) {
    return chilkatJNI.CkXml_getChildTag(swigCPtr, this, index);
  }

  public String childTag(int index) {
    return chilkatJNI.CkXml_childTag(swigCPtr, this, index);
  }

  public boolean GetChildTagByIndex(int index, CkString outStr) {
    return chilkatJNI.CkXml_GetChildTagByIndex(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getChildTagByIndex(int index) {
    return chilkatJNI.CkXml_getChildTagByIndex(swigCPtr, this, index);
  }

  public String childTagByIndex(int index) {
    return chilkatJNI.CkXml_childTagByIndex(swigCPtr, this, index);
  }

  public CkXml GetChildWithAttr(String tagPath, String attrName, String attrValue) {
    long cPtr = chilkatJNI.CkXml_GetChildWithAttr(swigCPtr, this, tagPath, attrName, attrValue);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public CkXml GetChildWithContent(String content) {
    long cPtr = chilkatJNI.CkXml_GetChildWithContent(swigCPtr, this, content);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public CkXml GetChildWithTag(String tagPath) {
    long cPtr = chilkatJNI.CkXml_GetChildWithTag(swigCPtr, this, tagPath);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public CkXml GetNthChildWithTag(String tag, int n) {
    long cPtr = chilkatJNI.CkXml_GetNthChildWithTag(swigCPtr, this, tag, n);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean GetNthChildWithTag2(String tag, int n) {
    return chilkatJNI.CkXml_GetNthChildWithTag2(swigCPtr, this, tag, n);
  }

  public CkXml GetParent() {
    long cPtr = chilkatJNI.CkXml_GetParent(swigCPtr, this);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean GetParent2() {
    return chilkatJNI.CkXml_GetParent2(swigCPtr, this);
  }

  public CkXml GetRoot() {
    long cPtr = chilkatJNI.CkXml_GetRoot(swigCPtr, this);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public void GetRoot2() {
    chilkatJNI.CkXml_GetRoot2(swigCPtr, this);
  }

  public CkXml GetSelf() {
    long cPtr = chilkatJNI.CkXml_GetSelf(swigCPtr, this);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean GetXml(CkString outStr) {
    return chilkatJNI.CkXml_GetXml(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getXml() {
    return chilkatJNI.CkXml_getXml(swigCPtr, this);
  }

  public String xml() {
    return chilkatJNI.CkXml_xml(swigCPtr, this);
  }

  public boolean GetXmlSb(CkStringBuilder sb) {
    return chilkatJNI.CkXml_GetXmlSb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
  }

  public boolean HasAttribute(String name) {
    return chilkatJNI.CkXml_HasAttribute(swigCPtr, this, name);
  }

  public boolean HasAttrWithValue(String name, String value) {
    return chilkatJNI.CkXml_HasAttrWithValue(swigCPtr, this, name, value);
  }

  public boolean HasChildWithContent(String content) {
    return chilkatJNI.CkXml_HasChildWithContent(swigCPtr, this, content);
  }

  public boolean HasChildWithTag(String tagPath) {
    return chilkatJNI.CkXml_HasChildWithTag(swigCPtr, this, tagPath);
  }

  public boolean HasChildWithTagAndContent(String tagPath, String content) {
    return chilkatJNI.CkXml_HasChildWithTagAndContent(swigCPtr, this, tagPath, content);
  }

  public void InsertChildTreeAfter(int index, CkXml tree) {
    chilkatJNI.CkXml_InsertChildTreeAfter(swigCPtr, this, index, CkXml.getCPtr(tree), tree);
  }

  public void InsertChildTreeBefore(int index, CkXml tree) {
    chilkatJNI.CkXml_InsertChildTreeBefore(swigCPtr, this, index, CkXml.getCPtr(tree), tree);
  }

  public CkXml LastChild() {
    long cPtr = chilkatJNI.CkXml_LastChild(swigCPtr, this);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean LastChild2() {
    return chilkatJNI.CkXml_LastChild2(swigCPtr, this);
  }

  public boolean LoadSb(CkStringBuilder sb, boolean autoTrim) {
    return chilkatJNI.CkXml_LoadSb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb, autoTrim);
  }

  public boolean LoadXml(String xmlData) {
    return chilkatJNI.CkXml_LoadXml(swigCPtr, this, xmlData);
  }

  public boolean LoadXml2(String xmlData, boolean autoTrim) {
    return chilkatJNI.CkXml_LoadXml2(swigCPtr, this, xmlData, autoTrim);
  }

  public boolean LoadXmlFile(String fileName) {
    return chilkatJNI.CkXml_LoadXmlFile(swigCPtr, this, fileName);
  }

  public boolean LoadXmlFile2(String fileName, boolean autoTrim) {
    return chilkatJNI.CkXml_LoadXmlFile2(swigCPtr, this, fileName, autoTrim);
  }

  public CkXml NewChild(String tagPath, String content) {
    long cPtr = chilkatJNI.CkXml_NewChild(swigCPtr, this, tagPath, content);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public void NewChild2(String tagPath, String content) {
    chilkatJNI.CkXml_NewChild2(swigCPtr, this, tagPath, content);
  }

  public CkXml NewChildAfter(int index, String tag, String content) {
    long cPtr = chilkatJNI.CkXml_NewChildAfter(swigCPtr, this, index, tag, content);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public CkXml NewChildBefore(int index, String tag, String content) {
    long cPtr = chilkatJNI.CkXml_NewChildBefore(swigCPtr, this, index, tag, content);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public void NewChildInt2(String tagPath, int value) {
    chilkatJNI.CkXml_NewChildInt2(swigCPtr, this, tagPath, value);
  }

  public CkXml NextSibling() {
    long cPtr = chilkatJNI.CkXml_NextSibling(swigCPtr, this);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean NextSibling2() {
    return chilkatJNI.CkXml_NextSibling2(swigCPtr, this);
  }

  public int NumChildrenAt(String tagPath) {
    return chilkatJNI.CkXml_NumChildrenAt(swigCPtr, this, tagPath);
  }

  public int NumChildrenHavingTag(String tag) {
    return chilkatJNI.CkXml_NumChildrenHavingTag(swigCPtr, this, tag);
  }

  public CkXml PreviousSibling() {
    long cPtr = chilkatJNI.CkXml_PreviousSibling(swigCPtr, this);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean PreviousSibling2() {
    return chilkatJNI.CkXml_PreviousSibling2(swigCPtr, this);
  }

  public boolean QEncodeContent(String charset, CkByteData inData) {
    return chilkatJNI.CkXml_QEncodeContent(swigCPtr, this, charset, CkByteData.getCPtr(inData), inData);
  }

  public boolean RemoveAllAttributes() {
    return chilkatJNI.CkXml_RemoveAllAttributes(swigCPtr, this);
  }

  public void RemoveAllChildren() {
    chilkatJNI.CkXml_RemoveAllChildren(swigCPtr, this);
  }

  public boolean RemoveAttribute(String name) {
    return chilkatJNI.CkXml_RemoveAttribute(swigCPtr, this, name);
  }

  public void RemoveChild(String tagPath) {
    chilkatJNI.CkXml_RemoveChild(swigCPtr, this, tagPath);
  }

  public void RemoveChildByIndex(int index) {
    chilkatJNI.CkXml_RemoveChildByIndex(swigCPtr, this, index);
  }

  public void RemoveChildWithContent(String content) {
    chilkatJNI.CkXml_RemoveChildWithContent(swigCPtr, this, content);
  }

  public void RemoveFromTree() {
    chilkatJNI.CkXml_RemoveFromTree(swigCPtr, this);
  }

  public boolean SaveBinaryContent(String filename, boolean unzipFlag, boolean decryptFlag, String password) {
    return chilkatJNI.CkXml_SaveBinaryContent(swigCPtr, this, filename, unzipFlag, decryptFlag, password);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkXml_SaveLastError(swigCPtr, this, path);
  }

  public boolean SaveXml(String fileName) {
    return chilkatJNI.CkXml_SaveXml(swigCPtr, this, fileName);
  }

  public CkXml SearchAllForContent(CkXml afterPtr, String contentPattern) {
    long cPtr = chilkatJNI.CkXml_SearchAllForContent(swigCPtr, this, CkXml.getCPtr(afterPtr), afterPtr, contentPattern);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean SearchAllForContent2(CkXml afterPtr, String contentPattern) {
    return chilkatJNI.CkXml_SearchAllForContent2(swigCPtr, this, CkXml.getCPtr(afterPtr), afterPtr, contentPattern);
  }

  public CkXml SearchForAttribute(CkXml afterPtr, String tag, String attr, String valuePattern) {
    long cPtr = chilkatJNI.CkXml_SearchForAttribute(swigCPtr, this, CkXml.getCPtr(afterPtr), afterPtr, tag, attr, valuePattern);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean SearchForAttribute2(CkXml afterPtr, String tag, String attr, String valuePattern) {
    return chilkatJNI.CkXml_SearchForAttribute2(swigCPtr, this, CkXml.getCPtr(afterPtr), afterPtr, tag, attr, valuePattern);
  }

  public CkXml SearchForContent(CkXml afterPtr, String tag, String contentPattern) {
    long cPtr = chilkatJNI.CkXml_SearchForContent(swigCPtr, this, CkXml.getCPtr(afterPtr), afterPtr, tag, contentPattern);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean SearchForContent2(CkXml afterPtr, String tag, String contentPattern) {
    return chilkatJNI.CkXml_SearchForContent2(swigCPtr, this, CkXml.getCPtr(afterPtr), afterPtr, tag, contentPattern);
  }

  public CkXml SearchForTag(CkXml afterPtr, String tag) {
    long cPtr = chilkatJNI.CkXml_SearchForTag(swigCPtr, this, CkXml.getCPtr(afterPtr), afterPtr, tag);
    return (cPtr == 0) ? null : new CkXml(cPtr, true);
  }

  public boolean SearchForTag2(CkXml afterPtr, String tag) {
    return chilkatJNI.CkXml_SearchForTag2(swigCPtr, this, CkXml.getCPtr(afterPtr), afterPtr, tag);
  }

  public boolean SetBinaryContent(CkByteData inData, boolean zipFlag, boolean encryptFlag, String password) {
    return chilkatJNI.CkXml_SetBinaryContent(swigCPtr, this, CkByteData.getCPtr(inData), inData, zipFlag, encryptFlag, password);
  }

  public boolean SetBinaryContentFromFile(String filename, boolean zipFlag, boolean encryptFlag, String password) {
    return chilkatJNI.CkXml_SetBinaryContentFromFile(swigCPtr, this, filename, zipFlag, encryptFlag, password);
  }

  public void SortByAttribute(String attrName, boolean ascending) {
    chilkatJNI.CkXml_SortByAttribute(swigCPtr, this, attrName, ascending);
  }

  public void SortByAttributeInt(String attrName, boolean ascending) {
    chilkatJNI.CkXml_SortByAttributeInt(swigCPtr, this, attrName, ascending);
  }

  public void SortByContent(boolean ascending) {
    chilkatJNI.CkXml_SortByContent(swigCPtr, this, ascending);
  }

  public void SortByTag(boolean ascending) {
    chilkatJNI.CkXml_SortByTag(swigCPtr, this, ascending);
  }

  public void SortRecordsByAttribute(String sortTag, String attrName, boolean ascending) {
    chilkatJNI.CkXml_SortRecordsByAttribute(swigCPtr, this, sortTag, attrName, ascending);
  }

  public void SortRecordsByContent(String sortTag, boolean ascending) {
    chilkatJNI.CkXml_SortRecordsByContent(swigCPtr, this, sortTag, ascending);
  }

  public void SortRecordsByContentInt(String sortTag, boolean ascending) {
    chilkatJNI.CkXml_SortRecordsByContentInt(swigCPtr, this, sortTag, ascending);
  }

  public boolean SwapNode(CkXml node) {
    return chilkatJNI.CkXml_SwapNode(swigCPtr, this, CkXml.getCPtr(node), node);
  }

  public boolean SwapTree(CkXml tree) {
    return chilkatJNI.CkXml_SwapTree(swigCPtr, this, CkXml.getCPtr(tree), tree);
  }

  public boolean TagContent(String tagName, CkString outStr) {
    return chilkatJNI.CkXml_TagContent(swigCPtr, this, tagName, CkString.getCPtr(outStr), outStr);
  }

  public String tagContent(String tagName) {
    return chilkatJNI.CkXml_tagContent(swigCPtr, this, tagName);
  }

  public boolean TagEquals(String tag) {
    return chilkatJNI.CkXml_TagEquals(swigCPtr, this, tag);
  }

  public boolean UnzipContent() {
    return chilkatJNI.CkXml_UnzipContent(swigCPtr, this);
  }

  public boolean UnzipTree() {
    return chilkatJNI.CkXml_UnzipTree(swigCPtr, this);
  }

  public boolean UpdateAt(String tagPath, boolean autoCreate, String value) {
    return chilkatJNI.CkXml_UpdateAt(swigCPtr, this, tagPath, autoCreate, value);
  }

  public boolean UpdateAttrAt(String tagPath, boolean autoCreate, String attrName, String attrValue) {
    return chilkatJNI.CkXml_UpdateAttrAt(swigCPtr, this, tagPath, autoCreate, attrName, attrValue);
  }

  public boolean UpdateAttribute(String attrName, String attrValue) {
    return chilkatJNI.CkXml_UpdateAttribute(swigCPtr, this, attrName, attrValue);
  }

  public boolean UpdateAttributeInt(String attrName, int value) {
    return chilkatJNI.CkXml_UpdateAttributeInt(swigCPtr, this, attrName, value);
  }

  public void UpdateChildContent(String tagPath, String value) {
    chilkatJNI.CkXml_UpdateChildContent(swigCPtr, this, tagPath, value);
  }

  public void UpdateChildContentInt(String tagPath, int value) {
    chilkatJNI.CkXml_UpdateChildContentInt(swigCPtr, this, tagPath, value);
  }

  public boolean ZipContent() {
    return chilkatJNI.CkXml_ZipContent(swigCPtr, this);
  }

  public boolean ZipTree() {
    return chilkatJNI.CkXml_ZipTree(swigCPtr, this);
  }

}
